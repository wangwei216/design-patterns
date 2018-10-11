package com.example.observerpattern.homework;

public class StockCustomer implements Observer {


    private double oldPrice;

    private double newPrice;

    private String message;

    @Override
    public void update() {
        System.out.println("说明股市有变化！！！！！");

    }
}
