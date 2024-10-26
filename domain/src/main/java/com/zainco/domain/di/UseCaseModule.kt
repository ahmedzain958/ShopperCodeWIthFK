package com.zainco.domain.di

import com.zainco.domain.usecase.AddToCartUseCase
import com.zainco.domain.usecase.CartSummaryUseCase
import com.zainco.domain.usecase.DeleteProductUseCase
import com.zainco.domain.usecase.GetCartUseCase
import com.zainco.domain.usecase.GetCategoriesUseCase
import com.zainco.domain.usecase.GetProductUseCase
import com.zainco.domain.usecase.OrderListUseCase
import com.zainco.domain.usecase.PlaceOrderUseCase
import com.zainco.domain.usecase.UpdateQuantityUseCase
import org.koin.dsl.module


val useCaseModule = module {
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }
    factory { AddToCartUseCase(get()) }
    factory { GetCartUseCase(get()) }
    factory { UpdateQuantityUseCase(get()) }
    factory { DeleteProductUseCase(get()) }
    factory { CartSummaryUseCase(get()) }
    factory { PlaceOrderUseCase(get()) }
    factory { OrderListUseCase(get()) }
}