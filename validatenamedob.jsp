<%-- 
    Document   : validatenamedob
    Created on : Nov 22, 2019, 11:13:10 AM
    Author     : rishabh
--%>

<<%-- 
    Document   : prog3
    Created on : 24 Oct, 2019, 4:34:40 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Validation</title>
    </head>
    <body>
        <h1>Form Validation</h1>
        <form method="post" action="validatenamedob.jsp">
            Name:  
            <input type="text" name="name"><br><br>
            DOB:
            <input type="date" name="dob"><br><br>
            Email ID:
            <input type="email" name="mail"><br><br>
            Lucky Number:
            <input type="number" name="lucky"><br><br>
            Favorite Food:
            <input type="text" name="food"><br><br>
            <input type="submit" value="Submit"><br>
        </form>
        <%
            String n=request.getParameter("name");
            String bday=request.getParameter("dob");
            String email=request.getParameter("mail");
            String lnum=request.getParameter("lucky");
            String fFood=request.getParameter("food");
            
            if(n==null || bday==null || email==null || lnum==null || fFood==null){
                
            }
            else if(n=="" || bday=="" || email=="" || lnum=="" || fFood==""){
               out.println("<br>Please Enter All Inputs");
            }
            else{
                out.println("<br>Name : " + n);
                out.println("<br>DOB : " + bday);
                out.println("<br>Email : " + email);
                out.println("<br>Lucky Number : " + lnum);
                out.println("<br>Favourite Food : " + fFood);
            }
        %>
        
    </body>
</html>
