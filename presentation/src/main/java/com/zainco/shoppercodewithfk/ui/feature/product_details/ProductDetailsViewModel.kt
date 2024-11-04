package com.zainco.shoppercodewithfk.ui.feature.product_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zainco.domain.model.request.AddCartRequestModel
import com.zainco.domain.usecase.AddToCartUseCase
import com.zainco.shoppercodewithfk.model.UiProductModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductDetailsViewModel(private val addToCartUseCase: AddToCartUseCase) : ViewModel() {

    private val _uiState = MutableStateFlow<ProductDetailsUIEvent>(ProductDetailsUIEvent.Nothing)
    val uiState = _uiState.asStateFlow()
    fun addProductToCart(product: UiProductModel) {
        viewModelScope.launch {
            _uiState.value = ProductDetailsUIEvent.Loading
            val result = addToCartUseCase.execute(
                AddCartRequestModel(
                    productId = product.id,
                    productName = product.title,
                    price = product.price,
                    quantity = 1,
                    userId = 1
                )
            )
            when (result) {
                is com.zainco.domain.network.ResultWrapper.Success -> {
                    _uiState.value = ProductDetailsUIEvent.Success("Added to cart")
                }

                is com.zainco.domain.network.ResultWrapper.Failure -> {
                    _uiState.value = ProductDetailsUIEvent.Error("Failed to add product to cart")
                }
            }
        }
    }
}

sealed class ProductDetailsUIEvent {
    data object Loading : ProductDetailsUIEvent()
    data object Nothing : ProductDetailsUIEvent()
    data class Success(/*val cartModel: CartModel*/ val message: String) :
        ProductDetailsUIEvent()

    data class Error(val message: String) : ProductDetailsUIEvent()
}
