<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  errror.jsp<br>
  isErrorPage= "true"설정<br>
  <%= exception.getMessage() %><br>
  <% out.print(exception.getMessage()); %>
</body>
</html>