<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.MVP"%>
<% MVP mvp = (MVP) request.getAttribute("mvp"); %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update MVP</title>
    </head>
    <link rel=StyleSheet href="style.css" type="text/css">
    <body>
        <h1>Update MVP Record</h1>
        <hr></hr>
        <form name="updateForm" action="updateMVP" method="get">
            
                <label>ID:</label>
                <input type="number" name="ID" value="<%= mvp.getID() %>" size="30" readonly/>
                <br>
                <label>Player Name:</label>
                <input type="text" name="PLAYER_NAME" value="<%= mvp.getPLAYER_NAME() %>" size="30" />
                <br>
                <label>Player Team:</label>
                <input type="text" name="PLAYER_TEAM" value="<%= mvp.getPLAYER_TEAM() %>" size="30" />
                <br>
                <label>Player Position:</label>
                <input type="text" name="PLAYER_POSITION" value="<%= mvp.getPLAYER_POSITION() %>" size="30" />
                <br>
                <label>Age At MVP:</label>
                <input type="number" name="AGE_AT_MVP" value="<%= mvp.getAGE_AT_MVP() %>" size="30" />
                <br>
            
            <input type="reset" value="Clear" id="clear">
            <input type="submit" value="Update" id="submit">
           
    
        </form>
    </body>
</html>
