package com.thoughtworks.ddd

import com.thoughtworks.ddd.domain.Product
import com.thoughtworks.ddd.domain.Cart
import com.thoughtworks.ddd.domain.Item

fun main() {
    val cart = Cart()

    val ipadPro = Product("IPad Pro")
    cart.addItem(Item(ipadPro))

    val heroInkPen = Product("Hero ink Pen")
    cart.addItem(Item(heroInkPen))

    val gmCricketBat = Product("GM Cricket bat")
    cart.addItem(Item(gmCricketBat, 2))

    cart.removeItem("IPad Pro")
    println("Deleted items : ${cart.getDeletedItems()}")

}
