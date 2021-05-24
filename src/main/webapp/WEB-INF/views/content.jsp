<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="java.util.*"%>
<%@page import="com.mymovie.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js" ></script>
<script type="text/javascript">
$(function(){
	$('.movies').click(function(){
		if($('.a').css('display')=='none'){
			$('.a').show();	
		}else{
			$('.a').hide();
		}
		
	});
});
</script>

<style type="text/css">
button.movies{
	width:200px;
	height:300px;
}
div.a{
	display:none;
}
</style>
</head>
<body>

<c:forEach var="vo" items="${list}">
	<button class="movies">   
		${vo.title}
		<br>
		${vo.opening_date}
		<br>
	</button>
	<div class="a">${vo.content}</div>
</c:forEach>
</body>
</html>