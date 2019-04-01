package com.CollectionTest.test;



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class TestProcess extends HttpServlet {

    // 处理doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        System.out.println("用户通过表单提交古来的用户名为："+username);
        System.out.println("用户通过表单提交过来的用户密码为："+password);
        System.out.println("用户角色为："+role);
    }

    //doPost方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }


}
