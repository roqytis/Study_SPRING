<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>main.jsp</h1>
<hr>
1.: ${userid}<br>
1. request.gettAttribute : <%=request.getAttribute("userid") %><br>
2 <%= request.getAttribute("passwd") %><br>
3. request.getParameter : <%=request.getParameter("userid") %><br>
</body>
</html>