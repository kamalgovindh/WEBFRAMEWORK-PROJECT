package com.example.review1.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review1.model.Customer;



public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}