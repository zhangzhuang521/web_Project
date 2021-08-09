package com.itheima.test01;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ServletDemo02 extends HttpServlet {
    private ServletConfig Config;

    @Override
    public void init(ServletConfig Config) throws ServletException {
        this.Config=Config;

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("加油，少年！");
        String encoding = Config.getInitParameter("encoding");
        System.out.println(encoding);

        Enumeration<String> parameterNames = Config.getInitParameterNames();
        while (parameterNames.hasMoreElements()){
            String element = parameterNames.nextElement();
            String initParameter = Config.getInitParameter(element);
            System.out.println(initParameter);
        }
        String servletName = Config.getServletName();
        System.out.println(servletName);
        ServletContext servletContext = Config.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
