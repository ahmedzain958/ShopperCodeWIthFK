package com.zainco.domain.repository

import com.zainco.domain.model.AddressDomainModel
import com.zainco.domain.model.OrdersListModel
import com.zainco.domain.network.ResultWrapper

interface OrderRepository {
    suspend fun placeOrder(addressDomainModel: AddressDomainModel): ResultWrapper<Long>
    suspend fun getOrderList(): ResultWrapper<OrdersListModel>
}