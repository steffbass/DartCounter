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

    public String[] getCheckout(int value) {

        String[] c = new String[3];

        switch (value) {
            case 170:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "50";
                break;

            case 167:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "50";
                break;

            case 164:
                c[0] = "T20";
                c[1] = "T18";
                c[2] = "50";
                break;

            case 161:
                c[0] = "T20";
                c[1] = "T17";
                c[2] = "50";
                break;

            case 160:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D20";
                break;

            case 158:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D19";
                break;

            case 157:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D20";
                break;

            case 156:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D18";
                break;

            case 155:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D19";
                break;

            case 154:
                c[0] = "T20";
                c[1] = "T18";
                c[2] = "D20";
                break;

            case 153:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D18";
                break;

            case 152:
                c[0] = "T20";
                c[1] = "T29";
                c[2] = "D16";
                break;

            case 151:
                c[0] = "T20";
                c[1] = "T17";
                c[2] = "D20";
                break;

            case 150:
                c[0] = "T20";
                c[1] = "T18";
                c[2] = "D18";
                break;

            case 149:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D16";
                break;

            case 148:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D14";
                break;

            case 147:
                c[0] = "T20";
                c[1] = "T17";
                c[2] = "D18";
                break;

            case 146:
                c[0] = "T20";
                c[1] = "T18";
                c[2] = "D16";
                break;

            case 145:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D14";
                break;

            case 144:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D12";
                break;

            case 143:
                c[0] = "T20";
                c[1] = "T17";
                c[2] = "D16";
                break;

            case 142:
                c[0] = "T20";
                c[1] = "T14";
                c[2] = "D20";
                break;

            case 141:
                c[0] = "T20";
                c[1] = "T14";
                c[2] = "D20";
                break;

            case 140:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D10";
                break;

            case 139:
                c[0] = "T20";
                c[1] = "T13";
                c[2] = "D20";
                break;

            case 138:
                c[0] = "T20";
                c[1] = "T18";
                c[2] = "D12";
                break;

            case 137:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D10";
                break;

            case 136:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D8";
                break;

            case 135:
                c[0] = "T20";
                c[1] = "T17";
                c[2] = "D12";
                break;

            case 134:
                c[0] = "T20";
                c[1] = "T16";
                c[2] = "D13";
                break;

            case 133:
                c[0] = "T20";
                c[1] = "T19";
                c[2] = "D8";
                break;

            case 132:
                c[0] = "T20";
                c[1] = "T16";
                c[2] = "D12";
                break;

            case 131:
                c[0] = "T19";
                c[1] = "T14";
                c[2] = "D16";
                break;

            case 130:
                c[0] = "T20";
                c[1] = "T20";
                c[2] = "D5";
                break;

            case 129:
                c[0] = "T20";
                c[1] = "T16";
                c[2] = "D12";
                break;

            case 128:
                c[0] = "T18";
                c[1] = "T14";
                c[2] = "D16";
                break;

            case 127:
                c[0] = "T20";
                c[1] = "T17";
                c[2] = "D8";
                break;

            case 126:
                c[0] = "T19";
                c[1] = "T19";
                c[2] = "D6";
                break;

            case 125:
                c[0] = "T18";
                c[1] = "T19";
                c[2] = "D7";
                break;

            case 124:
                c[0] = "T20";
                c[1] = "T14";
                c[2] = "D11";
                break;

            case 123:
                c[0] = "T19";
                c[1] = "T16";
                c[2] = "D9";
                break;

            case 122:
                c[0] = "T18";
                c[1] = "T18";
                c[2] = "D7";
                break;

            case 121:
                c[0] = "T20";
                c[1] = "T11";
                c[2] = "D14";
                break;

            case 120:
                c[0] = "T20";
                c[1] = "20";
                c[2] = "D20";
                break;

            case 119:
                c[0] = "T19";
                c[1] = "T12";
                c[2] = "D13";
                break;

                 case 118:
                c[0] = "T20";
                c[1] = "18";
                c[2] = "D20";
                break;
                
                 case 117:
                c[0] = "T19";
                c[1] = "20";
                c[2] = "D20";
                break;
                
                 case 116:
                c[0] = "T19";
                c[1] = "19";
                c[2] = "D20";
                break;
                
                 case 115:
                c[0] = "T20";
                c[1] = "15";
                c[2] = "D20";
                break;
                
                 case 114:
                c[0] = "T19";
                c[1] = "17";
                c[2] = "D20";
                break;
                
                 case 113:
                c[0] = "T19";
                c[1] = "16";
                c[2] = "D20";
                break;
                
                 case 112:
                c[0] = "T20";
                c[1] = "T12";
                c[2] = "D8";
                break;
                
                 case 111:
                c[0] = "T19";
                c[1] = "14";
                c[2] = "D20";
                break;
                
                 case 110:
                c[0] = "T20";
                c[1] = "T10";
                c[2] = "D10";
                break;
                
                 case 109:
                c[0] = "T20";
                c[1] = "9";
                c[2] = "D20";
                break;
                
                  case 108:
                c[0] = "T20";
                c[1] = "16";
                c[2] = "D16";
                break;
                
                  case 107:
                c[0] = "T19";
                c[1] = "T10";
                c[2] = "D10";
                break;
                
                  case 106:
                c[0] = "T20";
                c[1] = "T10";
                c[2] = "D8";
                break;
                
                  case 105:
                c[0] = "T20";
                c[1] = "13";
                c[2] = "D16";
                break;
                
                  case 104:
                c[0] = "T19";
                c[1] = "15";
                c[2] = "D16";
                break;
                
                  case 103:
                c[0] = "T19";
                c[1] = "6";
                c[2] = "D20";
                break;
                
                  case 102:
                c[0] = "T20";
                c[1] = "10";
                c[2] = "D16";
                break;  
                  
                  case 101:
                c[0] = "T20";
                c[1] = "9";
                c[2] = "D16";
                break;
                
                
                
                
            default:
                c[0] = "-";
                c[1] = "-";
                c[2] = "-";
        }

        return c;
    }
}
