package com.example.command_pattern.homework03;

public class RequestMakeMulu {
	 Command command;
	 public void setCommand(Command command) {
	    this.command = command;
	 }
	 public void startExecuteCommand(String name){
	    command.execute(name);
	 }
	 public void undoCommand(){
	    command.undo();
		 System.out.println("不去执行命令！");
	}

}
