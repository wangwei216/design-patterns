package com.example.factory_pattern.example.demo001;

public class User01 extends User {


    @Override
    public void Login(String password) {
        if (password.equals("admin")) {
            System.out.println("我是超级管理员----》登录成功");
        } else {
            System.out.println("我是超级管理员----》登录失败");
        }
    }
}
