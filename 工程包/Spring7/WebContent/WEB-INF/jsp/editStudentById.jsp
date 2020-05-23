<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/update.action"
		method="post">
		<table>
			<c:forEach items="${student}" var="student">
				<tr>
					<th align="left" width="80">学生Id&nbsp&nbsp:&nbsp</th>
					<th align="left"><input type="text" name="id"
						value="${student.id}" readonly="readonly"></th>
				</tr>
				<tr>
					<th align="left">登录名称:&nbsp</th>
					<th align="left"><input type="text" name="loginname"
						value="${student.loginname}"></th>
				</tr>
				<tr>
					<th align="left">用户姓名:&nbsp</th>
					<th align="left"><input type="text" name="username"
						value="${student.username}"></th>
				</tr>
				<tr>
					<th align="left">密&nbsp&nbsp&nbsp&nbsp&nbsp码:&nbsp</th>
					<th align="left"><input type="text" name="password"
						value="${student.password}"></th>
				</tr>
				<tr>
					<th><input type="submit" value="修改" /></th>
					<th>&nbsp</th>
				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>