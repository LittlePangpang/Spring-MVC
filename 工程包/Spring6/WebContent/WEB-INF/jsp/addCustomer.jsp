<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加客户信息</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/addCustomer"
		method="post">
		客户名称：<input type="text" name="username" /><br /> 
		电话号码：<input type="text" name="telephone" /><br />
		性&nbsp&nbsp&nbsp&nbsp别：
		<select name="sex">
			<option  value="男">男</option>
			<option  value="女">女</option>
		</select> </br>
		年&nbsp&nbsp&nbsp&nbsp龄：<input type="text" name="age" /><br /> <input
			type="submit" value="add" />
	</form>

</body>
</html>