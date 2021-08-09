package com.itheima.cookieTest01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/out/servlet/cookieDemo05")
public class CookieDemo05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
//        获取Cookie
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie1 : cookies) {
            if("time".equals(cookie1.getName())){
                String value = cookie1.getValue();
                SimpleDateFormat df= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                String format = df.format(new Date(Long.parseLong(value)));
               resp.getWriter().write(format);

            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
