<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	updateForm.jsp
	<br>
	<%
		ResultSet rs = (ResultSet)request.getAttribute("board");
		while(rs.next()){
			
	%>
	<form action="/BOARD_JSP/board/update.glo" method="post">
		<input type="hidden" name="seq" value="<%=rs.getString("seq") %>"/>
		<input type="text" name="title" value="<%=rs.getString("title") %>" placeholder="title"/><br>
		<input type="text" name="content" value="<%=rs.getString("content") %>" placeholder="content"/><br>
		<input type="submit" value="submit"/>
	</form>
	<%
		}
	%>
</body>
</html>