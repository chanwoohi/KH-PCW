<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
	<title>Home</title>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<h1>
	Hello world!
	</h1>
	<P> 안녕하세요. 제 이름은 ${name} 입니다.</P>
	<h1>데이터 전송 연습(서버로)</h1>
	<form action="<c:url value="/"/>" method="get">
		<input type="text" name="name" placeholder="이름 입력">
		<br>
		<input type="text" name="age" placeholder="나이 입력">
		<br>
		<button type="submit">전송</button>
	</form>

</body>
</html>