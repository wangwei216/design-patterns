package com.example.strategypattern.demo2;

public class Test {

    public static void main(String[] args){

       Helicopter helicopter = new Helicopter("我是Helicopter");
       helicopter.SubSonicFly();
       helicopter.VerticalTakeOff();

        AirPlane airPlane = new AirPlane("我是AirPlane");
        airPlane.LongDistanceTakeOff();
        airPlane.SubSonicFly();

        Harrier harrier = new Harrier("我是Harrier");
        harrier.SuperSonicFly();
        harrier.VerticalTakeOff();

        Fighter fighter = new Fighter("我是Fighter");
        fighter.LongDistanceTakeOff();
        fighter.SuperSonicFly();

    }
}
