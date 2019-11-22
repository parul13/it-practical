<%-- 
    Document   : goodmrg
    Created on : Nov 22, 2019, 11:21:56 AM
    Author     : rishabh
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting</title>
    </head>
    <body>
        <h1>Form</h1>
        <form method="post" action="goodmrg.jsp">
            Enter your Name :<br>
            <input type="text" name="name"><br><br>
            <input type="submit" value="Submit">
        </form>
            <%
                if(request.getParameter("name")!=null){
                    out.println("<br>Good ");
                    int n = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                    if(n < 5){
                        out.println("Night ");
                    }else if(n < 12){
                        out.println("Morning ");
                    }else if(n < 17){
                        out.println("Afternoon ");
                    }else{
                        out.println("Evening ");
                    }
                    out.println(request.getParameter("name"));
                }
                
            %>
    </body>
</html