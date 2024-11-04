package com.zainco.shoppercodewithfk.navigation

import com.zainco.shoppercodewithfk.model.UiProductModel
import kotlinx.serialization.Serializable

@Serializable
object HomeScreen

@Serializable
object CartScreen

@Serializable
object ProfileScreen

@Serializable
object CartSummaryScreen

@Serializable
data class ProductDetailsRouteScreen(val product: UiProductModel)