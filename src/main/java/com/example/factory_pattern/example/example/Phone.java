package com.example.factory_pattern.example.example;

public abstract class Phone {

	PhoneScreen phoneScreen;
	PhoneShell phoneShell;
 
	public Phone() {
	}
 
	public void setPhoneScreen(PhoneScreen phoneScreen) {
		this.phoneScreen = phoneScreen;
	}
 
	public void setPhoneShell(PhoneShell phoneShell) {
        this.phoneShell = phoneShell;
	}
 
	abstract void display();
 
	public void performPhoneScreen() {
		phoneScreen.price();
	}
 
	public void performPhoneShell() {
        phoneShell.brand();
	}
 
}
