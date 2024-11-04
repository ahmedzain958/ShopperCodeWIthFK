package com.zainco.data.repository

import com.zainco.domain.model.AddressDomainModel
import com.zainco.domain.model.OrdersListModel
import com.zainco.domain.network.NetworkService
import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.repository.OrderRepository
/*

class OrderRepositoryImpl(private val networkService: NetworkService) : OrderRepository {
    override suspend fun placeOrder(addressDomainModel: AddressDomainModel): ResultWrapper<Long> {
        return networkService.placeOrder(addressDomainModel, 1)
    }

    override suspend fun getOrderList(): ResultWrapper<OrdersListModel> {
        return networkService.getOrderList()
    }
}*/
