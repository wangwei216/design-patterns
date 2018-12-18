package com.example.Singleton_pattern.preview;

/*
 * 饿汉式线程安全（静态代码块的方式）
 *
 * */
public class HungrySingleton08 {

    private static final HungrySingleton08 instance;

    private HungrySingleton08() {
    }

    //这里使用的是静态代码块，不用实例对象也可以直接进行实例化
    static {
        instance = new HungrySingleton08();
    }

    public static HungrySingleton08 getInstance() {
        return instance;
    }

}
