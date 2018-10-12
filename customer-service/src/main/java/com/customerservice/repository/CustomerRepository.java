package com.customerservice.repository;

import com.customerservice.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findByCustomerId(Integer customerId);
}
