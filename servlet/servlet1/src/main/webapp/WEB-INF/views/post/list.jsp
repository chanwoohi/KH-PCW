<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${communityInfo.co_name} 커뮤니티</title>
<jsp:include page="/WEB-INF/views/common/head.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp" />
	<div class="container">
		<h1>${communityInfo.co_name} 커뮤니티 목록</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>추천/비추천</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="po">
					<tr>
						<td>${po.po_num}</td>
						<td>
							<a href="">${po.po_title}</a>
						</td>
						<td>${po.po_me_id}</td>
						<td>${po.po_date}</td>
						<td>${po.po_report}</td>
						<td>${po.po_view}</td>
					</tr>
				</c:forEach>
				<c:if test="${list.size() == 0}">
					<tr>
						<th colspan="6" class="text-center">등록된 게시글이 없습니다.</th>
					</tr>
				</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>