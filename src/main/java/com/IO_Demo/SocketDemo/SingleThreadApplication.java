package com.IO_Demo.SocketDemo;

public class SingleThreadApplication {


    public static void main(String[] args) {

        int PORT = 80;
        String[] HOSTS = {"www.baidu.com","www.jd.com","www.taobao.com","www.tianmao.com","www.imooc.com"};

        // HttpConstant.HOSTS 为 站点集合
        for (String host: HOSTS) {
            new SocketHttpClient().start(host, PORT);

        }

    }

}
