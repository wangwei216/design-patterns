package com.multi_thread.demo01;

// 先建立两个测试类，这里我们默认循环10次
public class T2 implements Runnable {
    @Override
    public void run() {
        Walk walk = new Walk();
        //Walk walk = Walk.walk;
        walk.walk();
    }

}