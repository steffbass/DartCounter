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
    
  
    
   public void trow_gui(int value1, int value2, int value3)
   {
    würfe+=3;
    format-=value1;
    format-=value2;
    format-=value3;
   }
    
   public void throw_input_value(int value)
   {
    würfe+=3;
    format-=value;
   }
   
   public void throw_input_einzeln(int value1, int value2, int value3)
   {
    würfe+=3;
    format-=value1;
    format-=value2;
    format-=value3;
   }
   
   public boolean win(Player p)
   {
    return false;
    //wenn win true is dann soll ein joption pane kommen wo man die statistik noch speichern kann
    // gespeichert werden soll: name, würfe, score von format, average, doublequte, legs gewonnen
   }
    
    
}
