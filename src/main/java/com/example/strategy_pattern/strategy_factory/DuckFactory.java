package com.example.strategy_pattern.strategy_factory;

public class DuckFactory extends Factory {

    Duck createDuck(String className) {
        Duck duck = null;
        try {
            duck = (Duck) Class.forName(className + "Duck").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return duck;
    }

}
