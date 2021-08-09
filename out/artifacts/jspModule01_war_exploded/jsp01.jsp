<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/17 0017
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="/jspError.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--这是一个注释--%>
<%--<% int result = 1 / 0;%>--%>
<% ArrayList<String> arrayList = new ArrayList<>();%>
<% System.out.println(1);%>
<% out.print(1);%><br/>
<% out.print(2);%><br/>
<%=2%>
<%! String s = "abc";%>
<% String s = "abcd";%><br/>
<% pageContext.setAttribute("a", "abd");%>
<% out.println(pageContext.getAttribute("a"));%><br>
<%=pageContext.getAttribute("a")%><br>
${a}
<%=s%>
</body>
</html>
