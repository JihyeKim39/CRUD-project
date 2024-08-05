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
	<table>
	<%
		ResultSet rs = (ResultSet)request.getAttribute("board");
		while(rs.next()){
			
	%>
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
	<div>
		<input type="button" id="btnDelete" value="delete"/>
		<input type="button" id="btnModify" value="modify"/>
	</div>
	<script>
		document.getElementById('btnDelete').addEventListener('click', function(){
			if(confirm('delete.. ok?')){
				document.location.href = '/BOARD_JSP/board/delete.glo?seq=<%=request.getParameter("seq")%>';
			}
		});
		document.getElementById('btnModify').addEventListener('click', function(){
			document.location.href = '/BOARD_JSP/board/updateForm.glo?seq=<%=request.getParameter("seq")%>';
		});
	</script>
	
	
	
	
	
	
</body>
</html>