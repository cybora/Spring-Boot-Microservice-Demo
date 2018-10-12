package com.accountservice.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable {

    @Id
    @Column(name = "ACCOUNTID")
    private Integer accountId;

    @Column(name = "BALANCE")
    private Double balance;

    @Column(name = "CUSTOMERID")
    private Integer customerId;

    @Column(name = "ACCOUNTTYPE")
    private String accountType;

    @Column(name = "BRANCHCODE")
    private String branchCode;

    @Column(name = "BANK")
    private String bank;
}
