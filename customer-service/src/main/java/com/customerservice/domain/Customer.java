package com.customerservice.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "CUSTOMER")
@Entity
@Data
public class Customer implements Serializable {

    @Id
    @Column(name = "CUSTOMERID")
    private Integer customerId;

    @Column(name = "CUSTOMERNAME")
    private String customerName;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "EMAIL")
    private String eMail;

    @Column(name = "CITY")
    private String city;

    @Transient
    private List<Account> account;
}
