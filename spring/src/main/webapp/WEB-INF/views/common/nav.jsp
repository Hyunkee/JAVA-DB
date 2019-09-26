<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
			<a class="nav-link text-white" href="http://github.com/st8324" target="_blank">github</a>
		</c:if>
    </li>
    <li class="nav-item">
     	<c:if test="${user ne null}">	
			<a class="nav-link text-white" href="<%=request.getContextPath()%>/admin/user/list">userlist</a>
		</c:if>
    </li>
    <li class="nav-item" style="right:20px; position:absolute;">
     	<c:if test="${user ne null}">	
			<a class="nav-link text-white" href="<%=request.getContextPath()%>/signout">Logout</a>
		</c:if>
    </li>	    
  </ul>	
</nav>	
