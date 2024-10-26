package com.zainco.domain.di

import com.zainco.domain.di.useCaseModule
import org.koin.dsl.module

val domainModule = module {
    includes(useCaseModule)
}