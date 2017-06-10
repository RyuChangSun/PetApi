<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<c:choose>
	<c:when test="${resultType=='memberList'}">
		<h1>
		    memberList
		</h1>	
		<table border="1">
		    <tr align="center">
		        <td width="100px">회원번호</td>
		        <td width="100px">이메일</td>
		        <td width="100px">이름</td>
		        <td width="100px">비밀번호</td>
		    </tr>
		<c:forEach var="member" items="${members}">
		    <tr align="center">
		        <td>${member.seq_member}</td>
		        <td>${member.email}</td>
		        <td>${member.member_name}</td>
		        <td>${member.password}</td>
		    </tr>
		</c:forEach>
		</table>
		<table border="1">
			<tr>
				<td>jsonString : ${jsonString}</td>
			</tr>
		</table>		
	</c:when>
	<c:when test="${resultType=='memberByUserNo'}">
		<h1>
		    memberByUserNo
		</h1>
		<table border="1">
		    <tr align="center">
		        <td width="100px">회원번호</td>
		        <td width="100px">이메일</td>
		        <td width="100px">이름</td>
		        <td width="100px">비밀번호</td>
		    </tr>
		    <tr align="center">
		        <td>${member.user_no}</td>
		        <td>${member.email}</td>
		        <td>${member.name}</td>
		        <td>${member.password}</td>
		    </tr>
		</table><br/>
		<table border="1">
			<tr>
				<td>jsonString : ${jsonString}</td>
			</tr>
		</table>
	</c:when>
	<c:when test="${resultType=='insertMember'}">
		<h1>
		    insertMember
		</h1>
		<table border="1">
		    <tr align="center">
		        <td width="100px">회원번호</td>
		        <td width="100px">이메일</td>
		        <td width="100px">이름</td>
		        <td width="100px">비밀번호</td>
		    </tr>
		    <tr align="center">
		        <td>${member.user_no}</td>
		        <td>${member.email}</td>
		        <td>${member.name}</td>
		        <td>${member.password}</td>
		    </tr>
		</table><br/>
		<table border="1">
			<tr>
				<td>jsonString : ${jsonString}</td>
			</tr>
		</table>
	</c:when>
	<c:when test="${resultType=='updateMember'}">
		<h1>
		    updateMember
		</h1>
		<table border="1">
		    <tr align="center">
		        <td width="100px">회원번호</td>
		        <td width="100px">이메일</td>
		        <td width="100px">이름</td>
		        <td width="100px">비밀번호</td>
		    </tr>
		    <tr align="center">
		        <td>${member.user_no}</td>
		        <td>${member.email}</td>
		        <td>${member.name}</td>
		        <td>${member.password}</td>
		    </tr>
		</table><br/>
		<table border="1">
			<tr>
				<td>jsonString : ${jsonString}</td>
			</tr>
		</table>
	</c:when>
	<c:when test="${resultType=='deleteMember'}">
		<h1>
		    deleteMember
		</h1>
		<table border="1">
			<tr>
				<td>jsonString : ${jsonString}</td>
			</tr>
		</table>
	</c:when>	
</c:choose>

</body>
</html>