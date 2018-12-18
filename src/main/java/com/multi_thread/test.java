package com.multi_thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class test {


    public static void main(String[] args) {

        ThreadLocal threadLocal = new ThreadLocal();

        Map map = new HashMap();

        Map map1 = new ConcurrentHashMap();

        Map getMap = new LinkedHashMap();

        Map getMap1 = new Hashtable();

        Map map2 = new TreeMap();

        Vector vector = new Vector();

        List list = new ArrayList();

        List list1 = new LinkedList();

        Set set = new HashSet();
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
