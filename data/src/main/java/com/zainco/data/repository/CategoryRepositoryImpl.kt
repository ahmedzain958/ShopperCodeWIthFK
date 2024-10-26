package com.zainco.data.repository

import com.zainco.data.model.CategoryDataModel
import com.zainco.domain.model.CategoriesListModel
import com.zainco.domain.network.NetworkService
import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.repository.CategoryRepository

class CategoryRepositoryImpl(val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<CategoriesListModel> {
        return networkService.getCategories()
    }
}