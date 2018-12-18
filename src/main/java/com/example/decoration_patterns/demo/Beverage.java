package com.example.decoration_patterns.demo;

public abstract class Beverage {
    String description = "Coffe";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
