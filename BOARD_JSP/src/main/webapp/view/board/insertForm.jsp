<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	insertForm.jsp
	<br>
	<form action="/BOARD_JSP/board/insert.glo" method="post">
		<input type="text" name="title" placeholder="title"/><br>
		<input type="text" name="content" placeholder="content"/><br>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>