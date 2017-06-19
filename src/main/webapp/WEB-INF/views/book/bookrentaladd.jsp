<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>대여등록</title>
<%@ include file="../include/header.jsp" %>
<script>
var flag1 = false;
var flag2 = false;


$(function(){
	
	
});

function bookchk(){
	var reg=/^[A-Z]{1}\d{6}$/g;
	var str=$("#book_no").val();
	
	if(reg.test(str)){
		$.ajax({
			url:"${path}/library/storenochk.do",
			type:"POST",
			data : data=str,
			contentType : "text/plain;charset=UTF-8",
			/* dataType:"text/plain", */
			success:function(data){
				console.log("ajax성공:" +data);
				if(data=="O"){
					alert("없는 도서입니다");
					flag1 = false;
				}else{
					alert(str+"은 등록 가능합니다.");
					flag1 = true;
				}
			} 
		});
	}else{
		alert("옳바른 형식이 아닙니다");
	}
	
	flag_chk();
}

function borchk(){
	var reg=/^\d{9}$/g;
	var str=$("#bor_no").val();
	
	if(reg.test(str)){
		$.ajax({
			url:"${path}/library/bornochk.do",
			type:"POST",
			data : data=str,
			contentType : "text/plain;charset=UTF-8",
			/* dataType:"text/plain", */
			success:function(data){
				console.log("ajax성공:" +data);
				if(data=="O"){
					alert("없는 번호입니다");
					flag2 = false;
				}else{
					flag2 = true;
					alert(str+"님 환영합니다.");
				}
			} 
		});
	}else{
		alert("옳바른 형식이 아닙니다");
	}
	flag_chk();
}

function flag_chk(){
	if(flag1 == true && flag2 == true){
		$("#subBtn").attr("disabled",false);
	}else{
		$("#subBtn").attr("disabled",true);
	}
}
</script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h1>대여등록</h1>
	<form action="${path}/library/bookRentalInsert.do" method="post">
		<p>대출자 : <input type="text" name="bor_no" id="bor_no" maxlength="9">
		<input type="button" id="bor_no_chk" value="대출자확인" onclick="borchk()"></p>
		<p>도서번호 : <input type="text" name="book_no" id="book_no" maxlength="18">
		<input type="button" id="book_no_chk" value="도서확인" onclick="bookchk()"></p>
		<p>해당 도서가 목록에 없는 경우 <a href="${path}/library/bookAdd.do">도서 등록</a>을 해주세요! </p>
		<p>또는 도서번호가 기억이 안나시면 <a target="_blank" href="${path}/library/bookStore.do">여기</a>를 눌러주세요!</p>
		<input type="submit" value="확인" onclick="" id="subBtn" disabled="disabled">
		<input type="reset" value="취소">
	</form>
</body>
</html>