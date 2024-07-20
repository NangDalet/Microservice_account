package com.dalet.bank.account.service.impl;

import com.dalet.bank.account.entity.Customer;
import com.dalet.bank.account.repository.CustomerRepository;
import com.dalet.bank.account.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id).
                orElseThrow(()->new RuntimeException("Customers"));
    }
}
