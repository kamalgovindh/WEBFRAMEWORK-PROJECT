package com.example.review1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.review1.model.Customer;
import com.example.review1.repository.CustomerRepo;

@Service
public class CustomerService {
    
   
    
    @Autowired
    CustomerRepo r;

    public List<Customer> insertdatas(List<Customer> reader){
        return r.saveAll(reader);
    }
}
