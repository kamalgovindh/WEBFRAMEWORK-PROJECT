package com.example.review1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
    
   
    @Id
    int id;
    String firstname;
    String lastname;
 
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "customer")
    Bankinginfo bank;

    // @OneToOne(mappedBy = "Bankinginfo", fetch = FetchType.EAGER)
    // Bankinginfo bank;

    public Bankinginfo getBank() {
        return bank;
    }
    public void setBank(Bankinginfo bank) {
        this.bank = bank;
    }
    public Customer() {

    }
    public Customer(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}