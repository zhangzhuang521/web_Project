<%@ page import="com.itheima.test01.domain.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/17 0017
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--基本数据类型--%>
<% request.setAttribute("a", 10);%>
${a}<br>
<%--对象--%>
<% request.setAttribute("stu1", new Student("lisi", 18));%>
<% request.setAttribute("stu2", new Student("wangwu", 19));%>
${stu1.name}<br>
${stu1}<br>
${stu2.age}<br>
<%ArrayList<String> arrayList = new ArrayList<>();%>
<%arrayList.add("aaa");%>
<%arrayList.add("bbb");%>
<%arrayList.add("ccc");%>
<% request.setAttribute("arrayList", arrayList);%>
${arrayList[0]}<br>
${arrayList[1]}<br>
${arrayList[10]}<br>
<%
    HashMap<String, Student> stringStudentHashMap = new HashMap<>();
    stringStudentHashMap.put("stu01", new Student("lisi", 18));
    stringStudentHashMap.put("stu02", new Student("WANGWU", 28));
%>
<%request.setAttribute("Map", stringStudentHashMap);%>
${Map.stu01.name}<br>
${Map.stu.age}<br>
${Map.stu02.age}<br>
<%
    ArrayList<Integer> integers = new ArrayList<>();
%>
<%pageContext.setAttribute("integers", integers);%>
${empty integers}<br>
${10 div 3}<br>
${10 / 3}<br>
${10 mod 3}<br>
${10 % 3}<br>
</body>
</html>
