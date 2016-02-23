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
import model.NLMVP;


public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
        
    Properties props = new Properties(); //MWC    
    InputStream instr = getClass() .getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void doRead(){
    
        try {
            String query = "Select * from NLMVP";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public String getHTMLtable(){
    
String table ="";

table += "<table border=1>";

        try {
            while(this.results.next()){
                
                NLMVP nlmvp = new NLMVP();
                nlmvp.setMVP_ID(this.results.getInt("MVP_ID"));
                nlmvp.setPLAYER_NAME(this.results.getString("PLAYER_NAME"));
                nlmvp.setPLAYER_TEAM(this.results.getString("PLAYER_TEAM"));
                nlmvp.setPLAYER_POSITION(this.results.getString("PLAYER_POSITION"));
                nlmvp.setAGE_AT_MVP(this.results.getInt("AGE_AT_MVP"));
                
                table += "<tr>";
                table += "<td>";
                table += nlmvp.getMVP_ID();
                table += "</td>";
                
                table += "<td>";
                table += nlmvp.getPLAYER_NAME();
                table += "</td>";
                
                table += "<td>";
                table += nlmvp.getPLAYER_TEAM();
                table += "</td>";
                
                table += "<td>";
                table += nlmvp.getPLAYER_POSITION();
                table += "</td>";
                
                table += "<td>";
                table += nlmvp.getAGE_AT_MVP();
                table += "</td>";
                table += "</tr>";
                
            }       } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

table += "</table>";

return table;
} 

}
