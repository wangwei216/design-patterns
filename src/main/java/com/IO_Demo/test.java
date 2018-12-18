package com.IO_Demo;

import java.util.HashMap;
import java.util.HashSet;

public class test {

    public static void main(String[] args) {
        // 新建Person对象，
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("aaa", 200);



        // 新建HashSet对象
        HashMap map = new HashMap();
        map.put(p1,"woshi---p1");
        map.put(p2,"woshi---p2");
        map.put(p3,"我是P3");

        System.out.println(map.get(p1)+"---------------------");
        System.out.println(map.get(p2)+"---------------------");
        System.out.println(map.get(p3));


        // 比较p1 和 p2， 并打印它们的hashCode()
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());


    }

    /**
     * @desc Person类。
     */
    private static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "("+name + ", " +age+")";
        }

        /**
         * @desc 覆盖equals方法
         */
//        @Override
//        public boolean equals(Object obj){
//            if(obj == null){
//                return false;
//            }
//
//            //如果是同一个对象返回true，反之返回false
//            if(this == obj){
//                return true;
//            }
//
//            //判断是否类型相同
//            if(this.getClass() != obj.getClass()){
//                return false;
//            }
//
//            Person person = (Person)obj;
//            return name.equals(person.name) && age==person.age;
//        }
    }
}