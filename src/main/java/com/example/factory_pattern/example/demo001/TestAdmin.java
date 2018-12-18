package com.example.factory_pattern.example.demo001;

public class TestAdmin {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        AdminFactory adminFactory = new Admin();

        /*
         * 传入的参数的含义：
         *   1代表超级管理员
         *   2表示一级管理员
         *   3表示二级管理员
         * */
        User admin = adminFactory.CreatUser(1);
        admin.Login("admin");

        /*
         * 超级管理的密码是 admin
         * 一级管理员的密码是 001
         * 二级管理员的密码是 002
         * 普通用户的密码是   000
         * */
        User user001 = adminFactory.CreatUser(3);
        user001.Login("111");

        User user002 = adminFactory.CreatUser(2);
        user002.Login("002");


    }

}
