<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="write" method ="post">
			<tr>
				<td>이름</td>
				<td> <input type="text" name="jName" size="50"> </td>
			</tr>
			<tr>
				<td>제목</td>
				<td> <input type="text" name="jTitle" size="50"> </td>
			</tr>
			<tr>
				<td>내용</td>
				<td> <input type="text" name="jContent" rows="10"> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; 
				<a href="list"> 글작성2 </a></td>
			</tr>
		</form>
</body>
</html>
