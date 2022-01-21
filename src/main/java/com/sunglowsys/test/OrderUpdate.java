package com.sunglowsys.test;

import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.OrderRepositoryImpl;

public class OrderUpdate {
    public static void main(String[] args) {
        Order order = new Order();
        order.setBrand("Addy");
        new OrderRepositoryImpl().update(order,8L);
        System.out.println("order saved:"+order);
    }
}
