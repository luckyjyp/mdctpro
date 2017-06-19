<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function(){
	  $("#btnLogin").click(function(){
		  var bor_no = $("#bor_no").val();
		  var bor_tel = $("#bor_tel").val();
		  
		  if(bor_no == "") {
			  alert("아이디를 입력!");
			  $("#bor_no").focus();
			  return;
		  }
		  if(bor_tel == "") {
			  alert("전화번호 입력!");
			  $("#bor_tel").focus();
			  return;
		  }
		  
		  document.form1.action="${path}/borrower/loginCheck.do";
		  document.form1.submit();
	  })	;
});
</script>
</head>
<body>
<%@include file="../include/menu.jsp" %>
  <form name="form1" method="post">
    아이디 : <input type="text" name="bor_no" id="bor_no"><br>
    비밀번호 : <input type="text" name="bor_tel" id="bor_tel">
    <button type="button" id="btnLogin">로그인</button><br>
    
    <c:if test="${msg == 'failure' }">
      <div style="color: red">
      아이디 또는 비밀번호가 일치하지 않습니다.</div>
    </c:if>
    <c:if test="${msg == 'logout' }">
      <div style="color: blue">
      로그아웃 되었습니다.</div>
    </c:if>
  </form>
</body>
</html>