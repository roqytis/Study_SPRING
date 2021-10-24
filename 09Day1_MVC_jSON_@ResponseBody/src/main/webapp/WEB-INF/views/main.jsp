<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

	$(function() {
		$("#ddd").on("click", function() {
			//console.log
			$.ajax({
				url:"ddd",   //요청주소
				type:"get",   //요청방식
				datatype:"text",//리턴받는 데이터 타입
				success: function(data, status, xhr) {
					console.log(data);
					$("#result").text(data);//데이터의 문자열화 
					
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end ddd
		
		
		
		
		$("#aaa").on("click", function() {
			$.ajax({
				url:"aaa",
				type:"get",
				datatype:"json",
				success: function(data, status, xhr) {
					console.log(data.userid,"\t", data.passwd);
					$("#result").text(JSON.stringify(data));//json -> 문자열화 
					
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end aaa
		
		
		
		
		
		
		$("#bbb").on("click", function() {
			$.ajax({
				url:"bbb",
				type:"get",
				datatype:"json",
				success: function(data, status, xhr) {
					console.log(data.length);
					for (var i = 0; i < data.length; i++) {
						console.log(data[i].userid,"\t", data[i].passwd);
					}
					$("#result").text(JSON.stringify(data));//데이터의 문자열화 
					
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end bbb
		
		
		
		
		
		$("#ccc").on("click", function() {
			$.ajax({
				url:"ccc",
				type:"get",
				datatype:"json",
				success: function(data, status, xhr) {
					console.log("=============");
					console.log(data.length);
					console.log(data.one);
					console.log(data.two);
				
					$("#result").text(JSON.stringify(data));//데이터의 문자열화 
					
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end aaa
	});//end all

</script>
</head>
<body>
main.jsp~~~~~~~~~~~~~~~~~~~~~~<br>
<button id="aaa"> aaa호출 :login 호출</button><br>
<button id="bbb"> bbb호출 : ArrayList</button><br>
<button id="ccc">ccc호출 :HashMap </button>
<button id="ddd">String </button>
<div id="result"></div>

<hr>
<a href="Test.html">test.html</a>
</body>
</html>