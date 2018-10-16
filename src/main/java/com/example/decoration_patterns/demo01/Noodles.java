package com.example.decoration_patterns.demo01;

public abstract class Noodles {

    public String descrption;

    public String getDescription(){
        return descrption;
    }

    //定义的一个抽象方法，不能被直接实先方法
    public abstract double cost();

}
