package com.example.observer_pattern.demo01;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {


   private  List<Observer> list = new ArrayList<Observer>();

   private String message;


    //添加观察者
    public void registerObserver(Observer observer) {
        if (list.contains(observer)){
            System.out.println("添加到战队失败，因为我一级存在战队中了------>！");
        }else {
            list.add(observer);
            System.out.println("我已经添加到战队中来了----->");
        }

    }

    //删除观察者
    public void deleteObserver(Observer observer) {
       if (list.contains(observer)){
           list.remove(observer);
           System.out.println("我已经从战队中移除出来了----->");
       }

    }

    //通知观察者
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update("通知观察者！！");
        }

    }

}
