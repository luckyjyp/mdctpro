<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서등록페이지</title>
<%@ include file="../include/header.jsp" %>
</head>
<script>
	$(document).ready(function(){
			
	});
	
	function bookchk(){
		var reg=/^[A-Z]{1}\d{6}$/g;
		var str=$("#book_no").val();
		
		
		if(reg.test(str)){
			/* var data2 = {book_no : str};
			var data = JSON.stringify(data2);
			
			$.ajax({
				url:"${path}/library/booknochk.do",
				type:"POST",
				data : data,
				contentType : "application/json;charset=UTF-8",
				dataType:"text/plain",
				success:function(data){
					console.log("ajax성공:" +data);
					if(data=="O"){
						alert("사용가능한 도서번호 입니다.");
					}else{
						alert("해당 도서번호는 이미 존재합니다.");
					}
				} 
			});*/
			
			$.ajax({
				url:"${path}/library/booknochk.do",
				type:"POST",
				data : data=str,
				contentType : "text/plain;charset=UTF-8",
				/* dataType:"text/plain", */
				success:function(data){
					console.log("ajax성공:" +data);
					if(data=="O"){
						alert("사용가능한 도서번호 입니다.");
					}else{
						alert("해당 도서번호는 이미 존재합니다.");
					}
				} 
			});
		}else{
			alert("옳바른 형식이 아닙니다");
		}
	}
</script>
<body>
<%@ include file="../include/menu.jsp" %>
	<h1>도서 신규 등록하기</h1>
	
	<form action="${path}/library/bookInsert.do" method="post">
		<p>도서번호 : <input type="text" name="book_no" id="book_no" maxlength="18">
		<input type="button" id="book_no_chk" value="중복확인" onclick="bookchk()"></p>
		<p>도서이름 : <input type="text" name="book_name" maxlength="30"></p>
		<p>저자 : <input type="text" name="writer" maxlength="18"></p>
		<p>장르 : <!-- <input type="text" name="genre" maxlength="18"> -->
		<select name="genre">
			<option value="소설">소설</option>
			<option value="시/에세이">시/에세이</option>
			<option value="인문">인문</option>
			<option value="가정/육아">가정/육아</option>
			<option value="요리">요리</option>
			<option value="건강">건강</option>
			<option value="취미/실용/스포츠">취미/실용/스포츠</option>
			<option value="경제/경영">경제/경영</option>
			<option value="자기계발">자기계발</option>
			<option value="정치/사회">정치/사회</option>
			<option value="역사/문화">역사/문화</option>
			<option value="종교">종교</option>
			<option value="예술/대중문화">예술/대중문화</option>
			<option value="중/고등참고서">중/고등참고서</option>
			<option value="기술/공학">"기술/공학"</option>
			<option value="외국어">외국어</option>
			<option value="과학">과학</option>
			<option value="취업/수험서">취업/수험서</option>
			<option value="여행">여행</option>
			<option value="컴퓨터/IT">컴퓨터/IT</option>
			<option value="잡지">잡지</option>
			<option value="청소년">청소년</option>
			<option value="초등참고서">초등참고서</option>
			<option value="유아0~7세">유아0~7세</option>
			<option value="어린이(초등)">어린이(초등)</option>
			<option value="어린이영어">어린이영어</option>
			<option value="만화">만화</option>
			<option value="대학교재">대학교재</option>
			<option value="어린이전집">어린이전집</option>
			<option value="한국소개도서">한국소개도서</option>
			<option value="K컬렉션">K컬렉션</option>
			<option value="기타">기타</option>
		</select></p>
		<p>가격 : <input type="text" name="price" maxlength="18"></p>
		<p>출판사 : 
		
			<select name="pub_no" id="pub_box">
				<c:forEach var="pub" items="${list}">
					<option value="${pub.pub_no}"> ${pub.pub_name} </option>
				</c:forEach>
			</select>
		</p>
		<p>해당 출판사가 목록에 없는 경우 <a href="#">출판사 등록</a>을 해주세요! </p>
		
		<input type="submit" value="확인" onclick="">
		<input type="reset" value="취소">
		<input type="button" value="도서목록으로" onclick="location.href='${path}/library/book.do'">
	</form>
</body>
</html>