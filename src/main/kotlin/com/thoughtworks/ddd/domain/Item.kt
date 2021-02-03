package com.thoughtworks.ddd.domain

data class Item(
    val product: Product,
    val quantity: Int = 1
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Item) return false

        if (product != other.product) return false
        if (quantity != other.quantity) return false

        return true
    }

    override fun hashCode(): Int {
        var result = product.hashCode()
        result = 31 * result + quantity
        return result
    }
}