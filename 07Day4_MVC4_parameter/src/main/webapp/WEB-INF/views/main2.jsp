<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main2.jsp<br>
이름: ${username}
나이 : ${age}<br>
===================================================<br>
<%=request.getAttribute("username") %><br>
<!-- <img alt="aaa" src="resources/images/a.jpg"> -->
</body>
</html>