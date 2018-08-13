package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.model.UserRecord;
import com.capgemini.repository.UserRepository;  
@Service  
public class UserService {

	
	@Autowired  
    private UserRepository userRepository;  
    public List<Customer> getAllUsers(){  
        List<Customer> userRecords = new ArrayList();  
        userRepository.findAll().forEach(userRecords::add);  
        return userRecords;  
    }
	
   public void addUser(Customer userRecord){  
        userRepository.save(userRecord);  
    }  


}  