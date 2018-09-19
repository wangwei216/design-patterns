package com.example.strategypattern.demo2;

public abstract class Fly {

    private LongDistanceTakeOff longDistanceTakeOff;
    private SuperSonicFly superSonicFly;
    private SubSonicFly subSonicFly;
    private  VerticalTakeOff verticalTakeOff;

    private String name;

    public void Fly(String name){
        this.name = name;
    }

    public void setLongDistanceTakeOff(LongDistanceTakeOff longDistanceTakeOff) {
        this.longDistanceTakeOff = longDistanceTakeOff;
    }

    public void setSuperSonicFly(SuperSonicFly superSonicFly) {
        this.superSonicFly = superSonicFly;
    }

    public void setSubSonicFly(SubSonicFly subSonicFly) {
        this.subSonicFly = subSonicFly;
    }

    public void setVerticalTakeOff(VerticalTakeOff verticalTakeOff) {
        this.verticalTakeOff = verticalTakeOff;
    }
}
