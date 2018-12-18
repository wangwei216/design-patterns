package com.multi_thread.demo01;

public class Walk {
    public static int num = 100;
    public static Walk walk = new Walk();

    // 静态
    public static synchronized int run() {
        int i = 0;
        while (i < 10) {
            try {
                num--;
                i++;
                System.out.println(Thread.currentThread().getName() + ":" + num);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return num;
    }

    // 非静态
    public synchronized int walk() {
        int i = 0;
        while (i < 10) {
            try {
                num--;
                i++;
                System.out.println(Thread.currentThread().getName() + ":" + num);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return num;
    }


}
