package com.zainco.data.di

import org.koin.dsl.module

val dataModule = module {
    includes(networkModule,
        repositoryModule
    )
}