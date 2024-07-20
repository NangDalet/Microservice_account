package com.dalet.bank.account.repository;

import com.dalet.bank.account.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
