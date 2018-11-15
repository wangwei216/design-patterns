package com.example.command_pattern.experiment_demo;

public class Test {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Command muttonString = new MuttonString(chef);
        Command chicken = new Chicken(chef);
        Servant servant = new Servant();
        servant.setCommand(muttonString);
        servant.startExecuteCommand();
        servant.setCommand(chicken);
        servant.startExecuteCommand();
    }

}
