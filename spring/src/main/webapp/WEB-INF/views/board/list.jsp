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
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.startPage-1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Previous</a>
	        </li>
	    </c:if>
	    <!-- c:forEach : 반복문과 같다. -->
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
	    	<c:if test="${pageMaker.criteria.page eq index}"> 
		        <li class="page-item active">
		            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>
		        </li>
	        </c:if>	        
	        <c:if test="${pageMaker.criteria.page ne index}">
		        <li class="page-item ">
		            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>
		        </li>
	        </c:if>
	    </c:forEach>
	    <c:if test="${pageMaker.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/board/list?page=${pageMaker.endPage+1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Next</a>
	        </li>
	    </c:if>
	</ul>	
	<form class="" method="get" action="<%=request.getContextPath()%>/board/list">
		<select name="type">
			<option value="0">선택</option>
			<option value="1" <c:if test="${pageMaker.criteria.type eq 1}">selected</c:if>>제목</option>
			<option value="2" <c:if test="${pageMaker.criteria.type eq 2}">selected</c:if>>내용</option>
			<option value="3" <c:if test="${pageMaker.criteria.type eq 3}">selected</c:if>>작성자</option>
		</select>
		<input type="text" name="search" value="${pageMaker.criteria.search}">
		<button type="submit" class="btn btn-outline-primary">검색</button>
	</form>
	<a href="<%=request.getContextPath()%>/board/insert"><button type="button" class="btn btn-outline-primary">등록하기</button></a>
</body>
</html>
