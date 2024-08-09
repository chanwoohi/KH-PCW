<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<jsp:include page="/WEB-INF/views/common/head.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<div class="container">
	<h1 class="mt-3">로그인</h1>
	<!--
	회원가입을 위한 화면을 구성
	- 아이디, 비번, 비번 확인, 이메일
	서버로 아이디, 비번, 이메일을 전송하고
	서버에서는 전송받은 아이디, 비번, 이메일을 콘솔에 출력
	-->
	<form action="<%=request.getContextPath()%>/login" method="post" id="form">
		<div class="form-group">
			<label for="id">아이디:</label> <input type="text" class="form-control"
				id="id" name="id">
		</div>
		<div class="form-group">
			<label for="pw">비번:</label> <input type="password"
				class="form-control" id="pw" name="pw">
		</div>
		<button type="submit" class="btn btn-outline-success col-12">로그인</button>
	</form>
</div>
</body>
</html>