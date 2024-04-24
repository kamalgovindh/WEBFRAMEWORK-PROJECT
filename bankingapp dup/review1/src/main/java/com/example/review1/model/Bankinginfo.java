package com.example.review1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;


@Entity
public class Bankinginfo {
    
    @Id
    private int accountNo;
    private String customerName;
    private String emailAdd;
    private String phoneno;
    private String address;
    private String acctbalance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data",referencedColumnName = "id")
    Customer customer;

    
    public Bankinginfo(int accountNo, String customerName, String emailAdd, String phoneno, String address,
            String acctbalance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.emailAdd = emailAdd;
        this.phoneno = phoneno;
        this.address = address;
        this.acctbalance = acctbalance;
    }
    public Bankinginfo()
    {

    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmailAdd() {
        return emailAdd;
    }
    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAcctbalance() {
        return acctbalance;
    }
    public void setAcctbalance(String acctbalance) {
        this.acctbalance = acctbalance;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}