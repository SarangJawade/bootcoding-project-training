package com.bootcoding.project.service;

import com.bootcoding.project.model.Customer;
import com.bootcoding.project.utils.CustomerNameGenerator;

public class CustomerService {

    public void createCustomer(){
        Customer customer = new Customer();
        customer .setName(CustomerNameGenerator.getName());
    }
}
