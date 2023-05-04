<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<form  method="post">
<h3>아이디 <input type="text" name="personID"></h3>
<h3>비밀번호<input type="password" name="password"></h3>
<h3><input type="checkbox" name="rePersonID" ${cookie.rePersonID ne null ? 'checked':''}>아이디저장하기</h3>
<input type="submit" value="Login">
</form>
</body>
</html>