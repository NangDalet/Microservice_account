package com.dalet.bank.account.controller;

import com.dalet.bank.account.dto.CustomerDTO;
import com.dalet.bank.account.entity.Customer;
import com.dalet.bank.account.mapper.CustomerMapper;
import com.dalet.bank.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO dto){
        Customer customer = customerMapper.toCustomer(dto);
        customer = customerService.save(customer);
        return ResponseEntity.ok(customer);
    }
    @GetMapping
    public ResponseEntity<?> getCustomers(){
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("{customerId}")
    public ResponseEntity<?> customers(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.getById(customerId));
    }
}
