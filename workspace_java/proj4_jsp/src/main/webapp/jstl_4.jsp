<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 여기서 el태그 못쓰게  disabled 사용 할 수 있음 -->
<!-- jstl 사용시 아래태그 꼭!! 쓰기 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL</h1>
<c:set var="a" value="10" /> <!-- c:set 은 변수명 생성 -->
\${a } : ${a }<br>
<%
	String name = "휴먼";
%>
\${ name } : ${ name }<br> <!-- c:cet을 거치지 않으면 나오지 않음 -->

<c:set var="name2" value= "<%= name %>" />
\${ name2 } : ${ name2 }<br>

<c:set var="name3" value= "${ a }" />
\${ name3 } : ${ name3 }<br>

<hr>
scope : page > request > session > application<br> 순으로 생명이 길다.
<c:set var="a1" value= "1"  scope="page" />
scope 생략하면 page<br>

<c:set var="game" value= "LOL"  scope="page" />
<c:set var="game" value= "마비노기"  scope="request" />
<c:set var="game" value= "서든어택"  scope="session" />
<c:set var="game" value= "세븐나이츠"  scope="application" />
\${ game } : ${ game }<br>

pageScope : ${ pageScope.game }<br>
requestScope : ${ requestScope.game }<br>
sessionScope : ${ sessionScope.game }<br>
applicationScope : ${ applicationScope.game }<br>






</body>
</html>