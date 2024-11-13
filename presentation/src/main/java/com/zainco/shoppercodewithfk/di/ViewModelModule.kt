package com.zainco.shoppercodewithfk.di

import com.zainco.shoppercodewithfk.ui.feature.cart.CartViewModel
import com.zainco.shoppercodewithfk.ui.feature.home.HomeViewModel
import com.zainco.shoppercodewithfk.ui.feature.product_details.ProductDetailsViewModel
import com.zainco.shoppercodewithfk.ui.feature.summary.CartSummaryViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(get(), get())
    }
    viewModel {
        ProductDetailsViewModel(get())
    }
    viewModel {
        CartViewModel(get(), get(), get())
    }
    viewModel {
        CartSummaryViewModel(get())
    }
}