package com.example.adapter_pattern.homework.demo03;

public class Test {

    private static Facade facade;

    public static void main(String[] args) {
        facade = new Facade();
        facade.Activate();
        System.out.println("-------------------->");
        facade.Deactivate();
    }

}
