<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 대여 현황</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<input type="button" value="대여하러가기" onclick="location.href='${path}/library/rentalAdd.do'">
<input type="button" value="반납하러가기" onclick="location.href='${path}/library/rentalDelete.do'">
</body>
</html>