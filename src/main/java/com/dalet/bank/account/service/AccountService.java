package com.dalet.bank.account.service;

import com.dalet.bank.account.entity.Account;
import com.dalet.bank.account.entity.Customer;

import java.util.List;

public interface AccountService {

    Account save(Account account);

    List<Account> getAccounts();

    Account getById(Long id);
}
