package com.sunglowsys.test;

import com.sunglowsys.repository.OrderRepositoryImpl;

public class OrderFindById {
    public static void main(String[] args) {
        System.out.println(new OrderRepositoryImpl().findById(11L));
    }
}
