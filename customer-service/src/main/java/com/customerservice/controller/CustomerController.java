package com.customerservice.controller;

import com.customerservice.domain.Account;
import com.customerservice.domain.Customer;
import com.customerservice.repository.CustomerRepository;
import com.customerservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/customer")
    public Iterable<Customer> all() {
        return customerRepository.findAll();
    }

    @PostMapping(value = "/customer")
    public Customer save(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping(value = "/customer")
    public Customer update(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping(value = "/customer/{customerId}")
    public Customer findByCustomerId(@PathVariable Integer customerId) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        List<Account> account = accountService.findByCustomer(customerId);
        customer.setAccount(account);
        return customer;
    }

    @DeleteMapping(value = "/customer")
    public void delete(@RequestBody Customer customer) {
        customerRepository.delete(customer);
    }
}
