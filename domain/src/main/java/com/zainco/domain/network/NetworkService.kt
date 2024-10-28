package com.zainco.domain.network

import com.zainco.domain.model.AddressDomainModel
import com.zainco.domain.model.CartItemModel
import com.zainco.domain.model.CartModel
import com.zainco.domain.model.CartSummary
import com.zainco.domain.model.CategoriesListModel
import com.zainco.domain.model.OrdersListModel
import com.zainco.domain.model.Product
import com.zainco.domain.model.ProductListModel
import com.zainco.domain.model.request.AddCartRequestModel

interface NetworkService {
    suspend fun getProducts(category:Int?): ResultWrapper<ProductListModel>
    suspend fun getCategories(): ResultWrapper<CategoriesListModel>

    suspend fun addProductToCart(
        request: AddCartRequestModel
    ): ResultWrapper<CartModel>

    suspend fun getCart(): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel): ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Int): ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Int): ResultWrapper<CartSummary>
    suspend fun placeOrder(address: AddressDomainModel, userId: Int): ResultWrapper<Long>
    suspend fun getOrderList(): ResultWrapper<OrdersListModel>
}

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T) : ResultWrapper<T>()
    data class Failure(val exception: Exception) : ResultWrapper<Nothing>()
}