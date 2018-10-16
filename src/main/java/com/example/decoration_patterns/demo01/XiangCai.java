package com.example.decoration_patterns.demo01;

public class XiangCai extends Decorater {

    private Noodles noodles;

    public XiangCai(Noodles noodles){
        this.noodles = noodles;
    }
    @Override
    public String getDescription() {
        return noodles.getDescription()+"我是香菜--->";
    }

    @Override
    public double cost() {
        return noodles.cost()+1;
    }
}
