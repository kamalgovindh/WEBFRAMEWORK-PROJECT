package com.example.review1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review1.model.Customer;
import com.example.review1.service.CustomerService;

@RestController
public class CustomerController {
    
    
         
        @Autowired    
        CustomerService  s; 
    
        @PostMapping("/customer/insert")
        public List<Customer> insertdata(@RequestBody List<Customer> data)
        {
            return s.insertdatas(data);
        }
    }