package com.example.decoration_patterns.homework3;

public class Color extends Decorater {

    private Room room;

    public Color(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return "我是颜色组件类型------》";
    }

    @Override
    public String decorateRoom() {

        return "用粉色去装扮这个房间-----》";
    }
}
