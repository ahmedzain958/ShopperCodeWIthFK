package com.zainco.shoppercodewithfk.di

import org.koin.dsl.module

val presentationModule = module {
    includes(viewModelModule)
}