package com.CollectionTest.test;


public class Philips extends Car implements CarAudio{

    String carBrand;

    public Philips(String car){
        this.carBrand=car;
        System.out.println("调用了Philips的构造方法！");
    }

    @Override
    public void play() {
        System.out.println(carBrand+"---->可以Play功能");
    }

    @Override
    public void pause() {
        System.out.println(carBrand+"---->可以暂停功能");
    }

    @Override
    public void prev() {
        System.out.println(carBrand+"---->可以播放上一首功能");
    }

    @Override
    public void next() {
        System.out.println(carBrand+"---->可以播放下一首功能");
    }

    @Override
    public void turnUp() {
        System.out.println(carBrand+"---->可以播放调节声音大功能");
    }

    @Override
    public void turnDown() {
        System.out.println(carBrand+"---->可以播放调节声音变小功能");
    }
}
