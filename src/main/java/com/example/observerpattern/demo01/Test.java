package com.example.observerpattern.demo01;

public class Test {

    public static void main(String[] args){

        //观察者
       ReaderObserver observer001 = new ReaderObserver("我是001");
        ReaderObserver observer002 = new ReaderObserver("我是002");
        ReaderObserver observer003 = new ReaderObserver("我是003");

        //被观察者
        Person Boss = new Person();
        Boss.registerObserver(observer001);
        Boss.registerObserver(observer002);
        Boss.deleteObserver(observer003);
        Boss.deleteObserver(observer001);

        Boss.update("我要去开始去战斗去了");

        observer001.update("我要开始发起攻击了！！！");
        observer003.update("我要开始偷袭了！！！");
    }

}
