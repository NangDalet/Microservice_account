package com.dalet.bank.account.controller;

import com.dalet.bank.account.dto.AccountDTO;
import com.dalet.bank.account.dto.CustomerDTO;
import com.dalet.bank.account.entity.Account;
import com.dalet.bank.account.entity.Customer;
import com.dalet.bank.account.mapper.AccountMapper;
import com.dalet.bank.account.mapper.CustomerMapper;
import com.dalet.bank.account.service.AccountService;
import com.dalet.bank.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountMapper accountMapper;

    @PostMapping
    public ResponseEntity<?> saveAccount(@RequestBody AccountDTO dto){
        Account account = accountMapper.toAccount(dto);
        account = accountService.save(account);
        return ResponseEntity.ok(account);
    }
    @GetMapping
    public ResponseEntity<?> getAccounts(){
        return ResponseEntity.ok(accountService.getAccounts());
    }

    @GetMapping("{accountId}")
    public ResponseEntity<?> accountIds(@PathVariable Long accountId){
        return ResponseEntity.ok(accountService.getById(accountId));
    }
}
