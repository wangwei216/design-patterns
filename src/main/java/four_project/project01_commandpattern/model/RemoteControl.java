package four_project.project01_commandpattern.model;

import java.util.Stack;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand.push(offCommands[slot]);
    }

    public void undo(){
        if (undoCommand.empty()) {
            System.out.println("无法撤销");
        } else {
            undoCommand.pop().undo();
        }
    }
}
