package com.example.strategy_pattern.demo2;

public class Helicopter  extends Fly implements VerticalTakeOff,SubSonicFly{

    private VerticalTakeOff verticalTakeOff;

    private String name;

    public Helicopter(String name) {
        super();
        System.out.println("我是"+name+"===================");

    }

    @Override
    public void VerticalTakeOff() {
        System.out.println("我是可以垂直腾飞！");
    }

    @Override
    public void SubSonicFly() {
        System.out.println("我的起飞方式是可以亚音速飞行");
    }
}
