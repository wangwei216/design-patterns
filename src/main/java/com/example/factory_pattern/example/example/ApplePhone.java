package com.example.factory_pattern.example.example;

public class ApplePhone extends Phone {
    public ApplePhone() {
        setPhoneScreen(new PhoneScreenHigh());
        setPhoneShell(new PhoneShellHigh());
    }

    public void display() {
        System.out.println("ApplePhone:Price 1000$");
    }
}
