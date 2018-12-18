package com.example.Singleton_pattern.preview;

/*
 * 懒汉式线程安全的
 * （可以用，但是不推荐）
 *
 * */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {
    }

    //因为这里加了一个Synchronize关键字来实现加锁，但是这种情况如果是高并发比较多的话就会出现阻塞
    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }

}
