package com.example.decoration_patterns.demo01;

//这个是抽象的装饰者，只要是我想去加入的香肠、香菜、蔬菜都必须继承面条类
//这样才能够保持和要装饰的类型保持一致的超类
public abstract class Decorater extends Noodles {

    public abstract String getDescription();

}
