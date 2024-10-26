package com.zainco.domain.usecase

import com.zainco.domain.model.AddressDomainModel
import com.zainco.domain.repository.OrderRepository

class PlaceOrderUseCase(val orderRepository: OrderRepository) {
    suspend fun execute(addressDomainModel: AddressDomainModel) =
        orderRepository.placeOrder(addressDomainModel)
}