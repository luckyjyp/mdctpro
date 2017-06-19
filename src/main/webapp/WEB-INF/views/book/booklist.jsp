<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서리스트</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h2>전체 도서 리스트</h2>
	<button type="button" onclick="location.href='${path}/library/bookAdd.do'">도서등록하러가기</button>
	<table border="1" cellspacing="0">
		<tr>
			<th>도서번호</th>
			<th>도서이름</th>
			<th>저자</th>
			<th>장르</th>
			<th>금액</th>
			<th>출판사코드</th>
		</tr>
		<c:forEach var="book" items="${list}">
			<tr>
				<td id="book_no"><a target="_blank" href="${path}/library/bookSearch.do?book_no='${book.book_no}'">${book.book_no}</a></td>
				<td>${book.book_name}</td>
				<td>${book.writer}</td>
				<td>${book.genre}</td>
				<td>${book.price}</td>
				<td>${book.pub_no}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>