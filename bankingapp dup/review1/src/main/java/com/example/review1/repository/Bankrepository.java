package com.example.review1.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.review1.model.Bankinginfo;




// @Repository
public interface Bankrepository extends JpaRepository <Bankinginfo,Integer>{
    
    @Query("Select s,a from Bankinginfo s Left join s.customer a")
    public List<Bankinginfo> display();
    
}