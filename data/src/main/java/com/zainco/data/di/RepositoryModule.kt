package com.zainco.data.di

import com.zainco.data.repository.CategoryRepositoryImpl
import com.zainco.data.repository.ProductRepositoryImpl
import com.zainco.domain.repository.CartRepository
import com.zainco.domain.repository.CategoryRepository
import com.zainco.domain.repository.OrderRepository
import com.zainco.domain.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
    single<CartRepository> { com.zainco.data.repository.CartRepositoryImpl(get()) }
    single<OrderRepository> { com.zainco.data.repository.OrderRepositoryImpl(get()) }
}