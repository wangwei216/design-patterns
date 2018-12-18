package com.example.factory_pattern.example.example;

public abstract class PartsAbstractFactory {

    abstract PhoneShell getShell(String type);

    abstract PhoneScreen getScreen(String type);

}
