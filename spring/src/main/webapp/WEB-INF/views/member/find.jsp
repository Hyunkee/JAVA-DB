<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css">
	<script src="//code.jquery.com/jquery-3.4.1.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){           
	        $('input[name=id]').focus();
	        $('#findBtn').click(function(){
	        	//ajax를 통해 아이디와 이메일을 서버에 전송 후 일치여부를 확인
	        	var id = $('input[name=id]').val();
	        	var email = $('input[name=email]').val();
	        	$.ajax({
			        async:true,
			        type:'POST',
			        data:{'id':id,'email':email},
			        url:"<%=request.getContextPath()%>/checkemail",
			        dataType:"json",
			        contentType:"application/json; charset=UTF-8",
			        success : function(data){
			            if(data.isOk){
			            	$('#findForm').submit();			            
			            }else{
			            	alert('일치하는 정보가 없습니다.')
			            }
			        }
			    });		
	        });
		});
	</script>
	<title>로그인</title>
	<style>
	*{
		margin: 0;
		padding : 0;
	}
	.main{
		margin-top:50px;
	}
	.row{
		margin: 5px 0px;
	}
	.fab.fa-amazon{
		font-size: 100px;
		color: red;
	}
	</style>

</head>
<body>
	<div class="offset-4 col-4 border border-dark mt-5">
		<h1 class="text-center">비밀번호 찾기</h1>
		<form action="<%=request.getContextPath()%>/password/send" method="post" id="findForm">
			<div class="row">
				<label class="col-4">아이디</label>
				<input type="text"class="form-control col-7 selector" placeholder="아이디" name="id">
			</div>
			<div class="row">
				<label class="col-4">이메일</label>
				<input type="email"class="form-control col-7" placeholder="이메일" name="email" id="email">
			</div>			
			<div class="offset-7 col-4 clearfix p-0">
				<button type="button" class="btn btn-primary float-right" id="findBtn">비밀번호 찾기</button>
			</div>
		</form>	
	</div>
</body>
</html>


