/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adriantang
 */
public class Player {
    private String name;
    private int points;
    
    public Player(){
        name = "-";
        points = -1;
    }
    
    
    String getPlayerName(){
        return this.name;
    }
    
    int getPlayerScore(){
        return this.points;
    }
    
    void setPlayerScore(int points){
        this.points = points;
    }
    
    void setPlayerName(String name){
        this.name = name;
    }
}
