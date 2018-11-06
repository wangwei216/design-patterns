package com.example.Singleton_pattern.preview;

    /*
    * 懒汉式线程安全
    * （使用代码块，可以减小加锁的粒度来进行控制线程安全）
    * （可以用，但是也不推荐）
    * */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04(){}

    private static Singleton04 getInstance(){
        //这里使用的是synchronize关键字的代码块进行加锁的，而且锁的是类对象而不是实例对象
        synchronized (Singleton04.class){
            if (instance==null){
                instance = new Singleton04();
            }
        }
        return instance;
    }

}
