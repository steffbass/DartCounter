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
    private int würfe = 0;
    private int score = 0;
    private double doubleqoute = 0;
    private int legs = 0;
    private boolean throwing = false;
    private boolean finnished = false;

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

    public boolean isFinnished() {
        return finnished;
    }

    public void setThrowing(boolean throwing) {
        this.throwing = throwing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWürfe(int würfe) {
        this.würfe = würfe;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDoubleqoute(double doubleqoute) {
        this.doubleqoute = doubleqoute;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    

    public void setFormat(int format) {
        this.format = format;
    }

    public void setFinnished(boolean finnished) {
        this.finnished = finnished;
    }
   

    public void save()
    {
      score = format;
    }
  
}
