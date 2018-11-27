package com.IO_Demo.SocketDemo;

import java.io.*;
import java.net.*;

public class SocketHttpClient {

   public void start(String host,int port){
       //初始化Socket
       Socket socket = new Socket();
       HttpUtill httpUtill = new HttpUtill();

       try {
           //设置一个Socket的连接
           SocketAddress remote = new InetSocketAddress(host,port);
           socket.setSoTimeout(5000);
           socket.connect(remote);

           //发起一个请求
           PrintWriter writer = getWriter(socket);
           System.out.println(httpUtill.compositeRequest(host));
           writer.write(httpUtill.compositeRequest(host));
           writer.flush();

           // 读取响应
           String msg;
           BufferedReader reader = getReader(socket);
           while ((msg = reader.readLine()) != null){
               System.out.println(msg);
           }



       } catch (SocketException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

   //这个是从Socket中拿到一个输出流
   public PrintWriter getWriter(Socket socket) throws IOException {
       OutputStream outputStream = socket.getOutputStream();
       return  new PrintWriter(new OutputStreamWriter(outputStream));
   }

   //这个是从Socket中读取流
    public BufferedReader getReader(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        return new BufferedReader(new InputStreamReader(inputStream));
    }



}
