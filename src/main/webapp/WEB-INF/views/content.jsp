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
<script type="text/javascript">
function contentfn() {
	location.href = "";
}
</script>

<style type="text/css">
button.movies{
	width:145px;
	height:300px;
}
</style>
</head>
<body>
<%-- <table>
<c:forEach var="vo" items="${list}">
        <tr>
          <td>${vo.title}</td>
          <td>${vo.content}</td>
          <td>${vo.opening_date}</td>
      </tr>
</c:forEach>
</table> --%>
<%@ page import = "java.sql.*, java.util.*" %>
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
<% while(rs.next()) { %>
<button class="movies" onclick="contentfn()">
<br> 제목: <%= rs.getString("title") %><br>
줄거리: <%= rs.getString("content") %><br>
개봉일: <%= rs.getString("opening_date") %>
<br>
<br>
</button>
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
</body>
</html>