<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>주문 내역</h1> 
<strong>
피자 종류 :
</strong>
<%
	out.println(request.getAttribute("p_type"));
%>
<br>
<strong>
사이즈 :
</strong>
<%
	out.println(request.getAttribute("p_size"));
%>
<br>
<strong>
토핑 :
</strong>
<%
	out.println(request.getAttribute("t_order"));
%>
<br>
<strong>
요청사항 :
</strong>
<%
	out.println(request.getAttribute("text"));
%>
</form>
</body>
</html>