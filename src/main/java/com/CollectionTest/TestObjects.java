package com.CollectionTest;

import com.example.command_pattern.experiment.C;

public class TestObjects {

    public static void main(String[] args){

        Foo f = new Foo("f");
        changeReference(f); // It won't change the reference!
        System.out.println("changeReference改变之后的对象---------->"+f.toString());
        modifyReference(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println("modifyReference修改之后的对象----------->"+f.toString());
    }


    public static void changeReference(Foo a){
        System.out.println("这是changeReference方法"+a.toString());
        Foo b = new Foo("b");
        System.out.println("这是changeReference方法"+b.toString());
        //下面其实是把b的对象又给了a的引用
        a = b; //如果这里要是值传递的话，在changeReference(f); 方法之后输出打印的应该是name=b，但是打印出来的却还是name=f
        System.out.println("这是changeReference方法"+a.toString());
    }

    public static void modifyReference(Foo c){
        System.out.println("这是modifyReference方法set之前"+c.toString());
        c.setAttribute("c");
        System.out.println("这是modifyReference方法set之后"+c.toString());
    }


}
