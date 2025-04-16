package com.teamsmartworld.dao;

import com.teamsmartworld.model.Customer;

import java.util.Optional;

public interface CustomerDao {
    Customer save(Customer customer);

    Optional<Customer> findBy(Integer id);
}
