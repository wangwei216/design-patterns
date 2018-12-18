package com.example.Singleton_pattern.preview;


/*
 * 使用的是枚举类
 * 优点：枚举本身是线程安全的，且能防止通过反射和反序列化创建多实例。
 *  缺点：不是一个类，而是枚举
 * */
public enum EnumSingleton {

    instance;

    public static EnumSingleton getInstance() {
        return instance;
    }

}
