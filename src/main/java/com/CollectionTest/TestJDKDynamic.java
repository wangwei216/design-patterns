package com.CollectionTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestJDKDynamic implements InvocationHandler {


    public static void main(String[] args) {
        TestJDKDynamic testJDKDynamic = new TestJDKDynamic();

    }


    Map map  = new ConcurrentHashMap();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.toString()+method.toString()+args.toString());
        return method.invoke(proxy);
    }
}
