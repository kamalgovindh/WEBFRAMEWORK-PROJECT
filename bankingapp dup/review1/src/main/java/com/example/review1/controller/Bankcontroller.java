package com.example.review1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review1.model.Bankinginfo;

import com.example.review1.repository.Bankrepository;
import com.example.review1.service.Bankservice;



@RestController
public class Bankcontroller {
    
    @Autowired
    Bankservice bankservice;
    @Autowired
    Bankrepository repo;
    @PostMapping(path = "/insert")
    public Bankinginfo savedata(@RequestBody Bankinginfo b)
    {
        return bankservice.saveBankinginfo(b);
    }
    @GetMapping("/insert/bankinginfo/{accountNo}")
    public Optional<Bankinginfo>PrintBankinginfo(@PathVariable("accountNo") int account_no)
    {
        return bankservice.finddetails(account_no);
    }

    @GetMapping("/insert/bankinginfo")
    public List<Bankinginfo> getAllDetails()
    {
        return bankservice.getAllInfo();
    }

    @PutMapping("/update/bankinginfo/{accountNo}")
    public Bankinginfo updateDetails(@PathVariable("accountNo") int id,@RequestBody Bankinginfo bankinginfo)
    {
        return bankservice.putInfo(id, bankinginfo);
    }

    @DeleteMapping("/delete/bankinginfo/{accountNo}")
    public void deleteallInfo(@PathVariable("accountNo") int id)
    {
        bankservice.deleteInfo(id);
    }
    @GetMapping("/givedata")
    public List<Bankinginfo> showdatas()
    {
        return bankservice.savedata();
    }
    
}