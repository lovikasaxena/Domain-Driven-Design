package com.thoughtworks.ddd.ecommerce.domain

import java.util.*

class Cart{
    val items: MutableList<Item> = mutableListOf()
    private val deletedItems: Stack<Item> = Stack()
    private val uuid= UUID.randomUUID().toString()
    private var isCheckedOut: Boolean = false

    fun getDeletedItems(): Stack<Item> {
        return this.deletedItems
    }

    fun addItem(item: Item) {
        items.add(item)
        this.isCheckedOut = false
        println("Item added to cart: $item. Cart now has ${items.size} items")
    }

    fun removeItem(productName: String){
        val itemToRemove = items.find {
            it.product.productName == productName
        }
        items.remove(itemToRemove)
        println("Removed item $itemToRemove")

        deletedItems.add(itemToRemove)
    }

    override fun equals(other: Any?): Boolean {
        if(other !is Cart) return false
        return this.uuid == other.uuid
    }

    override fun hashCode(): Int = super.hashCode()

    fun checkout(): Order {
        var products = mutableListOf<Product>()
        this.items.forEach {
            for(i in 1..it.quantity) {
                products.add(it.product)
            }
        }
        val order = Order(products)
        this.isCheckedOut = true

        println("Cart checked out and created order")
        return order
    }

    fun markCheckout()  { this.isCheckedOut = true }

}