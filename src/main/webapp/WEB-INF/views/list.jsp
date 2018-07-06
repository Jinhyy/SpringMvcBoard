<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
	<c:forEach items="${list}" var="dto">
	<tr>
		<td>${dto.jId}</td>
		<td>${dto.jName}</td>
		<td>
			<c:forEach begin="1" end="${dto.jIndent}">-</c:forEach>
			<a href="content_view?jId=${dto.jId}">${dto.jTitle}</a>
		</td>
		<td>${dto.jDate}</td>
		<td>${dto.jHit}</td>
	</tr>
	</c:forEach>
	</table>
	<tr>
		<td colspan="5"> <a href="write_view"> 글작성 </a></td>
	</tr>
	</table>
</body>
</html>
