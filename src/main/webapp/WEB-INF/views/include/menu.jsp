<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="./header.jsp" %>
</head>
<body>
	<button type="button" onclick="location.href='${path}/'">메인페이지가기</button>
	<button type="button" onclick="location.href='${path}/lib.do'">도서관페이지가기</button>
	<button type="button" onclick="location.href='${path}/pub.do'">출판사페이지가기</button>
	<button type="button" onclick="location.href='${path}/bor.do'">대출자페이지가기</button>
	<hr>
</body>
</html>