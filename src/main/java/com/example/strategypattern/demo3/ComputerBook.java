package com.example.strategypattern.demo3;

public class ComputerBook implements Discount {

    @Override
    public  double BookDiscount(int pirce) {
        double sum = pirce*0.9;
        System.out.println("ComputerBook单价为："+sum);
        return sum;
    }
}
