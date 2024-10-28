package com.zainco.data.repository

import com.zainco.domain.model.Product
import com.zainco.domain.model.ProductListModel
import com.zainco.domain.network.NetworkService
import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(category: Int?): ResultWrapper<ProductListModel> {
        return networkService.getProducts(category)
    }
}