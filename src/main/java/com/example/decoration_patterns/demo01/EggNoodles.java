package com.example.decoration_patterns.demo01;

//这个相当于是组件，也就是我要用什么去装饰的那个组件
public class EggNoodles extends Noodles {

    public EggNoodles() {
        descrption = "我是鸡蛋面类型---->";
    }

    @Override
    public double cost() {
        return 8;
    }
}
