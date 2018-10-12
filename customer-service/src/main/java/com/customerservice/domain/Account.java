package com.customerservice.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    private Integer accountId;
    private Double balance;
    private Integer customerId;
    private String accountType;
    private String branchCode;
    private String bank;
}
