package com.zainco.data.repository

import com.zainco.domain.network.NetworkService
import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.repository.CategoryRepository

class CategoryRepositoryImpl(private val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<List<String>> {
        return networkService.getCategories()
    }
}