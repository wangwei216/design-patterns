package com.multi_thread.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t3 = new Thread(new T2());
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(t1);
        es.execute(t3);
        es.shutdown();
    }

}
