package com.CollectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestSet {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        String s1 = "我是王伟";
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(s1);
        System.out.println("----------->"+ copyOnWriteArrayList.get(0));


        Foo foo = new Foo("wangwei");
        Object o = new Object();


        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next());

        }

    }

}
