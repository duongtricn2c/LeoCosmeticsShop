package com.dvtri.leo_cosmetic_2710.data

data class DetailOrder(
    val orderID: String,
    val productID: String,
    var unitPrice: Long,
    var quantity: Int,
    var discount: Int
)