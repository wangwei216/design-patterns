package com.example.factory_pattern.example.example;

public class AppleFactory extends PhoneFactory {

    Phone newInstance() {
        return new ApplePhone();
    }

}
