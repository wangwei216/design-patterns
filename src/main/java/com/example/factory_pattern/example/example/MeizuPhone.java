package com.example.factory_pattern.example.example;

public class MeizuPhone extends Phone {
	public MeizuPhone() {
		setPhoneScreen(new PhoneScreenLow());
		setPhoneShell(new PhoneShellLow());
	}

	public void display() {
		System.out.println("MeizuPhone:Price 100$------》");
	}
}
