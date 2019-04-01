package com.wangwei.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！");
        // TODO Auto-generated constructor stub
    }

    //第一个参数表示要处理的对象，第二个参数是要处理的对象名称
    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        System.out
                .println("调用BeanPostProcessor接口的后置初始化方法postProcessAfterInitialization对属性进行更改！");
        return arg0;
    }

    @Override
        public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
        System.out
                .println("调用BeanPostProcessor接口的前置初始化方法postProcessBeforeInitialization对属性进行更改！");
        return arg0;
    }

}
