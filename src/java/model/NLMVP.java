/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class NLMVP {
    private int MVP_ID;
    private String PLAYER_NAME;
    private String PLAYER_TEAM;
    private String PLAYE_POS;
    private int AGE_AT_MVP;

    public NLMVP(){
        this.MVP_ID = 0;
        this.PLAYER_NAME = "";
        this.PLAYER_TEAM = "";
        this.PLAYE_POS = "";
        this.AGE_AT_MVP = 0;
    }

    public NLMVP(int MVP_ID, String PLAYER_NAME, String PLAYER_TEAM, String PLAYE_POS, int AGE_AT_MVP) {
        this.MVP_ID = MVP_ID;
        this.PLAYER_NAME = PLAYER_NAME;
        this.PLAYER_TEAM = PLAYER_TEAM;
        this.PLAYE_POS = PLAYE_POS;
        this.AGE_AT_MVP = AGE_AT_MVP;
    }

    public int getMVP_ID() {
        return MVP_ID;
    }

    public void setMVP_ID(int MVP_ID) {
        this.MVP_ID = MVP_ID;
    }

    public String getPLAYER_NAME() {
        return PLAYER_NAME;
    }

    public void setPLAYER_NAME(String PLAYER_NAME) {
        this.PLAYER_NAME = PLAYER_NAME;
    }

    public String getPLAYER_TEAM() {
        return PLAYER_TEAM;
    }

    public void setPLAYER_TEAM(String PLAYER_TEAM) {
        this.PLAYER_TEAM = PLAYER_TEAM;
    }

    public String getPLAYE_POS() {
        return PLAYE_POS;
    }

    public void setPLAYE_POS(String PLAYE_POS) {
        this.PLAYE_POS = PLAYE_POS;
    }

    public int getAGE_AT_MVP() {
        return AGE_AT_MVP;
    }

    public void setAGE_AT_MVP(int AGE_AT_MVP) {
        this.AGE_AT_MVP = AGE_AT_MVP;
    }

    @Override
    public String toString() {
        return "NLMVP{" + "MVP_ID=" + MVP_ID + ", PLAYER_NAME=" + PLAYER_NAME + ", PLAYER_TEAM=" + PLAYER_TEAM + ", PLAYE_POS=" + PLAYE_POS + ", AGE_AT_MVP=" + AGE_AT_MVP + '}';
    }
}
    
