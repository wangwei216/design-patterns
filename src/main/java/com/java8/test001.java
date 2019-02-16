package com.java8;

import org.junit.jupiter.api.Test;

import java.util.*;

public class test001 {

   /*
   * Lambda表达式的用法总结:
   *    语法格式一：如果没有参数，也没有返回值的话
   *        ->左侧的（）表示的就是参数列表
   *        ->右侧的表示是Lambda体
   * */
   @Test
   public void test1(){
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("我是测试Lambda表达式！");
           }
       };
       runnable.run();
   }
   @Test
   public void test11(){
       Runnable runnable = () -> System.out.println("测试lambda......");
       runnable.run();
   }

   /*
   * 语法格式二：
   *    如果有两个参数一个返回值的话，可以直接把return和“{}”省去
   *
   *
   * */
   @Test
   public void test2(){
//       Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);
        Comparator<Integer> comparator = (x,y) -> {
            System.out.println("测试如果有连个参数的话，");
            return Integer.compare(x,y);
        };
   }

   //这个MyMethod其实就是一个那个函数式接口的方法，这里直接能够把函数式接口给传进来当做形参
   public int operation(int x,MyMethod myMethod){
      return   myMethod.getValue(x);
   }

   @Test
   public void test3(){
       //这里其实就是直接对函数式接口进行使用
       int sum =  operation(19,(x) -> x+34);
       System.out.println(sum);
   }

   ArrayList arrayList = new ArrayList();
   LinkedList linkedList = new LinkedList();
   LinkedList linkedList2 = (LinkedList) Collections.synchronizedList(new LinkedList<>());
   ThreadLocal threadLocal = new ThreadLocal();

}
