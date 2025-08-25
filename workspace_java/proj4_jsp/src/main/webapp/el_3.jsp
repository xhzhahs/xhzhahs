<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	const count = 3 
	const sum = 30
	console.log(`합은 \${sum} 개수는 ${count}`) // 역슬래시 안붙이면 브라우저에서 안나오고 사라짐
</script>
</head>
<body>

${ 10 } <!-- 이건 el태그 -->
\${ 10 } : $ { 10 } <!-- 이렇게하면 그냥 html 출력 -->
\${ null } : *{null}*<br> <!-- null이면 빈공간으로 나옴 -->
\${ 1 + 5 } : #${1+5}#<br>
\${ 10 % 4 } : ${ 10 % 4 }<br>
\${ "15" + 1 } : ${ "15" + 1 } : EL은 계산할 때 문자를 숫자로 바꾼다.<br>
<%-- \${ "a" + "b" } : ${ "a" + "b" }<br> --%>
<%-- \${ "a" + 1 } : ${ "a" + 1 }<br> --%>
<%-- \${ "a" += 1 } : ${ "a" += 1 }<br> --%>
<%
	String a = "a";
	a = a + 1;
%>
\${ 10 % 4 } : ${ 10 % 4 }<br>
\${ 10 mod 4 } : ${ 10 mod 4 }<br>

\${ 10 / 4 } : ${ 10 / 4 }<br>
\${ 10 div 4 } : ${ 10 div 4 }<br>

\${ 10 == 4 } : ${ 10 == 4 }<br>
\${ "a" == "a" } : ${ "a" == "a" }<br>
\${ "a" eq "a" } : ${ "a" eq "a" }<br>
\${ "a" eq null } : ${ "a" eq null }<br>

\${ "a" != "a" } : ${ "a" != "a" }<br>
\${ "a" ne null } : ${ "a" ne null } : not equal<br>

\${ !("a" == "a") } : ${ !("a" == "a") }<br>
\${ not("a" == "a") } : ${ not("a" == "a") }<br>

\${ 100 > 10 } : ${ 100 > 10 }<br>
\${ 100 gt 10 } : ${ 100 gt 10 } : greater then<br>

\${ 100 < 10 } : ${ 100 < 10 }<br>
\${ 100 lt 10 } : ${ 100 lt 10 } : less then 또는 little then<br>

\${ "abc" < "abf" } : ${ "abc" < "abf" }<br>

a&nbsp;&nbsp;&nbsp;&nbsp;a<br>
&lt;/body&gt;

\${ 100 >= 10 } : ${ 100 >= 10 }<br>
\${ 100 ge 10 } : ${ 100 ge 10 } : greater or equal<br>

\${ 100 <= 10 } : ${ 100 <= 10 }<br>
\${ 100 le 10 } : ${ 100 le 10 } : less or equal<br>

\${ (100 <= 10) eq "false" } : ${ (100 <= 10) eq "false" }<br>

\${ (100 > 10) && (7 != 3) } : ${ (100 > 10) && (7 != 3) }<br>
\${ (100 > 10) and (7 != 3) } : ${ (100 > 10) and (7 != 3) }<br>

\${ (100 gt 10) || (7 ne 3) } : ${ (100 gt 10) || (7 ne 3) }<br>
\${ (100 gt 10) or (7 ne 3) } : ${ (100 gt 10) or (7 ne 3) }<br>

<hr>
\${ empty "글씨" } : ${ empty "글씨" }<br>
\${ empty null } : ${ empty null }<br>
\${ empty "" } : ${ empty "" }<br>
출력할 꺼리가 있으면 empty는 false<br>
출력할 꺼리가 없으면 empty는 true<br>

<hr>
request.getParameter("a") : <%= request.getParameter("a") %><br>
의 축약형 param
/${ param.a } : #${ param.a }#<br>
/${ param.b } : #${ param.b }#<br> <!-- 없으면 null이기 때문에 출력안됨 -->

request.getParameterValues("a")[0] : <%= request.getParameterValues("a")[0] %><br>
의 축약형 paramValues.a[0]
\${ paramValues.a } : ${ paramValues.a }<br>
\${ paramValues.a[0] } : ${ paramValues.a[0] }<br>
\${ paramValues.a[1] } : ${ paramValues.a[1] }<br>
\${ paramValues.a[100] } : ${ paramValues.a[100] }<br> <!-- 에러지만 에러가 뜨지 않고 그냥 안나옴 -->


<hr>
request.getAttribute("a"): <%= request.getAttribute("a") %><br>
\${ a } : ${ a }<br>
\${ b } : *${ b }*<br>

\${ list } : ${ list }<br>
\${ list[0] } : ${ list[0] }<br>

\${ arr } : ${ arr }<br>
\${ arr[0] } : ${ arr[0] }<br>

\${ map } : ${ map }<br>
\${ map["k1"] } : ${ map["k1"] }<br>
\${ map.k1 } : ${ map.k1 }<br>

\${ dto } : ${ dto }<br>
\${ dto.ename } : ${ dto.ename }<br> <!-- getter 실행한다. -->


</body>
</html>