package com.example.strategy_pattern.demo2;

public class Fighter extends Fly implements LongDistanceTakeOff,SuperSonicFly{

    private String name;

    public Fighter(String name) {
        super();
        System.out.println("我是"+name+"===================");
    }

    @Override
    public void LongDistanceTakeOff() {
        System.out.println("我可以长距离飞行");
    }

    @Override
    public void SuperSonicFly() {
        System.out.println("我可以超音速飞行");
    }
}
