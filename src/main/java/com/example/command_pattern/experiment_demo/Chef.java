package com.example.command_pattern.experiment_demo;

public class Chef {

	Command muttonStringCommand;
    Command chickenCommand;

	Chef() {
	}
 
	public void makeMuttonString() {
        System.out.println("做一个羊肉串串----->");
	}
	 
	public void makeChicken() {
        System.out.println("烤一个鸡肉------>");
	}
	 
}
 
