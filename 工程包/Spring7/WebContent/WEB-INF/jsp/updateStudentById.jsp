<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/search"
		method="post">
		请输入学生Id：<input type="text" name="id" /><br /> 
		<input type="submit" value="Search" />
	</form>
</body>
</html>