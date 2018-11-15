package com.example.factory_pattern.example.example;

public class HuaweiFactory extends PhoneFactory {

    Phone newInstance() {
        return new HuaweiPhone();
    }

}
