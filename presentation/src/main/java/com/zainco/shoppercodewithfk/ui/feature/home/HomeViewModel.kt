package com.zainco.shoppercodewithfk.ui.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zainco.domain.model.Product
import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.usecase.GetProductUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(private val getProductUseCase: GetProductUseCase) : ViewModel() {
    private val _uiState =
        MutableStateFlow<HomeScreenUIEvents>(HomeScreenUIEvents.Loading)
    val uiState: StateFlow<HomeScreenUIEvents> = _uiState.asStateFlow()

    init {
        getAllProducts()
    }

    private fun getAllProducts() {
        viewModelScope.launch {
            _uiState.value = HomeScreenUIEvents.Loading
            val featured = getProducts("electronics")
            val popularProducts = getProducts("jewelery")
            if (featured.isEmpty() || popularProducts.isEmpty()) {
                _uiState.value = HomeScreenUIEvents.Error("Failed to load products")
                return@launch
            }
            _uiState.value = HomeScreenUIEvents.Success(featured, popularProducts)
        }
    }

    private suspend fun getProducts(category: String?): List<Product> {
        getProductUseCase.execute(category).let { result: ResultWrapper<List<Product>> ->
            when (result) {
                is ResultWrapper.Success -> {
                    val data = result.value
                    return data
                }

                is ResultWrapper.Failure -> {
                    return emptyList()

                }
            }
        }
    }
}

sealed class HomeScreenUIEvents {
    object Loading : HomeScreenUIEvents()
    object NavigateToProductDetail : HomeScreenUIEvents()
    data class Success(val featured: List<Product>, val popularProducts: List<Product>) :
        HomeScreenUIEvents()

    data class Error(val message: String) : HomeScreenUIEvents()
}
