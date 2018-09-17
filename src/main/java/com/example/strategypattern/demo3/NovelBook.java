package com.example.strategypattern.demo3;

public class NovelBook  implements  Discount{
    @Override
    public double BookDiscount(int pirce) {
        double sum = pirce -10;
        System.out.println("NovelBook单价为："+sum);
        return sum;
    }
}
