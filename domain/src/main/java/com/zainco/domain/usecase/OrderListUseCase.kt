package com.zainco.domain.usecase

import com.zainco.domain.model.OrdersListModel
import com.zainco.domain.repository.OrderRepository

class OrderListUseCase(
    private val repository: OrderRepository
) {
    suspend fun execute() = repository.getOrderList()
}