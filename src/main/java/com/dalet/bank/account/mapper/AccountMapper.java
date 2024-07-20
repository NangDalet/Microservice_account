package com.dalet.bank.account.mapper;

import com.dalet.bank.account.dto.AccountDTO;
import com.dalet.bank.account.dto.CustomerDTO;
import com.dalet.bank.account.entity.Account;
import com.dalet.bank.account.entity.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AccountMapper {
    public Account toAccount(AccountDTO dto){

        Account account = new Account();
        account.setAccountNumber(dto.getAccountNumber());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        account.setCreateDate(LocalDate.parse(dto.getCreateDate()));
        return account;

    }
}
