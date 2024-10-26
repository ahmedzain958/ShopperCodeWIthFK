package com.zainco.domain.repository

import com.zainco.domain.model.Product
import com.zainco.domain.model.ProductListModel
import com.zainco.domain.network.ResultWrapper

interface ProductRepository {
    suspend fun getProducts(category:Int?): ResultWrapper<ProductListModel>
}