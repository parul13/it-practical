<%-- 
    Document   : prg6
    Created on : 22 Nov, 2019, 3:21:18 PM
    Author     : kiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="/WEB-INF/tlds/mytag"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <t:hellotag name="ajay"></t:hellotag>
        <t:choctag texture="chewy"></t:choctag>
        <t:tdate></t:tdate>
        <t:revtag str="kiran"></t:revtag>
    </body>
</html>
