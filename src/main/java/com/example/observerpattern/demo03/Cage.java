package com.example.observerpattern.demo03;

public class Cage implements Eudemon,Action {


    private Treature treature;

    private Double total;

    public Cage(Double quantity) {
        this.total = quantity;
    }

    @Override
    public void take(String treature, double quantity) {

        System.out.println(treature+"宝藏被拿走了"+quantity+"箱");
    }


    @Override
    public void count(double reduce) {
        System.out.println("宝藏还剩------>"+(total-reduce));
    }

    @Override
    public void attacks() {
        System.out.println("守护神发起攻击！！！");
    }

    @Override
    public void notifyy() {
        System.out.println("通知各个守护神！！！");
    }


}
