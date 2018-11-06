package com.example.Singleton_pattern.preview;

    /*
    * 懒汉式线程安全的（使用是双重检测锁写法）
    *  使用的是volatile关键字来实现的
    *  volatile保证了对线程的可见性和有序性，但是唯独不能保证原子性
    * */
public class Singleton05 {


    private static volatile Singleton05 instance;


    private Singleton05(){}

    private static Singleton05 getInstance(){
        //这里是先进行判断是不是会用到这个实例，如果用到的话我再去加锁
        if (instance==null){
            synchronized (Singleton05.class){
                if (instance==null){
                    //在进行实例的时候，因为不是原子性的，所以这里有可能会出现指令重排序，导致下面的2和3步骤顺序变化，
                    // 如果此时有别线程过来的话就会报错，分步的实例化的内存地址，但是其实这个实例对象还没有被实例化出来
                    instance = new Singleton05();
//                    memory = allocate();   //1：分配对象的内存空间
//                    ctorInstance(memory);  //2：初始化对象
//                    instance = memory;     //3：设置instance指向刚分配的内存地址
                }
            }
        }
        return instance;
    }

}
