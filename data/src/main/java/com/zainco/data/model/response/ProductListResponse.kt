package com.zainco.data.model.response

import com.zainco.data.model.DataProductModel
import kotlinx.serialization.Serializable

@Serializable
data class ProductListResponse(
    val `data`: List<DataProductModel>,
    val msg: String
) {
    fun toProductList() = com.zainco.domain.model.ProductListModel(
        products = `data`.map { it.toProduct() },
        msg = msg
    )
}