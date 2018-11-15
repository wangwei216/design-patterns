package com.example.factory_pattern.example.homework2.demo001;

public class Client {

    public static void main(String[] args) throws Exception {
        TV tv;
        String brandName = "Haier";
        tv = TVFactory.produceTV(brandName);
        tv.play();

    }
}
