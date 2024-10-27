package com.zainco.shoppercodewithfk.di

import com.zainco.shoppercodewithfk.ui.feature.home.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(get())
    }
}