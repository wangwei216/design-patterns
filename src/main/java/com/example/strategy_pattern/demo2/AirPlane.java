package com.example.strategy_pattern.demo2;

public class AirPlane extends Fly implements LongDistanceTakeOff, SubSonicFly {

    private String name;

    public AirPlane(String name) {
        super();
        System.out.println("我是" + name + "===================");
    }

    @Override
    public void LongDistanceTakeOff() {
        System.out.println("我可以长距离飞行");
    }

    @Override
    public void SubSonicFly() {
        System.out.println("我可以亚超音速飞行");
    }
}
