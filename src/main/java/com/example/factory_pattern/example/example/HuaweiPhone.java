package com.example.factory_pattern.example.example;

public class HuaweiPhone extends Phone {

    public HuaweiPhone() {
        setPhoneScreen(new PhoneScreenMiddle());
        setPhoneShell(new PhoneShellMiddle());
    }

    public void display() {
        System.out.println("HuaweiPhone:Price 500$-------》");
    }
}
