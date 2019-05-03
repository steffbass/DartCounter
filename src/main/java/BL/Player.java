/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author stefan
 */
public class Player {
    
    private String name;
    private int format;
    private int würfe;
    private int score;
    private double doubleqoute;
    private int legs = 0;
    private boolean throwing = false;

    public Player(String name, int format) {
        this.name = name;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public int getFormat() {
        return format;
    }

    public int getWürfe() {
        return würfe;
    }

    public int getScore() {
        return score;
    }

    public double getDoubleqoute() {
        return doubleqoute;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isThrowing() {
        return throwing;
    }
    
   
    
   
    
    
}
