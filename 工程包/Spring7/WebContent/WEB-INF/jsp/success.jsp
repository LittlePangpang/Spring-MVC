<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>成功</title>
 
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 
<script type="text/javascript">
	var time = 3;
 
	function returnUrlByTime() {
 
		window.setTimeout('returnUrlByTime()', 1000);
 
		time = time - 1;
 
		document.getElementById("layer").innerHTML = time;
	}
</script>
 
</head>
 
<body  οnlοad="returnUrlByTime()">
	
	<h3>登录成功！</h3>
	<b><span id="layer">3</span>秒后，进入学生信息展示界面。</b>
	
	<%
		//转向语句
		response.setHeader("Refresh", "3;URL=findAll.action");
	%>
 
</body>