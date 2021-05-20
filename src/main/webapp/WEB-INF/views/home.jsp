<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Read Database Page</title>

<script type="text/javascript">
function showfn() {
    location.href = "content.do";
}
</script>

<style type="text/css">

#mainImg{
	position: relative;
	
	}
button.btn1{
	position:absolute;
	top:20%;
	left:45%;
}
</style>

</head>
<body>



<div id="mainImg">
 <img src="<c:url value="/resources/img/worldmap.png"/>" class="animation-tossing text-center" style="width:100%">
 <button class="btn1" type="button" onclick="showfn()">영국</button>
</div>
</body>
</html>