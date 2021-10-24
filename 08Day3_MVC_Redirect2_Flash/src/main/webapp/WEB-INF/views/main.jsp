<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
main.jsp
<hr>
1. : ${userid}<br>
1. request.getAttribute : <%=request.getAttribute("userid") %><br>
2	 <%= request.getAttribute("passwd") %><br>
3. request.getParameter : <%=request.getParameter("userid") %><br>

</body>
</html>
