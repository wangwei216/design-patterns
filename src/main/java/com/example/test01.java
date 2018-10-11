package com.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test01 {


    public static void main(String[] args){

        Lock lock = new ReentrantLock();

        int len = 50;
        int[] data = new int[len];
        for(int i=0;i<len;i++){
            int x = (int) (Math.random()*10*5);
            data[i]=x;
        }

        //直接找最大值和最小值
        int max = data[0];
        int count=0;
        for (int i=0;i<len;i++){
            if (data[i]>max){
                max = data[i];
            }
        }
        int min = data[0];
        for (int i=0;i<len;i++){
            if (data[i]<min){
                min = data[i];
            }
            System.out.println(data[i]);
        }

        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);



    }

}
