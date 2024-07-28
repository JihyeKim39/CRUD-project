<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	read.jsp
		<%
		ResultSet rs = (ResultSet) request.getAttribute("list");
		while (rs.next()) {
		%>
<table>
		<tr>
			<td>seq</td>
			<td><%=rs.getString("seq") %></td>
		</tr>
		<tr>
			<td>title</td>
			<td><%=rs.getString("title") %></td>
		</tr>
		<tr>
			<td>content</td>
			<td><%=rs.getString("content") %></td>
		</tr>
		<tr>
			<td>createdate</td>
			<td><%=rs.getString("createdate") %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>