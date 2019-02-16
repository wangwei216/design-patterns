package com.CollectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);


        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next());

        }

    }

}
