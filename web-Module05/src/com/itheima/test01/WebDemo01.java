package com.itheima.test01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class WebDemo01 extends HttpServlet {
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //根绝名称获取对应的值
        String encoding = servletConfig.getInitParameter("encoding");
        System.out.println(encoding);
        //先获取所有的名称集合，在遍历，然后根据名称获取单个对应的值
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String element = initParameterNames.nextElement();
            String parameter = servletConfig.getInitParameter(element);
            System.out.println(parameter);
        }
//        获取ServletName
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
