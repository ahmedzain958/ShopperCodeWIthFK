package com.zainco.domain.repository

import com.zainco.domain.model.CategoriesListModel
import com.zainco.domain.network.ResultWrapper

interface CategoryRepository {
    suspend fun getCategories(): ResultWrapper<CategoriesListModel>
}