package com.zainco.data.di

import com.zainco.data.di.repositoryModule
import org.koin.dsl.module

val dataModule = module {
    includes(networkModule,
        repositoryModule
    )
}