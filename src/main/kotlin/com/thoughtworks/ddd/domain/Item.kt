package com.thoughtworks.ddd.domain

data class Item(
    val product: Product,
    val quantity: Int = 1
) {

}