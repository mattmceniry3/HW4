/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class MVP {
    private int ID;
    private String PLAYER_NAME;
    private String PLAYER_TEAM;
    private String PLAYER_POSITION;
    private int AGE_AT_MVP;

    public MVP(){
        this.ID = 0;
        this.PLAYER_NAME = "";
        this.PLAYER_TEAM = "";
        this.PLAYER_POSITION = "";
        this.AGE_AT_MVP = 0;
    }

    public MVP(int ID, String PLAYER_NAME, String PLAYER_TEAM, String PLAYER_POSITION, int AGE_AT_MVP) {
        this.ID = ID;
        this.PLAYER_NAME = PLAYER_NAME;
        this.PLAYER_TEAM = PLAYER_TEAM;
        this.PLAYER_POSITION = PLAYER_POSITION;
        this.AGE_AT_MVP = AGE_AT_MVP;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getPLAYER_POSITION() {
        return PLAYER_POSITION;
    }

    public void setPLAYER_POSITION(String PLAYE_POS) {
        this.PLAYER_POSITION = PLAYE_POS;
    }

    public int getAGE_AT_MVP() {
        return AGE_AT_MVP;
    }

    public void setAGE_AT_MVP(int AGE_AT_MVP) {
        this.AGE_AT_MVP = AGE_AT_MVP;
    }

    @Override
    public String toString() {
        return "MVP{" + "ID=" + ID + ", PLAYER_NAME=" + PLAYER_NAME + ", PLAYER_TEAM=" + PLAYER_TEAM + ", PLAYE_POS=" + PLAYER_POSITION + ", AGE_AT_MVP=" + AGE_AT_MVP + '}';
    }
}
    
