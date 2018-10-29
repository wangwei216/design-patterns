package com.example.decoration_patterns.homework3;

public class SimpleRoom extends Room {

    public SimpleRoom(){
        descrption= "我只是简单类型一个房间----->";
        System.out.print(descrption);
    }

    @Override
    public String decorateRoom() {
        return "我只是简单类型一个房间----->";
    }


}
