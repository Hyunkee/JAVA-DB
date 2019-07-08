<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<title>display</title>
</head>
<body>
	${board.title}<br />
	${board.writer }<br />
	${board.registered}<br />
	${board.views }<br />
	${board.contents }<br />
	${board.file }<br />
</body>
</html>
