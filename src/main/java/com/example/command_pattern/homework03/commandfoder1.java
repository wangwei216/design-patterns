package com.example.command_pattern.homework03;

import java.util.ArrayList;

public class commandfoder1 implements Command{
	ArrayList<String> dirNameList;
	MakeFolder makeMulu;
	public commandfoder1(MakeFolder makeMulu) {
		dirNameList = new ArrayList<String>();
		this.makeMulu = makeMulu;
	}
	public void execute(String name) {
		makeMulu.createMulu(name);
		dirNameList.add(name);
	}
	public void undo() {
		if(dirNameList.size()>0){
			makeMulu.deleteMulu(dirNameList.get(dirNameList.size()-1));
			dirNameList.remove(dirNameList.size()-1);
			System.out.println("撤销操作---->");
		}else{
			System.out.println("没有需要撤销的操作！");
		}
	}

}
