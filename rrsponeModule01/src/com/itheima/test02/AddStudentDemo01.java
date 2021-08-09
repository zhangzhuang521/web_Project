package com.itheima.test02;

import com.itheima.domain.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

@WebServlet("/addStudentDemo01")
public class AddStudentDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //将添加的元素封装成对象
        Map<String, String[]> parameterMap = req.getParameterMap();
        Student student = new Student();
        try {
            BeanUtils.populate(student, parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(student);
        //创建输出流将对象写入文件
//        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("D:\\str.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\str.txt",true));
        bw.write(student.getUsername() + "," + student.getAge() + "," + student.getScore());
        bw.write("\r\n");
        bw.flush();
        bw.close();
        //设置定时刷新
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("添加成功，每隔三秒刷新返还首页");
        resp.setHeader("Refresh","3;URL=/demo01/html/index01.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
