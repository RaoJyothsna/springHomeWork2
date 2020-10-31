package com.example.spring.service;


import com.example.spring.entities.Customer;
import com.example.spring.exceptions.CustomerDetailsNotFoundException;
import com.example.spring.exceptions.CustomerUserNameExistsException;
import com.example.spring.exceptions.UserTypeDetailsNotFoundException;

public interface CustomerService {
    public Customer acceptCustomerDetails(Customer customer) throws CustomerUserNameExistsException, UserTypeDetailsNotFoundException;
    public Customer getCustomerDetails(int id) throws CustomerDetailsNotFoundException;
    public Customer getCustomerDetailsByUsername(String username) throws CustomerDetailsNotFoundException;
    public Customer updateCustomerDetails(int id, Customer customer) throws CustomerUserNameExistsException, CustomerDetailsNotFoundException, UserTypeDetailsNotFoundException;
}
