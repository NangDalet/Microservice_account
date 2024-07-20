package com.dalet.bank.account.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerDTO {

    private String customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private String createDate;

}
