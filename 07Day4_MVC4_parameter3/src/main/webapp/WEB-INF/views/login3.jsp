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
login1.jsp<br>
id: ${xxx.userid}<br>
passwd: ${xxx.passwd}<br>

<hr>  
<% LoginDTO dto= (LoginDTO)request.getAttribute("xxx");
 String name=dto.getUserid();
 out.print(name+"<br>");
%>
</body>
</html>