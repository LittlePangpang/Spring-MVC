<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
<a href="searchStudentById">根据Id查询学生</a></br>
<a href="addStudent">添加学生信息</a></br>
<a href="updateStudentById">修改学生信息</a></br>
<a href="deleteStudentById">删除学生信息</a></br>
<a href="logout.action">退出登录</a></br>
	<table>
		<c:forEach items="${students}" var="student">
			<tr>
				<th align="left" width="80">学生ID:</th>
				<th align="left">${student.id}</th>
			</tr>
			<tr>
				<th align="left">登录账户:</th>
				<th align="left">${student.loginname}</th>
			</tr>
			<tr>
				<th align="left">用户名称:</th>
				<th align="left">${student.username}</th>
			</tr>
			<tr>
				<th align="left">密码:</th>
				<th align="left">${student.password}</th>
			</tr>
			<tr>
				<th>&nbsp</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>