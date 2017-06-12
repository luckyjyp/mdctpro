<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h1>도서관페이지입니다.</h1>
	<div id="lib_list">
		<p><a href="">도서관 전체리스트 보러가기</a></p>
		<p><a href="${path}/library/borrower.do">대출자 리스트로 가기</a></p>
		<p><a href="${path}/library/book.do">도서 리스트로 가기</a></p>
		<p><a href="${path}/library/rental.do">대여 및 반납하러 가기</a></p>
	</div>
</body>
</html>