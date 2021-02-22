package com.thoughtworks.ddd

import com.thoughtworks.ddd.banking.domain.Customer

class CustomerDomainService {

    fun updateAddress(customer: Customer, newAddress: String) {
        customer.updateAddress(newAddress)
    }
}