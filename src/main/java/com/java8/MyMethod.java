package com.java8;

//加这个注解，就是判断一下是不是函数式接口（就是表明这个接口中只能有一个方法）
@FunctionalInterface
public interface MyMethod {
    public int getValue(int x);
}
