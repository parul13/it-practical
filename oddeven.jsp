<%-- 
    Document   : oddeven
    Created on : Nov 22, 2019, 11:52:33 AM
    Author     : rishabh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Vowel</title>
    </head>
    <body>
        <form action ="oddeven.jsp">
        Enter a Word :<br><br>
        <input type="text" name="word" required/><br><br>
        ODD<input type="radio" name="pos" value="odd" required/><br>
        EVEN<input type="radio" name="pos" value="even"/><br><br>
        <input type="submit" value="Submit"/><br><br>
        </form>
        
        <c:if test="${param.word != null}">
            
            <c:set var="word" value="${param.word}"/>
            <c:set var="pos" value="${param.pos}"/>
            <c:set var="vowel" value="aeiou"/>
            <c:set var="flag" value="true"/>
            
            <c:if test="${pos == 'odd'}">
                <c:forEach begin="0" end="${word.length() - 1}" step="2" var="i">
                    <c:if test="${flag}">
                        <c:if test="${! fn:contains(vowel,word.charAt(i))}">
                            <c:set var="flag" value="false"/>
                        </c:if>
                    </c:if>
                </c:forEach>
         
                <c:if test="${flag}">
                    You Win
                </c:if>
                <c:if test="${! flag}">
                    You Lose
                </c:if>
            </c:if>
            
            <c:if test="${pos == 'even'}">
                <c:forEach begin="1" end="${word.length() - 1}" step="2" var="i">
                    <c:if test="${flag}">
                        <c:if test="${! fn:contains(vowel,word.charAt(i))}">
                            <c:set var="flag" value="false"/>
                        </c:if>
                    </c:if>
                </c:forEach>
         
                <c:if test="${flag}">
                    You Win
                </c:if>
                <c:if test="${! flag}">
                    You Lose
                </c:if>
            </c:if>
            
        </c:if>
        
    </body>
</html>