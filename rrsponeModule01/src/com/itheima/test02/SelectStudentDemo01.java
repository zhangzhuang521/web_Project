package com.itheima.test02;

import com.itheima.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/selectStudentDemo01")
public class SelectStudentDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        创建输入流读取文件内容
        BufferedReader br = new BufferedReader(new FileReader("D:\\str.txt"));
//        resp.setHeader("Content-Type", "application/octet-stream");
//        //设置响应头已下载的方式打开
////        Content-Disposition   消息头的名称  处理的形式
////        attachment:filename=cd.gif  消息头的参数 附件的形式处理 制定下载文件的名称
//        resp.setHeader("Content-Disposition", "attachment:filename=str.txt");
        ArrayList<Student> students = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] strings = line.split(",");
            Student student = new Student(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
            students.add(student);
        }
        System.out.println(students);
        //将数据写在页面展示
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        for (Student student : students) {
            writer.write(student.getUsername()+" "+student.getAge()+" "+student.getScore());
            writer.write("<br/>");
        }
        br.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
