package com.example.Singleton_pattern.experitment;

    /*
    * 懒汉式的普通加锁使用synchronize实现
    *
    * */
public class PrintPool02 {

    private static PrintPool02 instance;

    private PrintPool02(){}

    public static PrintPool02 getInstance(){

        synchronized (PrintPool02.class){
            if (instance==null){
                  instance = new PrintPool02();
            }
        }
        return instance;

    }


}
