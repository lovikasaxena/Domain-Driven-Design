package com.thoughtworks.ddd.banking.domain

data class Customer(
    private val customerId: String
) {

    private lateinit var address: String //String for now
    private val accounts: MutableList<BankAccount> = mutableListOf()

    fun addAccount(account: BankAccount) {
        this.accounts.add(account)
    }

    fun updateAddress(newAddress: String) {
        this.address = newAddress
        accounts.forEach {
            it.updateAddress(newAddress)
        }
    }
}
