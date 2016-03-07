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

table += "<table>";

                table += "<th>";
                table += "MVP ID";
                table += "</th>";
                
                table += "<th>";
                table += "Player Name";
                table += "</th>";
                
                table += "<th>";
                table += "Player Team";
                table += "</th>";
                
                table += "<th>";
                table += "Player Position";
                table += "</th>";
                
                table += "<th>";
                table += "Age at MVP";
                table += "</th>";
                
                table += "<th>";
                table += "Delete MVP";
                table += "</th>";

        try {
            while(this.results.next()){
                
                NLMVP NLMVP = new NLMVP();
                NLMVP.setMVP_ID(this.results.getInt("MVP_ID"));
                NLMVP.setPLAYER_NAME(this.results.getString("PLAYER_NAME"));
                NLMVP.setPLAYER_TEAM(this.results.getString("PLAYER_TEAM"));
                NLMVP.setPLAYER_POSITION(this.results.getString("PLAYER_POSITION"));
                NLMVP.setAGE_AT_MVP(this.results.getInt("AGE_AT_MVP"));   
                
                table += "<tr>";
                table += "<td>";
                table += NLMVP.getMVP_ID();
                table += "</td>";
                
                table += "<td>";
                table += NLMVP.getPLAYER_NAME();
                table += "</td>";
                
                table += "<td>";
                table += NLMVP.getPLAYER_TEAM();
                table += "</td>";
                
                table += "<td>";
                table += NLMVP.getPLAYER_POSITION();
                table += "</td>";
                
                table += "<td>";
                table += NLMVP.getAGE_AT_MVP();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?nlmvp.getMVP_ID()" + NLMVP.getMVP_ID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
                
            }       } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

table += "</table>";

return table;
} 

}
