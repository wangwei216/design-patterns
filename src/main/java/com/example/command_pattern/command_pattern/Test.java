package com.example.command_pattern.command_pattern;

public class Test {
	public static void main(String[] args){
		RemoteControl remoteControl =new RemoteControl();
		Light livingRoomLight = new Light("Living room");
		Light kitchenLight =new Light("Kitchen");
		Stereo stereo =new Stereo("Living Room");
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
		StereoOnWithCDCommand stereoOnwithCD=new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff= new StereoOffCommand(stereo);
		remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
		remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
		remoteControl.setCommand(2,stereoOnwithCD,stereoOff);
		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		

		
	}

}
