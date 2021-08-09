package com.itheima.test01;


import com.itheima.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class WebDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求方法
//        String method = req.getMethod();
//        System.out.println(method);
////        获取虚拟目录
//        String contextPath = req.getContextPath();
//        System.out.println(contextPath);
////        获取资源路径
//        String servletPath = req.getServletPath();
//        System.out.println(servletPath);
//        //获取参数
//        String queryString = req.getQueryString();
//        System.out.println(queryString);
////        获取标识符
//        String requestURI = req.getRequestURI();
//        System.out.println(requestURI);
////        获取定位符
//        StringBuffer requestURL = req.getRequestURL();
//        System.out.println(requestURL);
//        Enumeration<String> headerNames = req.getHeaderNames();
//        while(headerNames.hasMoreElements()){
//            String s = headerNames.nextElement();
//            String header = req.getHeader(s);
//            System.out.println(header);
//        }
//        //获取参数的所有的名称集合
//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            String s = parameterNames.nextElement();
////            根据名称获取值的集合
//            String[] parameterValues = req.getParameterValues(s);
//            for (String parameterValue : parameterValues) {
//                System.out.println(s+" "+parameterValue);
//            }
//        }

//        获取参数的键值对集合
        Map<String, String[]> parameterMap = req.getParameterMap();
//        Set<String> stringSet = parameterMap.keySet();
//        for (String s : stringSet) {
//            String[] parameterValues = req.getParameterValues(s);
//            for (String parameterValue : parameterValues) {
//                System.out.println(s+" "+parameterValue);
//            }
//        }
        Student student = new Student();



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
