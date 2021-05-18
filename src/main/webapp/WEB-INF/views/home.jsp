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
    location.href = "/www.naver.com";
}
</script>

<style type="text/css">

#mainImg{
	position: relative;
	}
button.btn1{
	position:absolute;
	top:70px;
	left:200px;
}
</style>

</head>
<body>

<%@ page import = "java.sql.*, java.util.*" %>
MySQL 데이터 읽기
<%
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "fpem3309");
	stmt = conn.createStatement();
	rs = stmt.executeQuery("select * from study.movie");
%>
<br><br>----------------------------------------<br>
<% while(rs.next()) { %>
<br> 제목: <%= rs.getString("title") %><br>
--------------------------------------------<br><br>
<%
} 
}catch (SQLException e) { %>
<% e.printStackTrace(); %>
<%	
} finally {
	if(rs!=null)
		try {
			rs.close();
		} catch (SQLException e) {}
	if(stmt!=null)
		try {
			stmt.close();
		} catch (SQLException e) {}
	if(conn!=null)
		try {
			conn.close();
		} catch (SQLException e) {}
}
%>

<div id="mainImg">
 <img src="<c:url value="/resources/img/worldmap.png"/>" class="animation-tossing text-center" style="width:100%">
 <button class="btn1" type="button" onclick="showfn()">버튼</button>
</div>
</body>
</html>