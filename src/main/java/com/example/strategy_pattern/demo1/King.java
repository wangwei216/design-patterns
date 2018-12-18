package com.example.strategy_pattern.demo1;

public class King extends Role {


    @Override
    public void display() {
        System.out.println("我就是国王！");
    }

    public static void main(String[] args) {
        Role role = new King();

        role.display();
        role.setWeapon(new KnifeBehavior());
        role.fight();

        role.setWeapon(new SwordBehavior());
        role.fight();
    }
}
