package com.IO_Demo.SocketDemo;

public class MultiThreadApplication {

    public static void main(String[] args){

        int PORT = 80;
        String[] HOSTS = {"www.baidu.com","www.jd.com","www.taobao.com","www.tmall.com","www.imooc.com"};

        for (String host : HOSTS) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    new SocketHttpClient().start(host,PORT);
                }
            });

            thread.start();
        }

    }

}
