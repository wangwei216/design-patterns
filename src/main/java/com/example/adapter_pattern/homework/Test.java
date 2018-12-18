package com.example.adapter_pattern.homework;

public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        IStandardSwitchable iStandardSwitchable = new SwitcherAdapter();
        ((SwitcherAdapter) iStandardSwitchable).SwitcherAdapter(light);
        iStandardSwitchable.connectElectricCurrent();
    }

}
