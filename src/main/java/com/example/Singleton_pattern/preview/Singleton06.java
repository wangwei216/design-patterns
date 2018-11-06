package com.example.Singleton_pattern.preview;

    /*
    * 饿汉式线程安全（内部类）比较推荐
    * 因为使用内部类时，先调用内部类的线程会获得类初始化锁，
    * 从而保证内部类的初始化（包括实例化它所引用的外部类对象）线程安全
    * */
public class Singleton06 {

    static class Inner{
        private static final Singleton06 instance = new Singleton06();
    }

    private Singleton06(){}

    public static Singleton06 getInstance(){
        //这里直接通过内部类去调用内部类的成员变量
        return  Inner.instance;
    }

}
