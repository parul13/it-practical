<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<title>Practical 2</title>
	
	<body>
		<h1>Result</h1>
		<c:choose>
			<c:when test="${param.calci == 'sum'}">
				<c:out value="${param.num1+param.num2}"/>
			</c:when>
			<c:when test="${param.calci == 'minus'}">
				<c:out value="${param.num1-param.num2}"/>
			</c:when>
			<c:when test="${param.calci == 'multi'}">
				<c:out value="${param.num1*param.num2}"/>
			</c:when>
		</c:choose>
	</body>
</html>
