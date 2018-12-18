package com.example.decoration_patterns.demo01;

//这相当于是我具体要装饰的是什么对象，也就是具体装饰者
public class XiangChang extends Decorater {

    private Noodles noodles;

    public XiangChang(Noodles noodles) {
        this.noodles = noodles;
    }

    @Override
    public String getDescription() {
        return noodles.getDescription() + "我是香肠--->";
    }

    @Override
    public double cost() {
        return noodles.cost() + 1.5;
    }
}
