package com.example.strategy_pattern.demo1;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("我用小刀去打！");
    }
}
