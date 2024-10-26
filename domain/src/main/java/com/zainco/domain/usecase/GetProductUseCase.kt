package com.zainco.domain.usecase

import com.zainco.domain.repository.ProductRepository

class GetProductUseCase(private val repository: ProductRepository) {
    suspend fun execute(category:Int?) = repository.getProducts(category)
}