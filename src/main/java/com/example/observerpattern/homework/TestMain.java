package com.example.observerpattern.homework;

public class TestMain {

    public static void main(String[] args){

        //先创建一个购票中心站
        StockManager stockManager = new StockManager();

        //先实例化一个股票的股民消费者
        StockCustomer  customer001 = new StockCustomer();
        StockCustomer customer002 = new StockCustomer();

        stockManager.registerObserver(customer001);
        stockManager.priceChanged(100,198);
        stockManager.removeObserver(customer001);
        customer001.update();

        stockManager.registerObserver(customer002);
        stockManager.priceChanged(100,159);


    }

}
