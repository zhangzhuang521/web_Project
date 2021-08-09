package com.itheima.cookieTest01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet/cookieDemo02")
public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

       //创建Cookie对象
        Cookie cookie = new Cookie("time", System.currentTimeMillis() + "");
        //设置Cookie的有效时限
        cookie.setMaxAge(60*60);
//        添加Cookie
        resp.addCookie(cookie);
        //获取Cookie
//        Cookie[] cookies = req.getCookies();
//        for (Cookie cookie1 : cookies) {
//            if("time".equals(cookie1.getName())){
//                String value = cookie1.getValue();
//                SimpleDateFormat df= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//                String format = df.format(new Date(Long.parseLong(value)));
//               resp.getWriter().write(format);
//
//            }
//        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
