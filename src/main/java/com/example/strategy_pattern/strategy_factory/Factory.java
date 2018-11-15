package com.example.strategy_pattern.strategy_factory;

public abstract class Factory {

    Duck orderDuck(String type) {
        Duck duck;
        duck = createDuck(type);
//        duck.performFly();
//        duck.performQuack();
//        duck.display();
//        duck.swim();
        return duck;
    }

    abstract Duck createDuck(String className);

}

