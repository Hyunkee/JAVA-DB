<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>		
	<title>list</title>
	<style>
		h1{
			margin: 20px 0 20px 0;
			text-align: center;
		}
	</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<h1>게시판</h1>
	<table class="table">
		<tr>
			<th width="5%">번호</th>
			<th width="55%">제목</th>
			<th width="10%">작성자</th>
			<th width="20%">등록일</th>
			<th width="10%">조회수</th>
		</tr>
		<c:forEach var="board" items="${list}">
		<tr>
			<th>${board.num}</th>
			<th><a href="<%=request.getContextPath()%>/board/display?num=${board.num}">${board.title}</a></th>
			<th>${board.writer}</th>
			<th>${board.registered}</th>
			<th>${board.views}</th>
		</tr>
		</c:forEach>		
	</table>
	<a href="<%=request.getContextPath()%>/board/insert"><button type="button" class="btn btn-outline-primary">등록하기</button></a>
</body>
</html>
