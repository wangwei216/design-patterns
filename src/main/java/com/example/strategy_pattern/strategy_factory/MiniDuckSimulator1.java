package com.example.strategy_pattern.strategy_factory;

public class MiniDuckSimulator1 {

    public static void main(String[] args) {
        //Look MiniDuckSimulator.java
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
