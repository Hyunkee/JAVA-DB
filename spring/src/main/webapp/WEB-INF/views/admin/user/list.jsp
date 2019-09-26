<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>		
	<title>list</title>
	<script type="text/javascript">
		
	</script>
	<style>
		h1{
			margin: 20px 0 20px 0;
			text-align: center;
		}
	</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<h1>회원정보 리스트</h1>
	<table class="table">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
			<th>권한</th>
			<th>수정</th>
		</tr>
		<!-- <c:forEach var="member" items="${list}">
			<tr>
				<th>${member.id}</th>				
				<th>${member.name}</th>
				<th>${member.email}</th>
				<th>${member.authority}</th>
				<th>
					<form class="" method="get" action="<%=request.getContextPath()%>/admin/user/authority">
						<select name="authority">							
							<option value="ADMIN" <c:if test="${member.authority eq 'ADMIN'}">selected</c:if>>ADMIN</option>
							<option value="USER" <c:if test="${member.authority eq 'USER'}">selected</c:if>>USER</option>												
						</select>
						<input type="hidden" class="form-control" name="id" value="${member.id}">
						<input type="hidden" class="form-control" name="page" value="${member.id}">
						<button type="submit" class="btn btn-outline-primary">수정</button>						
					</form>
				</th>
			</tr>
		</c:forEach> -->
		<c:forEach var="member" items="${list}">
			<tr>
				<th>${member.id}</th>
				<th>${member.name }</th>
				<th>${member.email}</th>
				<th>${member.authority}</th>
				<th>
					<select>
						<option  value="id=${member.id}&authority=ADMIN&page=${pageMaker.criteria.page}" <c:if test="${member.authority eq 'ADMIN'}">selected</c:if> >ADMIN</option>
						<option  value="id=${member.id}&authority=USER&page=${pageMaker.criteria.page}"<c:if test="${member.authority eq 'USER'}">selected</c:if> >USER</option>
					</select>
				</th>
			</tr>
		</c:forEach>					
	</table>
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.startPage-1}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Previous</a>
	        </li>
	    </c:if>
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
	        <c:if test="${pageMaker.criteria.page == index}">
		        <li class="page-item active">
		            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${index}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>
		        </li>
	        </c:if>
	        <c:if test="${pageMaker.criteria.page != index}">
		        <li class="page-item">
		            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${index}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>
		        </li>
	        </c:if>
	    </c:forEach>
	    <c:if test="${pageMaker.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.endPage+1}&perPageNum=${pageMaker.criteria.perPageNum}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Next</a>
	        </li>
	    </c:if>
	</ul>
	<form class="" method="get" action="<%=request.getContextPath()%>/admin/user/list">
		<select name="type">
			<option value="0">선택</option>
			<option value="1" <c:if test="${pageMaker.criteria.type eq 1}">selected</c:if>>아이디</option>
			<option value="2" <c:if test="${pageMaker.criteria.type eq 2}">selected</c:if>>이름</option>
			<option value="3" <c:if test="${pageMaker.criteria.type eq 3}">selected</c:if>>등급</option>
		</select>
		<input type="text" name="search" value="${pageMaker.criteria.search}">
		<button type="submit" class="btn btn-outline-primary">검색</button>
	</form>		
</body>
</html>