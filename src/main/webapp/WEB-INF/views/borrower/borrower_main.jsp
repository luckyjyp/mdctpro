<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>대출자</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<c:choose>
    <c:when test="${sessionScope.bor_no}==null">
      <button type="button" onclick="location.href='${path}/borrower/login.do'">로그인하기</button>
    </c:when>
    <c:otherwise>
      <button type="button" onclick="<a href='${path}/borrower/logout.do'>로그아웃 하기</a>">로그아웃 하기</button>
      <span style="text-align: right;">${sessionScope.bor_name }님 환영합니다!</span>
    </c:otherwise>
 </c:choose>
	<h1>대출자페이지입니다.</h1>
</body>
</html>