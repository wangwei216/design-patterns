package com.example.observer_pattern.demo01;

public class ReaderObserver implements Observer {

    private String name;

    public ReaderObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String info) {
        System.out.println(name + "注意战队小组有新的情况！--->" + info);
    }
}
