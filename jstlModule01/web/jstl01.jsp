<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

%>
<% pageContext.setAttribute("list", list);%>
<%--&lt;%&ndash;单条件判断&ndash;%&gt;  相当于一个if判断--%>
<c:if test="${not empty list}">true</c:if><br>
<%--多条件判断--%>
<%--相当与一个Switch--%>
<c:choose>
    <c:when test="${list[1] eq 0}">nihaoa</c:when>
    <c:when test="${list[1] eq 1}">nihaoaa</c:when>
    <c:when test="${list[1] eq 2}">nihaoaaa</c:when>
    <c:otherwise>qita</c:otherwise>
</c:choose><br>
<%--循环--%>
<c:forEach items="${list}"  var="a" step="1" varStatus="lis">
    ${a}<br>
</c:forEach>
<c:forEach items="${list}" var="a">
    ${a}<br>
</c:forEach>

  <%response.getWriter().write("${username}");%>
</body>
</html>
