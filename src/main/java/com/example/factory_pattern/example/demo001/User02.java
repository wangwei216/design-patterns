package com.example.factory_pattern.example.demo001;

public class User02 extends User {

    @Override
    public void Login(String password) {
        if (password.equals("002")) {
            System.out.println("我是一级管理员----》登录成功");
        } else {
            System.out.println("我是一级管理员----》登录失败");
        }
    }
}
