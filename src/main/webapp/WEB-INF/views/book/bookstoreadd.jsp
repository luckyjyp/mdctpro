<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보관도서등록</title>
<%@ include file="../include/header.jsp" %>
<script>
function bookchk(){
	var reg=/^[A-Z]{1}\d{6}$/g;
	var str=$("#book_no").val();
	
	if(reg.test(str)){
		$.ajax({
			url:"${path}/library/booknochk.do",
			type:"POST",
			data : data=str,
			contentType : "text/plain;charset=UTF-8",
			/* dataType:"text/plain", */
			success:function(data){
				console.log("ajax성공:" +data);
				if(data=="O"){
					alert("없는 도서입니다");
					$("#subBtn").attr("disabled",true);
				}else{
					alert(str+"은 등록 가능합니다.");
					$("#subBtn").attr("disabled",false);
				}
			} 
		});
	}else{
		alert("옳바른 형식이 아닙니다");
	}
}
</script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h1>보관도서등록</h1>
	<form action="${path}/library/bookStoreInsert.do" method="post">
		<p>도서관 번호 : <input name="lib_no" value="001" readonly="readonly">
		<p>도서번호 : <input type="text" name="book_no" id="book_no" maxlength="18">
		<input type="button" id="book_no_chk" value="도서확인" onclick="bookchk()"></p>
		<p>해당 도서가 목록에 없는 경우 <a href="${path}/library/bookAdd.do">도서 등록</a>을 해주세요! </p>
		<p>또는 도서번호가 기억이 안나시면 <a target="_blank" href="${path}/library/book.do">여기</a>를 눌러주세요!</p>
		<input type="submit" value="확인" onclick="" id="subBtn" disabled="disabled">
		<input type="reset" value="취소">
		<input type="button" value="보관도서목록" onclick="location.href='${path}/library/bookStore.do'">
	</form>
</body>
</html>