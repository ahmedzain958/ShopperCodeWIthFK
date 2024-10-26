package com.zainco.shoppercodewithfk

import android.app.Application
import com.zainco.data.di.dataModule
import com.zainco.domain.di.domainModule
import com.zainco.shoppercodewithfk.di.presentationModule
import org.koin.core.context.startKoin

class ShopperApp: Application()  {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(domainModule, dataModule, presentationModule))
        }
    }
}