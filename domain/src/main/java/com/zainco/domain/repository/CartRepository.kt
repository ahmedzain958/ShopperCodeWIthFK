package com.zainco.domain.repository

import com.zainco.domain.model.CartItemModel
import com.zainco.domain.model.CartModel
import com.zainco.domain.model.CartSummary
import com.zainco.domain.model.request.AddCartRequestModel
import com.zainco.domain.network.ResultWrapper

interface CartRepository {
    suspend fun addProductToCart(
        request: AddCartRequestModel
    ): ResultWrapper<CartModel>

    suspend fun getCart(): ResultWrapper<CartModel>
    suspend fun updateQuantity(cartItemModel: CartItemModel): ResultWrapper<CartModel>
    suspend fun deleteItem(cartItemId: Int, userId: Int): ResultWrapper<CartModel>
    suspend fun getCartSummary(userId: Int): ResultWrapper<CartSummary>
}