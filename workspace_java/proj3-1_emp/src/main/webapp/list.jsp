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
	<table border="1">
		<tr>
			<th>id</th>
			<th>pw</th>
			<th>job</th>
			<th>회원구분</th>
		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td><c:out value="${emp.ename}" /></td>
				<td><c:out value="${emp.empno}" /></td>
				<td><c:out value="${emp.job}" /></td>
				<td>
 					<c:choose>
						<c:when test="${emp.job == 'PRESIDENT' }">
							관리자
						</c:when>
						<c:when test="${emp.job == 'CLERK' }">
							비회원
						</c:when>
						<c:otherwise>
							일반회원
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>