package com.example.Singleton_pattern.preview;

/*
 * 1、饿汉式线程安全（静态常量）
 * 因为比较饿上来就先给吃的
 * */
public class HungrySingleton07 {


    private  final  static HungrySingleton07 instance = new HungrySingleton07();


    //隐藏构造方法
    private HungrySingleton07(){

    }

    public static HungrySingleton07 getInstance(){
        return instance;
    }

}
