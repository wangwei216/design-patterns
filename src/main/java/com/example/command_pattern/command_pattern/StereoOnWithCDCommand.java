package com.example.command_pattern.command_pattern;

public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo=stereo;
	}
    public void execute(){
    	stereo.on();
    	stereo.setCd();
    	stereo.setVolume(11);
    }

	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
