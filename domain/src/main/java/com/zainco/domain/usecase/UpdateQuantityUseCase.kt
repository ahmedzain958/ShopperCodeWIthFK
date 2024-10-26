package com.zainco.domain.usecase

import com.zainco.domain.model.CartItemModel
import com.zainco.domain.repository.CartRepository

class UpdateQuantityUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemModel: CartItemModel) = cartRepository.updateQuantity(cartItemModel)
}