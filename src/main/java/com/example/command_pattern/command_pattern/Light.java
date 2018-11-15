package com.example.command_pattern.command_pattern;

public class Light {
	private String room;
	public Light(String room) {
		// TODO Auto-generated constructor stub
		this.room=room;
	}
	void on(){
		System.out.println(room+"打开灯------>");
	}
	void off(){
		System.out.println(room+"关闭灯------》");
	}

}
