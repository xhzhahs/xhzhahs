<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" /></title>
<style>
	div {
		border: 1px solid red;
	}
	
	.main_wrapper {
		display:flex;
	}
	.main_wrapper > .side {
		flex-grow: 2;
	}
	.main_wrapper > .content {
		flex-grow: 8;
	}
</style>
<script>
	// 공통으로 쓰는 js
	// window.onload 보다는 window.addEventListeneer쓰는게 좋음.
	window.onload = function(){
		alert(1)
	}
	window.addEventListener("load", function(){
		alert(11)
	})
</script>
</head>
<body>

<%--<%@ import %>--%>
<%--<jsp:include page>--%>

<!-- header -->
<header>
	<tiles:insertAttribute name="header" />
</header>

<!-- main START -->
<section class="main_wrapper">

	<!-- side -->
	<aside class="side">
		<tiles:insertAttribute name="side" />
	</aside>

	<!-- content -->
	<article class="content">
		<tiles:insertAttribute name="content" />
	</article>

</section>
<!-- main END -->

<!-- footer -->
<footer>
	<tiles:insertAttribute name="footer" />
</footer>



</body>
</html>