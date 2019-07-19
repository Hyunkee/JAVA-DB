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
	        $('.selector').focus();            
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
		<h1 class="text-center">로그인</h1>
		<form action="<%=request.getContextPath()%>/signin" method="post" >
			<div class="row">
				<label class="col-4">아이디</label>
				<input type="text"class="form-control col-7 selector" placeholder="아이디" name="id">
			</div>
			<div class="row">
				<label class="col-4">비밀번호</label>
				<input type="password"class="form-control col-7" placeholder="비밀번호" name="pw">
			</div>			
			<div class="offset-8 col-2 clearfix p-0">
				<button class="btn btn-primary float-right" >로그인</button>
			</div>
			<div class="offset-8 col-4 clearfix p-0">
				<a href="<%=request.getContextPath()%>/password/find">비밀번호 찾기</a>
			</div>
		</form>	
	</div>
</body>
</html>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<c:if test="${user eq null}">
	<a href="<%=request.getContextPath()%>/signup">회원가입</a>
</c:if>
<c:if test="${user eq null}">
	<a href="<%=request.getContextPath()%>/signin">로그인</a>
</c:if>
<c:if test="${user ne null}">
	<a href="<%=request.getContextPath()%>/board/list">게시판</a>
</c:if>
<c:if test="${user ne null}">
	${user}  
</c:if>
</body>
</html> --%>

