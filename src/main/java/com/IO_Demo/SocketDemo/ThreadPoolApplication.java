package com.IO_Demo.SocketDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolApplication {

   public static void main(String[] args){

       ExecutorService executorService = Executors.newFixedThreadPool(10);
       int PORT = 80;
       String[] HOSTS = {"www.baidu.com","www.jd.com","www.taobao.com","www.tmall.com","www.imooc.com"};

       for (String host: HOSTS) {

           Thread t = new Thread(new Runnable() {
               public void run() {
                   new SocketHttpClient().start(host, PORT);
               }
           });

           executorService.submit(t);
           new SocketHttpClient().start(host, PORT);

       }

   }

}
