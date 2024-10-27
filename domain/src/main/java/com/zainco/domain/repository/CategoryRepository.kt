package com.zainco.domain.repository

import com.zainco.domain.network.ResultWrapper

interface CategoryRepository {
     suspend fun getCategories(): ResultWrapper<List<String>>
}