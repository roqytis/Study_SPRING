<%@page import="com.dto.LoginDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

login.jsp<br>
id: ${sessionScope.login.userid}<br>
passwd: ${sessionScope.login.passwd}<br>

<hr>  
${login.userid }<br>
${login.passwd }<br>

<%= session.getAttribute("login")%>
<hr>
<a href="logout">로그아웃</a>
</body>
</html>