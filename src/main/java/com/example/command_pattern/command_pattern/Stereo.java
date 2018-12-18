package com.example.command_pattern.command_pattern;

public class Stereo {
    int volume;
    String room;

    public Stereo(String room) {
        // TODO Auto-generated constructor stub
        this.room = room;
    }

    void on() {
        System.out.println(room + "打开音响-----》");
    }

    void off() {
        System.out.println(room + "关闭音响-----》");

    }

    public void setCd() {
        System.out.println(room + "装入CD----》");
    }

    public void setDvd() {
        System.out.println(room + "装入DVD----》");
    }

    public void setRadio() {
        System.out.println(room + "打开radio——————》");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(room + "volume set to" + volume);

    }
}
