package com.example.player.model;

public class Player{
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseryNumber, String role){
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseryNumber;
        this.role = role;
    }
    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public void getJerseyNumber(int jerseryNumber){
        this.jerseyNumber = jerseryNumber;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

}