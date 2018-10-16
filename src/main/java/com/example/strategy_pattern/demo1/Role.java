package com.example.strategy_pattern.demo1;

public  abstract class Role {

    private  WeaponBehavior weaponBehavior;


    public void fight() {
        weaponBehavior.useWeapon();
    }


    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }

    public abstract void display();



}
