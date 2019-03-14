package com.CollectionTest.test;

public class TestMain {

    public static void main(String[] args) {

        BOSE bose = new BOSE("我是BOSE类型的车辆");
        bose.pause();
        bose.next();
        bose.turnUp();

        Philips philips = new Philips("我是Philip品牌类型的车");
        philips.play();
        philips.prev();
        philips.turnDown();

    }
}
