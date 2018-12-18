package com.example.adapter_pattern.homework;

public class SwitcherAdapter implements IStandardSwitchable {

    private Light light;

    public void SwitcherAdapter(Light light) {
		this.light = light;
    }

    public void connectElectricCurrent() {
        light.turnOn();
    }

}
 
