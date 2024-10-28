package com.zainco.domain.repository

import com.zainco.domain.network.ResultWrapper
import com.zainco.domain.model.CategoriesListModel

interface CategoryRepository {
     suspend fun getCategories(): ResultWrapper<CategoriesListModel>
}