package com.example.command_pattern.experiment_demo;

public class Servant {

    private Command command = null;


    public void startExecuteCommand() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
 
