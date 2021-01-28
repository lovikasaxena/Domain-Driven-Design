package com.thoughtworks.ddd

import com.thoughtworks.ddd.domain.Product
import com.thoughtworks.ddd.domain.Cart
import com.thoughtworks.ddd.domain.Item

fun main() {
    val cart1 = Cart()

    val ipadPro = Product("IPad Pro")
    val item = Item(ipadPro)
    cart1.addItem(item)

    val cart2 = Cart()
    cart2.addItem(item)
    println("Are carts same? ${cart1 == cart2}")

//    val heroInkPen = Product("Hero ink Pen")
//    cart1.addItem(Item(heroInkPen))
//
//    val gmCricketBat = Product("GM Cricket bat")
//    cart1.addItem(Item(gmCricketBat, 2))

//    cart1.removeItem("IPad Pro")
//    println("Deleted items : ${cart1.getDeletedItems()}")

}
