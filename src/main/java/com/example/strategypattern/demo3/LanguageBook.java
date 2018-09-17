package com.example.strategypattern.demo3;

public class LanguageBook implements Discount {
    @Override
    public double BookDiscount(int pirce) {
        double sum = pirce- 2;
        System.out.println("LanguageBook单价为："+sum);
        return sum;
    }
}
