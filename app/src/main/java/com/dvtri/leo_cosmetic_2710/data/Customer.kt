package com.dvtri.leo_cosmetic_2710.data

data class Customer(
    val customerID: String,
    var nameContact: String,
    var phoneNumber: String,
    var email: String,
    var address: String,
    var age: Int?,
    var city: String,
    var group: String,
    var gender: Boolean
)