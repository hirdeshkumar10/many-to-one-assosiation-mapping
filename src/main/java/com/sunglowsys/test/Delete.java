package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.repository.OrderRepositoryImpl;

public class Delete {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.delete(1L);

    }
}
