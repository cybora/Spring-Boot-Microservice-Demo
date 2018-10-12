package com.customerservice.service;


import com.customerservice.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountService {
    @GetMapping(value = "/account/customer/{customer}")
    List<Account> findByCustomer(@PathVariable("customer") Integer customer);
}
