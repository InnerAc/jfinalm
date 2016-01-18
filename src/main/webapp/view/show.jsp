<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello!!
	<br>
	<table border="1" cellpadding="10">
		<c:forEach items="${infos}" var="info">
			<tr>
				<td> <c:out value='${info.CITYCODE}' /> </td>
				<td> <c:out value='${info.CITYNAME}' /> </td>
				<td> <c:out value='${info.PARENTNODE}' /> </td>
				<td> <c:out value='${info.FLAG}' /> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>