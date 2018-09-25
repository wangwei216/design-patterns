package com.example.observerpattern.demo03;

import java.util.ArrayList;
import java.util.List;

//被观察者
public class Gold implements Treature {


    private Double total;
    private List<Eudemon>  list = new ArrayList<Eudemon>();

    private String message;

    public Gold(Double total) {
        this.total = total;
    }

    @Override
    public void notifyTheAll() {
        System.out.println("宝藏被拿走了！！！");
    }



}
