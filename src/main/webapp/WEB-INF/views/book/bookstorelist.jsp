<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서보관현황</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>

<h1>도서관 도서현황</h1>
<button type="button" onclick="location.href='${path}/library/bookStoreAdd.do'">보관 도서 추가하러가기</button>
<table border="1" cellspacing="0">
	<tr>
		<th>도서번호</th>
		<th>도서명</th>
		<th>대출가능여부</th>
		<th>대출가능기간</th>
	</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td><a target="_blank" href="${path}/library/bookSearch.do?book_no='${list.BOOK_NO}'">${list.BOOK_NO}</a></td>
			<td>${list.BOOK_NAME}</td>
			<td>
				<c:choose>
					<c:when test="${list.RENTAL eq '1'}">
						가능
					</c:when>
					<c:otherwise>
						불가(대여중)
					</c:otherwise>
			</c:choose>
			</td>
			<td>${list.POS_PERIOD}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>