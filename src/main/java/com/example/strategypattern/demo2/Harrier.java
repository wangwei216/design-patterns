package com.example.strategypattern.demo2;

public class Harrier extends Fly implements VerticalTakeOff,SuperSonicFly {

    private String name;

    public Harrier(String name) {
        super();
        System.out.println("我是"+name+"===================");
    }

    @Override
    public void SuperSonicFly() {
        System.out.println("我可以超音速飞行");
    }

    @Override
    public void VerticalTakeOff() {
        System.out.println("我可以垂直飞行");
    }
}
