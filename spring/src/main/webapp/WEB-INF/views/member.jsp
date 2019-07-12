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
	<style>
		*{
			margin :0;
			padding :0;
		}		
	</style>
	<title>로그인</title>
	
</head>
<body>	
	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">	
	  <!-- Links -->
	  <ul class="navbar-nav">
	    <li class="nav-item">
	    	<c:if test="${user ne null}">
				<a class="nav-link text-white" href="<%=request.getContextPath()%>/member/modify">회원정보 수정</a>
			</c:if>	      
	    </li>
	    <li class="nav-item">
	      	<c:if test="${user ne null}">
				<a class="nav-link text-white" href="<%=request.getContextPath()%>/board/list">게시판</a>
			</c:if>
	    </li>
	    <li class="nav-item">
	     	<c:if test="${user ne null}">	
				<a class="nav-link text-white">로그인 되었습니다</a>
			</c:if>
	    </li>
	    <li class="nav-item" style="right:20px; position:absolute;">
	     	<c:if test="${user ne null}">	
				<a class="nav-link text-white" href="<%=request.getContextPath()%>/signout">Logout</a>
			</c:if>
	    </li>	    
	  </ul>	
	</nav>	
</body>
</html>
