package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.repository.OrderRepositoryImpl;

public class Save {
    public static void main(String[] args) {

        Customer customer =  new Customer("Tejveer","Singh","ts@gmail.com","5757845767");
        Customer result = new  CustomerRepositoryImpl().save(customer);
        System.out.println("saved:"+result);

        Order order1 = new Order("Book","conics",200F);
        Order order2 = new Order("Pen","Domes",50F);
        Order order3 = new Order("Tablet","samsung",5000F);
        Order order4 = new Order("HeadPhone","boAt",700F);
        order1.setCustomer(result);
        order2.setCustomer(result);
        order3.setCustomer(result);
        order4.setCustomer(result);

        Order result1 = new OrderRepositoryImpl().save(order1);
        System.out.println("saved order1:"+result1);

        Order result2 = new OrderRepositoryImpl().save(order2);
        System.out.println("saved order2:"+result2);

        Order result3 = new OrderRepositoryImpl().save(order3);
        System.out.println("saved order 3:"+result3);

        Order result4 = new OrderRepositoryImpl().save(order4);
        System.out.println("saved order 4:"+result4);
    }
}
