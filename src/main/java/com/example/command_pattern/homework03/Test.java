package com.example.command_pattern.homework03;

public class Test {
    public static void main(String[] args) {
        MakeFolder makeMulu = new MakeFolder();
        Command command = new commandfoder1(makeMulu);
        RequestMakeMulu request = new RequestMakeMulu();
        request.setCommand(command);
        request.startExecuteCommand("我是开始执行的命令！");

        request.undoCommand();
        request.undoCommand();

    }

}
