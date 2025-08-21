<!-- html 주석 -->
<%-- jsp 주석
	제일 강력하다.
	브라우저에 출력할때 가려져서 나간다.	
--%>
<%--
	"<%@"로 시작하는 태그
	1. page
	2. include
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List"
    import = "java.util.Map"%>
<%@ page import="java.util.ArrayList" %>    
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function(){
		console.log('jsp');
	}
</script>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<h1>jsp.jsp</h1>

<!-- Scriptlet 스크립틀릿 -->
<%
	// 여기는 java 땅입니다.
	System.out.println("test");
	out.println("<strong>강한 글씨</strong>");
%>
<table border=1>
<%
	for(int i=0; i<5; i++){
%>
	<tr>
		<td>제목</td>
		<td>내용</td>
	</tr>
<%
	}
// 	자바 영역을 중간에 나눈 후 연결해준 것이다.
%>
</table>
<%
	int a = 10;
	String name = request.getParameter("name");
%>
여기서 a : <% out.println(a); %><br>
여기서 name : <% out.println(name); %><br>

<%-- 
	표현식
	out.println을 안쓰고 사용할 수 있다.
	<%= %> 사용
--%>
<%=a %><br>
<%=name %><br>

<!-- 선언문 -->
<!-- 필드영역으로 빼주므로 메소드도 작성 가능 -->

<%!
	String title = "F1";

	String getTitle(){
		return this.title;
	}
%>

구구단<br>

<%
	int i = 3;
		for(int j = 1; j<=9; j++){
			
		out.println(i+"X"+ j +"="+ (i*j));
		
%>
<br>
<%
		}
%>








</body>
</html>