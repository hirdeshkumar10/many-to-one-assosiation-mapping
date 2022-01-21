package com.sunglowsys.test;

import com.sunglowsys.repository.OrderRepositoryImpl;

public class OrderFindAll {
    public static void main(String[] args) {
        System.out.println(new OrderRepositoryImpl().findAll());
    }
}
