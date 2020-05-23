<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<th align="left" width="80">客户ID:</th>
				<th align="left">${customer.id}</th>
			</tr>
			<tr>
				<th align="left">客户名称:</th>
				<th align="left">${customer.username}</th>
			</tr>
			<tr>
				<th align="left">电话号码:</th>
				<th align="left">${customer.telephone}</th>
			</tr>
			<tr>
				<th align="left" width="80">性别:</th>
				<th align="left">${customer.sex}</th>
			</tr>
			<tr>
				<th align="left">年龄:</th>
				<th align="left">${customer.age}</th>
			</tr>
	</table>
</body>
</html>