<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo add</title>
</head>
<body>
<h1>Todo add (${loginData.lastName}${loginData.firstName})</h1>
<form method="post">

	할일 : <input type="text" name="title"> <br>
	날짜 : <input type="date" name="duedate"><br>
	유저명 : <input type="text" name ="personID"><br>
	<input type="reset" value="reset"><input type="submit" value="Add"> 
</form>

</body>
</html>