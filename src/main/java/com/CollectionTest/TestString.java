package com.CollectionTest;

import java.util.ArrayList;

public class TestString {

    public static void main(String[] args) {
        String a = "ab";
        String b1 = "a";
        String b2 = "b";
        String b = "a"+"b";
        String c = b1 + b2;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        ArrayList<String> array = new ArrayList<String>();

    }

}
