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
<h1>로그인</h1>

<form method="post" action="loginCheck">
	id : <input type="text" name="ename" value="ALLEN"><br>
	pw : <input type="text" name="empno" value="7499"><br>
	<button type="submit">로그인</button><br>
	
<!-- 	getParameter로 받았으니 그냥 msg가 아니라 param.msg로 써야한다. -->
	<c:if test="${param.msg eq '1' }">
		<span style="color:red">
			아이디와 패스워드를 확인해라
		</span>
	</c:if>
	
</form>



</body>
</html>