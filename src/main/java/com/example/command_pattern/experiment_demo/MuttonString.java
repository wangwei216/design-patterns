package com.example.command_pattern.experiment_demo;

public class MuttonString implements Command {

    private Chef chef;

    MuttonString(Chef chef) {
        this.chef = chef;
    }

    public void execute() {
        chef.makeMuttonString();
    }

}
 
