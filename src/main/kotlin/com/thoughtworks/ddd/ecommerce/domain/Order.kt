package com.thoughtworks.ddd.ecommerce.domain

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

class Order(private val products: List<Product> = listOf()) {

    val uuid = UUID.randomUUID().toString()
    val totalAmount =
        this.products
            .map { it.price.value + BigDecimal(it.weight * SHIPPING_COST_PERCENTAGE)
            }.reduce { acc, price -> acc + price }
            .setScale(2, RoundingMode.FLOOR)

    companion object {
        private const val SHIPPING_COST_PERCENTAGE = 0.1
    }
}