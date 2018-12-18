package com.example.decoration_patterns.homework3;

public class Curtains extends Decorater {

    private Room room;

    public Curtains(Room room) {
        this.room = room;
        room.decorateRoom();
    }

    @Override
    public String getDescription() {
        return room.descrption;
    }

    @Override
    public String decorateRoom() {
        return room.decorateRoom() + "用 落地式的窗帘去装扮房间-----》";
    }
}
