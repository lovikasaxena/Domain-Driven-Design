package com.thoughtworks.ddd.ecommerce.domain.service

import com.thoughtworks.ddd.ecommerce.domain.Cart
import com.thoughtworks.ddd.ecommerce.domain.Order
import com.thoughtworks.ddd.ecommerce.domain.Product

class OrderService {

    fun createOrder(cart: Cart): Order {
        var products = mutableListOf<Product>()
        cart.items.forEach {
            for(i in 1..it.quantity) {
                products.add(it.product)
            }
        }

        val order = Order(products)
        cart.markCheckout()

        return order
    }
}