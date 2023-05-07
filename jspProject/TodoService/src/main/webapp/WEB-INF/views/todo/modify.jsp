<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo 수정</title>
</head>
<body>
	<h1>${loginData.lastName}${loginData.firstName}님의 수정작업</h1>
	<form>
		작업자 : <input type="text" name="personID"
			value="${loginData.personID }" readonly><br> 
			번호 : <input
			type="text" name="todoNum" value="${todo.todoNum}" readonly>
		<br> 할일 : <input type="text" name="title" value="${todo.title }"
			readonly> <br> 날짜 : <input type="date" name="duedate"
			value="${todo.duedate }" readonly><br> 완료 : <input
			type="checkbox" name="finished" ${todo.finished ? 'checked' : ''}><br>
		<input type="reset"> <input type="submit" value="Modify">
	</form>

</body>
</html>