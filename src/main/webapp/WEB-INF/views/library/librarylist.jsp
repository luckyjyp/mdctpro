<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서관 목록</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h2>전체 도서관 리스트</h2>
	<table border="1" cellspacing="0">
		<tr>
			<th>도서관번호</th>
			<th>도서관명</th>
			<th>주소</th>
			<th>연락처</th>
		</tr>
		<c:forEach var="lib" items="${list}">
			<tr>
				<td>${lib.lib_no}</td>
				<td>${lib.lib_name}</td>
				<td>${lib.lib_addr}</td>
				<td>${lib.lib_tel}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>