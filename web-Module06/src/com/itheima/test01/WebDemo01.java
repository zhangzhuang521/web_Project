package com.itheima.test01;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class WebDemo01 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取作用域对象
        ServletContext servletContext01 = this.getServletContext();
        System.out.println(servletContext01);
        //获取名称集合，。再遍历
        Enumeration<String> initParameterNames = servletContext01.getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String element = initParameterNames.nextElement();
            String initParameter = servletContext01.getInitParameter(element);
            System.out.println(initParameter);
        }
        String contextPath = servletContext01.getContextPath();
        System.out.println(contextPath);
        String realPath01= servletContext01.getRealPath("/");
        System.out.println(realPath01);
        String realPath02 = servletContext01.getRealPath("/WEB-INF/");
        System.out.println(realPath02);
        String realPath03 = servletContext01.getRealPath("/WEB-INF/classes/");
        System.out.println(realPath03);
        servletContext01.setAttribute("name","lisi");
        String name = (String) servletContext01.getAttribute("name");
        System.out.println(name);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
