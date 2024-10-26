package com.zainco.domain.usecase

import com.zainco.domain.model.request.AddCartRequestModel
import com.zainco.domain.repository.CartRepository

class AddToCartUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(request: AddCartRequestModel) = cartRepository.addProductToCart(request)
}