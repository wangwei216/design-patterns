package com.example.factory_pattern.example.demo001;


public class OrdinaryUser extends User {

    public void Login(String password) {
        if (password.equals("000")){
            System.out.println("我是普通用户----》登录成功");
        }else{
            System.out.println("我是普通用户----》登录失败");
        }
    }
}
