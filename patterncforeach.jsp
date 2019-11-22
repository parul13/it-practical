<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Pattern</title>
    </head>
    <body>
        
        
        <c:forEach var="i" begin="1" end="${param.num}">
            <c:forEach var="j" begin="1" end="${i}">
                <c:out value="${j} "/>
            </c:forEach>
            <br>
        </c:forEach>
            
    </body>
</html>