package com.example.Singleton_pattern.preview;

/*
 * 懒汉式非线程安全的
 * （不建议使用）
 * */
public class Singleton02 {


    private static Singleton02 instance;

    private Singleton02() {
    }

    //这里是一个get单例对象的方法
    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }

}
