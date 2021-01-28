package com.thoughtworks.ddd.domain

import java.util.*

class Cart{
    private val items: MutableList<Item> = mutableListOf()
    private val deletedItems: Stack<Item> = Stack()
    private val uuid= UUID.randomUUID().toString()

    fun getDeletedItems(): Stack<Item> {
        return this.deletedItems
    }

    fun addItem(item: Item) {
        items.add(item)
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

}