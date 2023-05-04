<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	Date now = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<style>

ul li{
 display: inline-block;
 text-align: center;
}
a{
text-decoration: none;
color: gray;
font-size: 25px;
}
body{
text-align:center;
background-color: skyblue;
}

body footer{
text-align:right;
}

</style>
<meta charset="UTF-8">
<title>ToDo List Service</title>
</head>
<body>
<header>
<h1>시작 페이지 입니다.</h1>
</header>
<h2>현재 시간 </h2>
<h2><%= now %></h2>
<br>
<nav>
<ul>
<li><a href="signUp">회원등록</a></li>
<li><a href="login">로그인</a></li>
</ul>
</nav>
<footer>
<h3> Copy right </h3>
<h3> 2023-05-04 made by Jaehyun Joung...</h3>
</footer>

</body>
</html>