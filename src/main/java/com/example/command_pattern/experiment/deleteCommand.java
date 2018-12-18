package com.example.command_pattern.experiment;

public class deleteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("执行添加命令------>");
    }

    @Override
    public void undo() {
        System.out.println("撤销命令------>");
    }
}
