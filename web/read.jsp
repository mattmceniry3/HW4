<%-- 
    Document   : read
    Created on : Feb 22, 2016, 2:33:50 PM
    Author     : mmmceniry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NL MVP Database</title>
    </head>
   
    <% String table = (String) request.getAttribute("table"); %>
    <link rel=StyleSheet href="style.css" type="text/css">
    <body>
        <h1>NL MVP Database</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add A New MVP</a>
         <br><br>
        <a id="read" href="search.jsp">Search NL MVPs</a>
    </body>
</html>
