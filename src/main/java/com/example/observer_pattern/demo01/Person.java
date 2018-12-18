package com.example.observer_pattern.demo01;

public class Person extends Subject implements Member, Observer {


    @Override
    public void action() {
        System.out.println("我要去战斗！！！");
    }

    @Override
    public void update(String info) {
        System.out.println("注意！！！" + info);
    }
}
