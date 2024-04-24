package com.example.review1.service;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review1.model.Bankinginfo;
// import com.example.review1.model.Customer;
import com.example.review1.repository.Bankrepository;
// import com.example.review1.repository.CustomerRepo;



@Service
public class Bankservice {
    
    @Autowired
    private Bankrepository bankrepository;
    public Bankinginfo saveBankinginfo(Bankinginfo b)
    {
        return bankrepository.save(b);
    }

    public Optional<Bankinginfo> finddetails(int id)
    {
        return bankrepository.findById(id);
    }

    public List<Bankinginfo> getAllInfo()
    {
        return bankrepository.findAll();
    }

    public Bankinginfo putInfo(int id,Bankinginfo b)
    {
        return bankrepository.save(b);
    }

    public void deleteInfo(int id)
    {
        bankrepository.deleteById(id);
    }
    public List<Bankinginfo> savedata()
    {
        return bankrepository.display();
    }
    
}