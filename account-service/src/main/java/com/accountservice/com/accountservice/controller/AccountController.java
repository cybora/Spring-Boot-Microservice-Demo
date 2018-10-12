package com.accountservice.com.accountservice.controller;

import com.accountservice.com.accountservice.repository.AccountRepository;
import com.accountservice.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @PostMapping("/account")
    public Account save(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    @GetMapping("/account")
    public Iterable<Account> all() {
        return accountRepository.findAll();
    }

    @GetMapping("/account/{accountId}")
    public Account findByAccountId(@PathVariable Integer accountId) {
        return accountRepository.findAccountByAccountId(accountId);
    }

    @PutMapping("/account")
    public Account update(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    @DeleteMapping
    public void delete(@RequestBody Account account) {
        accountRepository.delete(account);
    }

    @GetMapping(value = "/account/account-type/{type}")
    public List<Account> findByAccountType(@PathVariable String type) {
        return accountRepository.findAllByAccountType(type);
    }

    @GetMapping(value = "/account/bank/{bank}")
    public List<Account> findByBank(@PathVariable String bank) {
        return accountRepository.findByBank(bank);
    }

    @GetMapping(value = "account/customer/{customerId}")
    public List<Account> findByCustomerId(@PathVariable Integer customerId) {
        return accountRepository.findAllByCustomerId(customerId);
    }
}
