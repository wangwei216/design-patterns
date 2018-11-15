package com.example.factory_pattern.example.example;

public class MeizuFactory extends PhoneFactory{

    Phone newInstance() {
        return new MeizuPhone();
    }

}
