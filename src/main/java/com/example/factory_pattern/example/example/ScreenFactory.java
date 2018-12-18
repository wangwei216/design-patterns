package com.example.factory_pattern.example.example;

public class ScreenFactory extends PartsAbstractFactory {

    @Override
    PhoneShell getShell(String type) {
        return null;
    }

    @Override
    PhoneScreen getScreen(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Low")) {
            return new PhoneScreenLow();
        } else if (type.equalsIgnoreCase("Middle")) {
            return new PhoneScreenMiddle();
        } else if (type.equalsIgnoreCase("High")) {
            return new PhoneScreenHigh();
        }
        return null;
    }
}
