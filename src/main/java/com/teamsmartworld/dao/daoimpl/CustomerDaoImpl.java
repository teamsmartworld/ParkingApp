package com.teamsmartworld.dao.daoimpl;

import com.teamsmartworld.dao.CustomerDao;
import com.teamsmartworld.dao.sequencer.CustomerIdSequencer;
import com.teamsmartworld.model.Customer;

import java.util.ArrayList;
import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao {
    private ArrayList<Customer> inMemoryStorage = new ArrayList<>();

    @Override
    public Customer save(Customer customer) {
        customer.setId(CustomerIdSequencer.nextId());
        inMemoryStorage.add(customer);
        return null;
    }

    @Override
    public Optional<Customer> findBy(Integer id) {
        for (Customer customer : inMemoryStorage) {
            if (customer.getId().equals(id)) {
                return Optional.of(customer);
            }
        }
        return Optional.empty();
    }
}
