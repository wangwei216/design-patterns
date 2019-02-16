package com.CollectionTest;

public class Foo {

    private String name;

    public Foo(String a){
        this.name =  a;
    }

    public void setAttribute(String attribute){
        this.name = attribute;
    }


    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                '}';
    }
}
