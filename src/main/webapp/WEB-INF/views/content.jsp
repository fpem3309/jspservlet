<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="java.util.*"%>
<%@page import="com.myboard.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js" ></script>

<script type="text/javascript">
	function contentFn(){
		location.href="<c:url value="/detail.do"/>"; //?movie_no="+ movie_no
	}
</script>

<style type="text/css">
button.movies{
	width:200px;
	height:300px;
}
div.content{
	display:none;
	width:200px;
	height:300px;
}
</style>
</head>
<body>

<c:forEach var="vo" items="${list}" varStatus="status">
		<button class="movies" onclick="contentFn()">
		${vo.title} ${vo.movie_no}
	</button>
	
</c:forEach>
</body>
</html>