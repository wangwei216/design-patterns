package com.example.factory_pattern.example.demo001;

public class Admin implements AdminFactory {

    private AdminFactory adminFactory;

    @Override
    public User CreatUser(int num) throws IllegalAccessException, InstantiationException {

        if (num==1){
            System.out.println("创建一个超级管理员-----》");
                return User01.class.newInstance();

        }else if (num==2){
            System.out.println("创建一个二级管理员----》");
            return User02.class.newInstance();
        }else {
            System.out.println("创建一个普通用户-----》");
           return OrdinaryUser.class.newInstance();
        }
    }


}
