package com.thoughtworks.ddd

import com.thoughtworks.ddd.ecommerce.domain.service.OrderService
import com.thoughtworks.ddd.ecommerce.domain.Product
import com.thoughtworks.ddd.ecommerce.domain.Cart
import com.thoughtworks.ddd.ecommerce.domain.Item
import com.thoughtworks.ddd.ecommerce.domain.Price
import java.math.BigDecimal

fun main() {
    val cart1 = Cart()

    val ipadPro = Product("IPad Pro", Price(BigDecimal(35000)), 2.0)
    val item = Item(ipadPro)
    cart1.addItem(item)

    val cart2 = Cart()
    cart2.addItem(item)
    println("Are carts same? ${cart1 == cart2}")

    val heroInkPen = Product("Hero ink Pen", Price(BigDecimal(10)),0.2)
    cart1.addItem(Item(heroInkPen))

    val gmCricketBat = Product("GM Cricket bat", Price(BigDecimal(10)), 10.0)
    cart1.addItem(Item(gmCricketBat, 2))

//    cart1.removeItem("IPad Pro")
//    println("Deleted items : ${cart1.getDeletedItems()}")

    val order = OrderService().createOrder(cart1)
    println("Checked out cart and created order with total amount = ${order.totalAmount}")

//    cart1.checkout()


//    val customer = Customer("123")
//    customer.addAccount(BankAccount("000213", "123"))
//    customer.updateAddress("New address")

}
