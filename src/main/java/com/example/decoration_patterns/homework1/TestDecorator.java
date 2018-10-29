package com.example.decoration_patterns.homework1;

public class TestDecorator {

	public static void main(String args[]) {
		Icecream icecream = new Honey(new Nutty(new SimpleIcecream()));
		System.out.println(icecream.makeIcecream());
	}
}
