<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<c:choose>
	<c:when test="${resultType=='boardList'}">
		<h1>
		    boardList
		</h1>	
		<table border="1">
		    <tr align="center">
		    	<td width="100px">게시판번호</td>
		        <td width="100px">타이틀</td>
		        <td width="100px">내용</td>
		        <td width="100px">이미지주소</td>
		        <td width="100px">좋아요</td>
		    </tr>
		<c:forEach var="board" items="${board}">
		    <tr align="center">
		    	<td>${board.seq_board}</td>
		        <td>${board.title}</td>
		        <td>${board.contents}</td>
		        <td>${board.image_url}</td>
		        <td>${board.like_cnt}</td>
		    </tr>
		</c:forEach>
		</table>
		<table border="1">
			<tr>
				<td>jsonString : ${jsonString}</td>
			</tr>
		</table>		
	</c:when>
		
</c:choose>

</body>
</html>