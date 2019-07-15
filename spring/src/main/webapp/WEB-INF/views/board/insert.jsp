<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>	
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	<title>display</title>
	<style>
		a{
			
			float: right;			
			color: black;
			margin-right : 30px;
		}
	</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<form action="<%=request.getContextPath()%>/board/insert" method="post">
		<div class="container-fluid" style="margin-top:20px;">	              
		    <div class="form-group">
			  <label>제목</label>
			  <input type="text" class="form-control" name="title" value="">
		    </div>
		    <div class="form-group">
			  <label>작성자</label>
			  <input type="text" class="form-control" name="writer" value="${user.id}" readonly>
		    </div>
		    <div class="form-group">
			  <label>작성일</label>
			  <input type="text" class="form-control" name="" value="" readonly>
		    </div>
		    <div class="form-group">
			  <label>조회수</label>
			  <input type="text" class="form-control" name="" value="" readonly>
		    </div>
		    <div class="form-group">
			  <label>내용</label>
			  <textarea class="form-control" rows="5" name="contents" ></textarea>
			</div>
		    <div class="form-group">
			  <label>파일첨부</label>
			  <input type="text" class="form-control" name="file" value="">
		    </div>	  	
		    <button type="submit" class="btn btn-outline-primary">등록하기</button>	
		</div>		
	</form>	
</body>
</html>
