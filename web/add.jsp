<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New MVP</title>
    </head>
    <link rel=StyleSheet href="style.css" type="text/css">
    <body>
        
    <div class="wrap"> <!-- div to hold all other divs -->    
        
    <%@ include file="includes/Header.jsp" %>
    
    <%@ include file="includes/menu.jsp" %> 
    
    <div class="main"> <!-- main div --> 
         
        <h1>Add A New MVP</h1>
        <hr></hr>
        <form name="addForm" action="addMVP" method="get">
            
                <label>Player Name:</label>
                <input type="" name="PLAYER_NAME" value="" size="30" required />
                <br>
                <label>Player Team:</label>
                <input type="text" name="PLAYER_TEAM" value="" size="30" required />
                <br>
                <label>Player Position:</label>
                <input type="text" name="PLAYER_POSITION" value="" size="30" required />
                <br>
                <label>Age At MVP:</label>
                <input type="number" name="AGE_AT_MVP" value="" size="30" required />
                <br>
            
            <input type="reset" value="Clear" id="clear">
            <input type="submit" value="Submit" id="submit">
           
    
        </form>
        
          </div> <!-- close main div -->
    
     <%@ include file="includes/footer.jsp" %>
        
    </div> <!-- close wrap div -->    
          
        
    </body>
</html>
