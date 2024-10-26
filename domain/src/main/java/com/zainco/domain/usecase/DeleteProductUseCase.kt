package com.zainco.domain.usecase

import com.zainco.domain.model.CartItemModel
import com.zainco.domain.repository.CartRepository

class DeleteProductUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(cartItemId: Int, userId: Int) = cartRepository.deleteItem(cartItemId, userId)
}