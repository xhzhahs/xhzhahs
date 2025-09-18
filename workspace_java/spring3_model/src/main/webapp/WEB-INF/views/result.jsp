<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<h1>안녕하세요.</h1>
	당신의 id :  \${id } : ${id } <br>
	당신의 id :  ${memberDTO["id"] }<br>
	-------------------------------------<br>
	당신의 id :  ${memberDTO.id }<br>
	당신의 pw :  ${memberDTO.pw }<br>
	당신의 name :  ${memberDTO.name }<br>
	당신의 age :  ${memberDTO.age }<br>
	당신의 tel :  ${memberDTO.tel }<br>
	-------------------------------------<br>
	당신의 id(memberDTO2) :  ${memberDTO2.id }<br>

</body>
</html>