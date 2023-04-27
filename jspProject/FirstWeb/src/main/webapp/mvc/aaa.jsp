<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// controller 역활
	// 데이터 처리만!
	
	
	String type = request.getParameter("type");

	request.setAttribute("result", type);
	
	// forward 처리 => bbb.jsp
	String[] str = {"aaa","bbb","ccc"};
	request.setAttribute("list", str);
%>

<jsp:forward page="bbb.jsp"/>
