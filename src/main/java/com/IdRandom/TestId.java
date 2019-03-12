package com.IdRandom;

public class TestId {

    public static void main(String[] args) {
        IdWorker idWorker = new IdWorker();
        for (int i=0;i<1000;i++){
            long id = idWorker.nextId();
            System.out.println(id);
        }
    }
}
