package com.example.designpatterns;


public class test {

    public test(){}

    public static synchronized void testSynchronized(){

    }

    public void main(String[] args) {
        synchronized (test.class) {

        }
    }
}
