package com.example.decoration_patterns.homework1;

public class Honey extends IcecreamDecorator {

    public Honey(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    private String addHoney() {
        return " + 加点蜂蜜----》";
    }
}