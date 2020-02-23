package com.dvtri.leo_cosmetic_2710.data

data class Order(
    val orderID: String,
    var customerName: String,
    var orderDate: String,
    var requiredDate: String,
    var freight: Long,
    var shippedDate: String,
    var shipAddress: String,
    var status: String,
    var note: String?
)