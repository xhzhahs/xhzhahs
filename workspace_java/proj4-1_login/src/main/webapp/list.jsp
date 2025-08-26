<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- toString이 오버라이드 되어 있어서 그 결과가 나옴 -->

	dto : ${dto } <br>
	\${empty dto } : ${empty dto }
	
<%-- 	<c:if test="${ dto == null }"> --%>
<%-- 	<c:if test="${ dto eq null }"> --%>
	<c:if test="${empty dto }">
		<c:redirect url="login.jsp" />
	</c:if>
	<%
// 		이 방법도 가능하지만 현재 패키지가 없어서 import못하므로 일단 주석
// 		EmpDTO dto = (EmpDTO)session.getAttribute("dto");
// 		if(dto == null){
// 			response.sendRedirect("login.jsp");
// 		}
	%>
<h1>회원목록</h1>
<c:if test="${dto.job eq 'PRESIDENT' }">
[관리자]
</c:if>
${dto.ename }님 반갑습니다.<br>
<a href="logout">로그아웃</a>
<table border=1>
	<tr>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>mgr</th>
		<th>비고</th>
	</tr>
	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.empno }</td>
			<td>${dto.ename }</td>
			<td>${dto.job }</td>
			<td>${dto.mgr }</td>
			<td>
<%-- 				<c:if test="${sessionScope.dto.job eq 'PRESIDENT' }"> --%>
<!-- 				[수정] -->
<%-- 				</c:if> --%>
				<c:if test="${sessionScope.dto.empno eq dto.empno }">
				[수정]
				</c:if>
			</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>