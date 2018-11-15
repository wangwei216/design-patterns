package com.example.Singleton_pattern.experitment;

    /*
    * 饿汉的方式（使用的是静态方法）
    * */
public class PrintPool01 {

    private final static PrintPool01 instance  = new PrintPool01();

    private PrintPool01(){}

    public static PrintPool01 getInstance(){
        return instance;
    }
}
