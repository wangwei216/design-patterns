package com.example.factory_pattern.example.example;

public class ShellFactory extends PartsAbstractFactory {

    @Override
    PhoneShell getShell(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Low")){
            return new PhoneShellLow();
        } else if(type.equalsIgnoreCase("Middle")){
            return new PhoneShellMiddle();
        } else if(type.equalsIgnoreCase("High")){
            return new PhoneShellHigh();
        }
        return null;
    }

    @Override
    PhoneScreen getScreen(String type) {
        return null;
    }
}
