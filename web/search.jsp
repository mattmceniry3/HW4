<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search MVPs</title>
    </head>
    <link rel=StyleSheet href="style.css" type="text/css">
    <body>
        
    <div class="wrap"> <!-- div to hold all other divs -->    
        
    <%@ include file="includes/Header.jsp" %>
    
    <%@ include file="includes/menu.jsp" %>
        
    <div class="main"> <!-- main div -->    
        
        <h1>Search MVPs</h1>
        
        <form name="searchForm" action="search" method="get">
            
        <input type="text" name="searchVal" value="" />
        
        <br>
        
        <input type="submit" name="submit" value="Search" />
        
        </form>
        
    </div> <!-- close main div -->
    
    <%@ include file="includes/footer.jsp" %>
        
    </div> <!-- close wrap div -->   
        
    </body>
</html>
