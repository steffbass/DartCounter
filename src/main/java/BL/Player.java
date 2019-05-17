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

    /**
     * Name von spieler
     */
    private String name;

    /**
     * Spielformat
     */
    private int format;

    /**
     * Anzahl von Getätigten Würfen
     */
    private int würfe = 0;

    /**
     * Wert von Punkten der nach 3 Würfen erst aktualisiert wird
     */
    private int score = 0;

    /**
     * Anzahl der gewonnen Legs
     */
    private int legs = 0;

    /**
     * Boolean ob man gerade an der Reihe ist oder nicht
     */
    private boolean throwing = false;

    /**
     * Boolean ob man das Spiel beendet hat oder nicht
     */
    private boolean finnished = false;

    /**
     * Backup von Spielformat
     */
    private final int saveformat;

    public Player(String name, int format) {
        this.name = name;
        this.format = format;
        saveformat = format;
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

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getSaveformat() {
        return saveformat;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public void setFinnished(boolean finnished) {
        this.finnished = finnished;
    }

    /**
     * Methode um die geworfenen Punkte bei korrekten Würfen abzuspeichern
     */
    public void save() {
        score = format;
    }

    /**
     * Attribute werden wieder auf Standard werte Gesetzt
     */
    public void reset() {
        name = "";
        format = 0;
        würfe = 0;
        score = 0;
        legs = 0;
        throwing = false;
        finnished = false;
    }

    /**
     * Methode um das Weiterspielen eines Spieles zu ermöglichen
     */
    public void playon() {
        format = saveformat;
        score = format;
        finnished = false;
        throwing = false;
    }

}
