<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

$(function() {
	$("#aaa").on("click", function() {
		console.log(aaa);
		 $.ajax({
			url:"aaa",   //요청주소
			type:"post",   //요청방식
			datatype:"text",//리턴받는 데이터 타입
			headers:{
				"Content-Type":"application/json"
				},
				data:JSON.stringify({userid:"홍길동", passwd:"1234"}),
				success: function(data,status, xhr){
					cosole.log(data);
				},
				error: function(xhr,status,error){
					console.log(error);
				}
	  }); 
   });
	$("#bbb").on("click", function() {
		console.log(bbb);
		 $.ajax({
			url:"bbb",   //요청주소
			type:"post",   //요청방식
			datatype:"text",//리턴받는 데이터 타입
			headers:{
				"Content-Type":"application/json"
				},
				data:JSON.stringify(
				[
				{userid:"홍길동", passwd:"1234"},
				{userid:"이순신", passwd:"4567"}
				]		
				),
				success: function(data,status, xhr){
					cosole.log(data);
				},
				error: function(xhr,status,error){
					console.log(error);
				}
              });
         });//end bbb
         //////////////////////////////////////////////
         $("#ccc").on("click", function() {
			 $.ajax({
			url:"ccc",   //요청주소
			type:"post",   //요청방식
			datatype:"text",//리턴받는 데이터 타입
		    data: {userid:"홍길동", passwd:"1234"}  ,
				success: function(data,status, xhr){
					cosole.log(data);
				},
				error: function(xhr,status,error){
					console.log(error);
				}
              });
         });//end ccc
	
	
});
</script>
<body>
<button id="aaa">aaa호출</button>
<button id="bbb">bbb호출</button>
<button id="ccc">ccc호출</button>
<div id="result"></div>
</body>
</html>