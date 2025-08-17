<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz</title>
</head>
<body>
<h1>로그인</h1>
<form method="get" action="login">
	아이디 <input type="text" name="id"><br>
	비밀번호 <input type="text" name="pw">
	<input type="submit" value="Login"><br>
	<% 
		out.println(request.getAttribute("message"));
	%>
</form>
<hr>
<h1>회원가입</h1>
<form method="get" action="sign">
	아이디 <input type="text" name="sign_id" id="s_id"><br>
	비밀번호 <input type="text" name="sign_pw" id="s_pw"><br>
	비밀번호 확인 <input type="text" name="confirm_pw" id="c_pw">
	<input type="submit" value="회원가입"><br>
	<%
		out.println(request.getAttribute("sign"));
	%>
</form>
<h1>구구단</h1>
<form method="get" action="gugudan">
	몇단 :<br>
	<input type="number" name="dan">
	<input type="submit" value="확인"><br>
	
</form>
<h1>피자</h1>
<form method="post" action="pizza">
	피자종류
	<select name="type" value="종류">
		<option value="불고기">불고기피자</option>
		<option value="페퍼로니">페퍼로니피자</option>
		<option value="치즈">치즈피자</option>
	</select>
	<br>
	사이즈
	<input type="radio" name="size" value="레귤러" checked>레귤러
	<input type="radio" name="size" value="라지">라지
	<br>
	토핑
	<input type="checkbox" name="check" value="치즈">치즈
	<input type="checkbox" name="check" value="토마토">토마토
	<input type="checkbox" name="check" value="고구마">고구마
	<input type="checkbox" name="check" value="감자">감자
	<input type="checkbox" name="check" value="선택안함" checked>선택 안함
	<br>
	요청사항
	<br>
	<textarea name="text">
	</textarea>
	<input type="submit" value="주문">
</form>
<script>
	const pw = document.querySelector('#s_pw');
	const confirm_pw = document.querySelector('#c_pw');
	confirm_pw.addEventListener('blur', function(){
		
		if(pw.value != confirm_pw.value){
			alert("비밀번호가 다릅니다.")
		}
		
	})
</script>
</body>
</html>