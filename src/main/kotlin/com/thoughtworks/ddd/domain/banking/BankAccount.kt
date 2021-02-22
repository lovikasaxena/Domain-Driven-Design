package com.thoughtworks.ddd.domain.banking

class BankAccount(
    private val accountNumber: String,
    private val customerId: String,
) {
    private lateinit var address: String

    fun updateAddress(address: String) {
        this.address = address
    }
}