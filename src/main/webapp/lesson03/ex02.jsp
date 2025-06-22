<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<%--
		1) 가입: ex02.jsp(가입) -> InsertEx02(서블릿, insert) -> ex02_user.jsp(유저 목록, select)
	 --%>
	 
	<form method="post" action="/lesson03/insert-ex02">
		<p>
			<b>이름</b>
			<input type="text" name="name"><br>
		</p>
		<p>
			<b>생년월일</b>
			<input type="text" name="yyyymmdd"><br>
		</p>
		<p>
			<b>이메일</b>
			<input type="text" name="email"><br>
		</p>
		<p>
			<b>자기소개</b><br>
			<textarea rows="5" cols="50" name="introduce"></textarea>
		</p>
		
		<input type="submit" value="회원가입">	
	</form>
	 
</body>
</html>