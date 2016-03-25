package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MVP;

public class ReadRecord {
    
     private Connection conn;
     private ResultSet results;
     
     private MVP mvp = new MVP();
     private int ID;
    
    public ReadRecord (int ID) {
    
    Properties props = new Properties(); //MWC    
    InputStream instr = getClass() .getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
    
    this.ID = ID;
    
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void doRead(){
    
         try {
             //set up a string to hold our query
             String query = "SELECT * FROM mvp WHERE ID = ?";
             
             //create a preparedstatement using our query string
             PreparedStatement ps = conn.prepareStatement(query);
             
             //fill in the preparedstatement
             ps.setInt(1, ID);
             
             //execute the query
             this.results = ps.executeQuery();
             
             this.results.next();
             
             mvp.setID(this.results.getInt("ID"));
             mvp.setPLAYER_NAME(this.results.getString("PLAYER_NAME"));
             mvp.setPLAYER_TEAM(this.results.getString("PLAYER_TEAM"));
             mvp.setPLAYER_POSITION(this.results.getString("PLAYER_POSITION"));
             mvp.setAGE_AT_MVP(this.results.getInt("AGE_AT_MVP"));
         } catch (SQLException ex) {
             Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
    
    public MVP getMVP(){
   
        return this.mvp;
        
    }
    
}


  
    

