package com.thoughtworks.ddd

import com.thoughtworks.ddd.domain.banking.Customer

class CustomerDomainService {

    fun updateAddress(customer: Customer, newAddress: String) {
        customer.updateAddress(newAddress)
    }
}