package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Customer;
import com.capgemini.model.UserRecord;  
public interface UserRepository extends CrudRepository<Customer, Integer> {  
}  