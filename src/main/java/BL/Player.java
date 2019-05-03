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

    public void trow_gui(int value1, int value2, int value3) {
        würfe += 3;
        format -= value1;
        format -= value2;
        format -= value3;
    }

    public void throw_input_value(int value) {
        würfe += 3;
        format -= value;
    }

    public void throw_input_einzeln(String value) throws Exception {
        würfe += 1;

        if (value.equalsIgnoreCase("DBUL")) {
            format -= 50;

        } else if (value.equalsIgnoreCase("BUL")) {
            format -= 25;

        } else if (value.length() > 2) {
            char type = value.charAt(0);
            String help1 = value.substring(1);
            int thrown = Integer.parseInt(help1);
            int val = 0;

            if (thrown > 20) {
                throw new Exception("Wert ungültig");
            }
            switch (type) {
                case 'D':
                    val = thrown * 2;
                    break;
                case 'T':
                    val = thrown * 3;
                    break;
            }
            format -= val;
        } else {
            int thrown = Integer.parseInt(value);
            format -= thrown;
        }
    }

    public boolean win(Player p) {
        return false;
        //wenn win true is dann soll ein joption pane kommen wo man die statistik noch speichern kann
        // gespeichert werden soll: name, würfe, score von format, average, doublequte, legs gewonnen
        // statistik von gewinner soll in db gespeichert werden und die anzahl von siegen von dieser person in dem joptionpane angezeigt werden
    }

}
