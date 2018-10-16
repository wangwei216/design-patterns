package com.example.observer_pattern.homework;

import java.util.ArrayList;

public class StockManager implements Subject {

    private ArrayList observerList;
    private double oldPrice;
    private double newPrice;
    private String message;

    //这里是构造一个股票中心，并且初始化一个ArrayList
    public StockManager() {
        observerList = new ArrayList();
    }




    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
        System.out.println("说明"+observer+"来买股票了！！");
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if(i>=0){
            observerList.remove(i);
        }
        System.out.println("说明移除"+observer.toString()+"成功！！");
    }

    public void priceChanged(double oldPrice,double newPrice){
        if (newPrice>=(oldPrice+oldPrice*0.05)){
            System.out.println("说明股市变化超过5%");
            notifyObserver();
        }else {
            System.out.println("说明股市价格变化没有超过5%");
        }

    }

    @Override
    public void notifyObserver() {
        for (int i=0 ;i<observerList.size();i++){
            //分别拿到每一个对象
            Observer observer = (Observer) observerList.get(i);
            System.out.println(observer.toString());
            observer.update();
        }
        System.out.println("通知所有股民！！");
    }


}
