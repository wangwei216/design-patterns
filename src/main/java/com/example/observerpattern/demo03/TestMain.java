package com.example.observerpattern.demo03;

public class TestMain {

    public static void  main(String[] args){



        Cage cage = new Cage(100.0);
        cage.take("黄金----->",10);
        cage.count(10);
        cage.notifyy();
        cage.attacks();


    }

}
