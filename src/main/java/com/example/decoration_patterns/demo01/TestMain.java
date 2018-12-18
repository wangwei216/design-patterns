package com.example.decoration_patterns.demo01;

public class TestMain {

    public static void main(String[] args) {

        //实例化一碗牛肉面
        Noodles noodles = new BeefNoodles();

        noodles = new XiangCai(noodles);
//        noodles = new Vegetable(noodles);
        System.out.println(noodles.getDescription() + noodles.cost());

        //实例化一碗鸡蛋面
        Noodles eggNoodles = new EggNoodles();
        eggNoodles = new XiangChang(eggNoodles);
        System.out.println(eggNoodles.getDescription() + eggNoodles.cost());

    }
}
