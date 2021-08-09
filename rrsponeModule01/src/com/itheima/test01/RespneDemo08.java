package com.itheima.test01;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/responeDemo08")
public class RespneDemo08 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取真是路径
        String realPath = getServletContext().getRealPath("/images/cd.gif");
        //获取输入流对象，关联读取的文件
        BufferedInputStream is = new BufferedInputStream(new FileInputStream(realPath));
        //设置响应头的支持的格式
//        Content-Type   消息头的名称  支持的类型
//        application/octet-stream  消息头的参数 应用类型为字节流
        resp.setHeader("Content-Type","application/octet-stream");
        //设置响应头已下载的方式打开
//        Content-Disposition   消息头的名称  处理的形式
//        attachment:filename=cd.gif  消息头的参数 附件的形式处理 制定下载文件的名称
        resp.setHeader("Content-Disposition","attachment:filename=cd.gif");
        //获取输出流对象
        ServletOutputStream outputStream = resp.getOutputStream();
        //循环读存数据
        byte[] bytes = new byte[1024];
        int len;
        while((len=is.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        //释放流
        is.close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
