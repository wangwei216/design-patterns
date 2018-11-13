package com.example.command_pattern.command_pattern;

public class Stereo {
	int volume;
	String room;
	public Stereo(String room) {
		// TODO Auto-generated constructor stub
		this.room=room;
	}
	void on(){
		System.out.println(room+"������");
	}
	void off(){
		System.out.println(room+"�ر�����");

	}
	public void setCd(){
		System.out.println(room+"װ��cd");
	}
    public void setDvd(){
    	System.out.println(room+"װ��dvd");
	}
    public void setRadio(){
    	System.out.println(room+"װ��radio");
    }
    public void setVolume(int volume){
    	this.volume=volume;
    	System.out.println(room+"volume set to"+volume);
    	
    }
}
