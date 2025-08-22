<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

pageScope : ${ pageScope.game }<br>
requestScope : ${ requestScope.game }<br>
sessionScope : ${ sessionScope.game }<br>
applicationScope : ${ applicationScope.game }<br>

<%-- <jsp:forward page="jstl_4-1.jsp" /> --%>

<hr>

<c:if test="true">
	항상 참<br>
</c:if>

<c:if test="${ a eq 10 }">
	a는 10이 맞습니다.
</c:if>

<%-- <c:if test="${ a ne 10 }"> --%>
<c:if test="${ not(a eq 10) }">
	a는 10이 아닙니다.
</c:if>
if에는 else가 없다.

choose는 switch와 비슷한 느낌
<c:choose>
	<c:when test="a eq 8">
		a는 8입니다.
	</c:when>
	<c:when test="a eq 9">
		a는 9입니다.
	</c:when>
	<c:otherwise>
		a는 8이나 9가 아닙니다.
	</c:otherwise>
</c:choose>
<hr>
<%
	List list = new ArrayList();
	for(int i=0; i<4; i++){
		Map map = new HashMap();
		map.put("title", "노래"+i);
		map.put("singer", "가수"+i);
		
		list.add(map);
	}
%>
<c:set var="list2" value="<%= list %>" scope="page" />
그냥 첫번째 제목 : ${ list2[0].title }

<%-- <c:forEach var="song" items="<%= list %>"> --%> <!-- 이렇게 사용도 가능하다. -->
<c:forEach var="song" items="${list2 }">
	title : ${song.title }<br>
	singer : ${song.singer }<br>
</c:forEach>
<hr>
for문처럼 사용<br>
begin, end<br>
<c:forEach var="i" begin="0" end="5">
	${ i },${ list2[i].title }<br>
</c:forEach>
<hr>
step<br>
<c:forEach var="i" begin="0" end="5" step="2">
	${ i },${ list2[i].title }<br>
</c:forEach>
<hr>
varStatus<br>
<c:forEach var="i" begin="0" end="8" step="2" varStatus="loop">
	${i}<br>
	loop.index : ${loop.index}<br>
	loop.count : ${loop.count}<br>
	loop.first : ${loop.first}<br>
	loop.last : ${loop.last}<br> <!-- 마지막이 맞나? -->
</c:forEach>
loop.last 사용법<br>
<c:forEach var="i" begin="0" end="8" step="2" varStatus="loop">
	${i}
	<c:if test="${not loop.last }"> <!-- 마지막이 아닐 경우에만 "," 사용할때 -->
	,
	</c:if>
</c:forEach>
<hr>
items, begin 등 같이 사용<br>
<c:forEach var="song" items="${list2 }" begin="1" end="2">
	${song.title }
</c:forEach>
<hr>
2~9단까지 구구단 출력. 단, 5단은 출력하지 않음<br>
<c:forEach var="i" begin="2" end="9">
	<c:if test="${not (i eq 5) }">
		${i}단<br>
		<c:forEach var="j" begin="1" end="9">
			${i}X${j}=${ i*j }<br>
		</c:forEach>	
	</c:if>
</c:forEach>
<hr>
c:url<br>
사용이유<br>
1. value에 숫자 외 한글이나 특수문자를 사용할때 자동으로 인코딩해줌
2. context path 자동 추가해줌 절대경로 사용시 유리(/proj_jsp)<br>
3. 쿠키 금지일 때 ";jsessionid="를 자동으로 붙여줌
<c:url var="url1" value="/jsp_1.jsp">
	<c:param name="name" value="한글" />
</c:url>
<a href="${url1 }" target="_blank">jsp_1.jsp</a>
<hr>
param.addr : ${param.addr } : innerHTML과 같은 것<br>
c:out :::: <c:out value="${param.addr }" /> : innerText와 같은 것<br>
특수 문자를 치환해서 문자 그자체로 출력

<!-- 
	< : &lt;
	> : &gt;
  " " : &nbsp;
	& : &amp;
 -->







</body>
</html>