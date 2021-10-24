<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
  	$(document).ready(function() {
  		$("#get").click(function() {
  			$.ajax({
  				url:"board",
  				type:"get",
  				dataType:"text",
  				success: function(data, status, xhr) {
  					console.log(data, "success");
  				},
  				error: function(xhr, status, error) {
  					console.log(error);
  				}			
  			});//end ajax
		})//end get
		
		
		
		
		
		
  		$("#post").click(function() {
  			$.ajax({
  				url:"board",
  				type:"post",
  				dataType:"text",
  				success: function(data, status, xhr) {
  					console.log(data, "success");
  				},
  				error: function(xhr, status, error) {
  					console.log(error);
  				}			
  			});//end ajax
		})//end get
  		$("#put").click(function() {
  			$.ajax({
  				url:"board",
  				type:"put",
  				dataType:"text",
  				success: function(data, status, xhr) {
  					console.log(data, "success");
  				},
  				error: function(xhr, status, error) {
  					console.log(error);
  				}			
  			});//end ajax
		})//end get
  		$("#delete").click(function() {
  			$.ajax({
  				url:"board",
  				type:"delete",
  				dataType:"text",
  				success: function(data, status, xhr) {
  					console.log(data, "success");
  				},
  				error: function(xhr, status, error) {
  					console.log(error);
  				}			
  			});//end ajax
		})//end get
	
	});//end
  
  
  
  </script>
</head>
<body>
main.jsp<br>
<button id="get">get</button><br>
<button id="post">post</button><br>
<button id="put">put</button><br>
<button id="delete">delete</button><br>
</body>
</html>