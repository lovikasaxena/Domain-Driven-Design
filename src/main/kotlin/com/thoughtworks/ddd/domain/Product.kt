package com.thoughtworks.ddd.domain

import java.math.BigDecimal
import java.util.*

data class Product(
    val productName: String,
    val price: Price
)

data class Price(
    val value: BigDecimal,
    val currency: Currency = Currency.getInstance("INR")
)