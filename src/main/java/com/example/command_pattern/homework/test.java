package com.example.command_pattern.homework;

public class test {
    public static void main(String[] args) {
        CompanyArmy ThreeEven = new CompanyArmy();
        Command command = new ConcreteCommand(ThreeEven);
        ArmySupervisor Leader = new ArmySupervisor();
        Leader.setCommand(command);
        Leader.startExecuteCommand();

    }

}
