<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo 상세정보</title>
</head>
<body>

<h1>Todo 상세보기</h1>

	번호 : <input type="text" name="no" value="${no}" readonly> <br>
	할일 : <input type="text" name="todo" value="${todo }" readonly> <br>
	날짜 : <input type="date" name="duedate" value="${duedate }" readonly><br>
	완료 : <input type="checkbox" name="complete" ${complete == 'done' ?'checked' : ''}><br>
	<!-- checkbox value => "on" -->
	<a href="modify?no=${no}">수정</a>
	<!--  <a href="#">삭제</a> -->
	<form action="delete" method="post">
		<input type="hidden" name="no" value="${no}">
		<input type="submit" value="Delete">
	</form>
	
</body>
</html>