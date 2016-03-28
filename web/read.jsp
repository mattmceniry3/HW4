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
    <link rel=StyleSheet href="./css/style.css" type="text/css">
    <% String table = (String) request.getAttribute("table"); %>
    <body>
    
    <div class="wrap"> <!-- div to hold all other divs -->    
        
    <%@ include file="includes/Header.jsp" %>
    
    <%@ include file="includes/menu.jsp" %> 
    
    <div class="main"> <!-- main div --> 
        <h1>NL MVP Database</h1>
        <%= table %>
        
        <br><br>
        
        </div> <!-- close main div -->
    
     <%@ include file="includes/footer.jsp" %>
        
    </div> <!-- close wrap div -->    
        
    </body>
</html>
