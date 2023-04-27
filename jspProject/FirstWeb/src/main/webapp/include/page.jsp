<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<style>
	h1{
	text-align: center;
	}
	table{
	width :100%;
	text-align: center;
	}
	table td{
	width : 50%;
	
	}
  .menu{
  text-align: center;
  }
</style>

</head>
<body>
	<h1>include를 이용한 페이지 모듈화</h1>
	<hr>
	<%@ include file="menu.jsp" %>
	<table>
		<tr>
			<td>
				<%@ include file="news.jsp" %>
			</td>
			<td>
				<%@ include file="shopping.jsp" %>
			</td>
		</tr>
	</table>
</body>
</html>