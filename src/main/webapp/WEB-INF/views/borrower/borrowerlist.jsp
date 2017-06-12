<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>대출자리스트</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
		<h2>대출자 전체 리스트</h2>
	<table>
		<tr>
			<th>대출자번호</th>
			<th>성함</th>
			<th>연락처</th>
			<th>도서관ID</th>
		</tr>
		<c:forEach val="" items="">
			<tr>
				<td></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>