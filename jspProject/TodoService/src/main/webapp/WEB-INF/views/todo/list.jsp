<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDo Service</title>
</head>
<body>
<h1>반갑습니다 ${loginData.lastName}${loginData.firstName}님</h1>

<ul>
<c:forEach  items="${todoList}" var="todo">

<li>
	<a href="${pageContext.request.contextPath}/read?no=${todo.todoNum}">${todo.todoNum} 
	${todo.tilte} ${todo.dueDate} ${todo.finished ? 'Done': 'Not Yet' } ${todo.personID}
</a>
</li>
</c:forEach>
</ul>
<a href="${pageContext.request.contextPath }/register">Add Todo</a>
<c:if test="${loginData ne null}">
<a href="${pageContext.request.contextPath }/logout"> 로그아웃 </a>
</c:if>

</body>
</html>