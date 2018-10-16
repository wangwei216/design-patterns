package com.example.strategy_pattern.demo1;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("我用剑去打！");
    }
}
