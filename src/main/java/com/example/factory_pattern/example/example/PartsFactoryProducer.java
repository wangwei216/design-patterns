package com.example.factory_pattern.example.example;

public class PartsFactoryProducer {

    public static PartsAbstractFactory getFactory(String typeFactory) {
        if (typeFactory.equalsIgnoreCase("Screen")) {
            return new ScreenFactory();
        } else if (typeFactory.equalsIgnoreCase("Shell")) {
            return new ShellFactory();
        }
        return null;
    }
}
