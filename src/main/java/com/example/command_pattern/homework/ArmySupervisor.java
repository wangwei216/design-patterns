package com.example.command_pattern.homework;

public class ArmySupervisor {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void startExecuteCommand() {
        command.execute();

    }

}
