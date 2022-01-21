package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;

public class Update {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setLastName("Kumar");
        new CustomerRepositoryImpl().update(customer,4L);
        System.out.println("updated:"+customer);
    }
}
