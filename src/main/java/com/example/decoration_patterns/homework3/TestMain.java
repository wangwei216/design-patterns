package com.example.decoration_patterns.homework3;

public class TestMain {

    public static void main(String[] args) {

        //县构造出来一个房间实体
        Room room = new SimpleRoom();
        room = new Color(room);
        room = new Curtains(room);
        System.out.println(room.decorateRoom());
    }

}
