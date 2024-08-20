<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<nav class="navbar navbar-expand-sm bg-success navbar-dark">
  <a class="navbar-brand" href="<c:url value="/"/>">Home</a>
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="<c:url value="/signup"/>">회원가입</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 2</a>
    </li>
  </ul>
</nav>
</body>
</html>