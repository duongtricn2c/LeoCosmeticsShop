package com.dvtri.leo_cosmetic_2710.data

data class Product(
    val productID: String,
    var productName: String,
    var supplier: String,
    var category: String,
    var description: String?,
    var importPrice: Long,
    var wholesalePrice: Long,
    var retailPrince: Long,
    var unit: String,
    var quantityProduct: Int,
    var image: String,
    var tag: String?
)