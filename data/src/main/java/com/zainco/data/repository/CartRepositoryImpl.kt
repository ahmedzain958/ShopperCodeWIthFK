package com.zainco.data.repository

import com.zainco.domain.model.CartItemModel
import com.zainco.domain.model.CartModel
import com.zainco.domain.model.CartSummary
import com.zainco.domain.model.request.AddCartRequestModel
import com.zainco.domain.network.NetworkService
import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.repository.CartRepository

class CartRepositoryImpl(private val networkService: NetworkService) : CartRepository {
    override suspend fun addProductToCart(request: AddCartRequestModel): ResultWrapper<CartModel> {
        return networkService.addProductToCart(request)
    }

    override suspend fun getCart(): ResultWrapper<CartModel> {
        return networkService.getCart()
    }

    override suspend fun updateQuantity(cartItemModel: CartItemModel): ResultWrapper<CartModel> {
        return networkService.updateQuantity(cartItemModel)
    }

    override suspend fun deleteItem(cartItemId: Int, userId: Int): ResultWrapper<CartModel> {
        return networkService.deleteItem(cartItemId, userId)
    }

    override suspend fun getCartSummary(userId: Int): ResultWrapper<CartSummary> {
        return networkService.getCartSummary(userId)
    }
}