package com.example.command_pattern.command_pattern;

public class StereoOffCommand implements Command{
	Stereo stereo;
	public StereoOffCommand(Stereo stereo){
		this.stereo=stereo;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
		
	}

	
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println(stereo+"�ر�");
	}

}
