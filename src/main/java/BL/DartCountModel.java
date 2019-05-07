/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stefan
 */
public class DartCountModel extends AbstractTableModel {

    private ArrayList<Player> player = new ArrayList();
    private String[] colnames = {"Name", "Legs", "Score", ""};
    private int last;

    @Override
    public int getRowCount() {
        return player.size();
    }

    @Override
    public int getColumnCount() {
        return colnames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Player p = (Player) player.get(rowIndex);
        return p;
    }

    @Override
    public String getColumnName(int column) {
        return colnames[column];
    }

    public void add(Player t) {
        player.add(t);
        this.fireTableRowsInserted(player.size() - 1, player.size() - 1);
    }

    public int size() {
        return player.size();
    }

    public Player getCurrent() {
        Player p = null;
        for (int i = 0; i < player.size(); i++) {
            if (player.get(i).isThrowing()) {
                p = player.get(i);
            }
        }
        return p;
    }

    public void next(Player p) {

        p.setThrowing(false);
        int loc = player.indexOf(p);

        if (loc == player.size() - 1) {
            loc = 0;
        } else {
            loc++;
        }

        Player help = player.get(loc);
        if (help.isFinnished()) {
            loc++;
        }

        help = player.get(loc);
        help.setThrowing(true);
        fireTableDataChanged();
    }

    public boolean checkwin_einfach(Player p) throws Exception {

        if (p.getFormat() == 0) {
            p.setFinnished(true);
            fireTableDataChanged();
        } else if (p.getFormat() < 1) {
            p.setFormat(p.getScore());
            p.setFinnished(false);
            throw new Exception("Überworfen");
        }

        return p.isFinnished();

    }

    public boolean checkwin_doppel(Player p, String feld) throws Exception {
        int input = 0;
        String type = "";
        if (feld.length() > 2) {
            type = feld.substring(0, 1);
            input = Integer.parseInt(feld.substring(1));
        } else {
            input = Integer.parseInt(feld);
        }

        if (this.checkwin_einfach(p)) {
            if (type.equalsIgnoreCase("D")) {
                p.setFinnished(true);
            } else {
                p.setFinnished(false);
                p.setFormat(p.getFormat());
                throw new Exception("Checkout ohne Double!");
            }

        }

        //arbeitsweiße
        // check einzeln , überprüfüfen ob feld doppelt war
        //double out - 1 kann nicht
        //wenn win true is dann soll ein joption pane kommen wo man die statistik noch speichern kann
        // gespeichert werden soll: name, würfe, score von format, average, doublequte, legs gewonnen
        // statistik von gewinner soll in db gespeichert werden und die anzahl von siegen von dieser person in dem joptionpane angezeigt werden
        return p.isFinnished();
    }

    public void throw_input_einzeln(Player p, String value) throws Exception {
        int würfe = p.getWürfe();
        würfe++;
        p.setWürfe(würfe);
        last = player.indexOf(p);

        if (value.equalsIgnoreCase("DBUL")) {
            int format = p.getFormat();
            p.setFormat(format - 50);

        } else if (value.equalsIgnoreCase("BUL")) {
            int format = p.getFormat();
            p.setFormat(format - 25);

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
            int format = p.getFormat();
            p.setFormat(format - val);
        } else {

            int thrown = Integer.parseInt(value);
            if (thrown > 20) {
                throw new Exception("Wert ungültig");
            } else {
                int format = p.getFormat();

                p.setFormat(format - thrown);
            }
        }
    }

    public void throw_input_value(Player p, int value) {
        last = player.indexOf(p);
        int würfe = p.getWürfe();
        würfe += 3;
        p.setWürfe(würfe);
        int format = p.getFormat();
        format -= value;
        p.setFormat(format);
    }

    public String[] getCheckout(Player p) {

        String[] c = new String[3];
        int value = p.getScore();
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

            case 100:
                c[0] = "T20";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 99:
                c[0] = "T19";
                c[1] = "10";
                c[2] = "D16";
                break;

            case 98:
                c[0] = "T20";
                c[1] = "D19";
                c[2] = "-";
                break;

            case 97:
                c[0] = "T19";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 96:
                c[0] = "T20";
                c[1] = "D18";
                c[2] = "-";
                break;

            case 95:
                c[0] = "T19";
                c[1] = "D19";
                c[2] = "-";
                break;

            case 94:
                c[0] = "T18";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 93:
                c[0] = "T19";
                c[1] = "D18";
                c[2] = "-";
                break;

            case 92:
                c[0] = "T20";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 91:
                c[0] = "T17";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 90:
                c[0] = "T20";
                c[1] = "D15";
                c[2] = "-";
                break;

            case 89:
                c[0] = "T19";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 88:
                c[0] = "T20";
                c[1] = "D14";
                c[2] = "-";
                break;

            case 87:
                c[0] = "T17";
                c[1] = "D18";
                c[2] = "-";
                break;

            case 86:
                c[0] = "T18";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 85:
                c[0] = "T15";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 84:
                c[0] = "T20";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 83:
                c[0] = "T17";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 82:
                c[0] = "50";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 81:
                c[0] = "T19";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 80:
                c[0] = "T20";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 79:
                c[0] = "T19";
                c[1] = "D11";
                c[2] = "-";
                break;

            case 78:
                c[0] = "T18";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 77:
                c[0] = "T19";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 76:
                c[0] = "T20";
                c[1] = "D8";
                c[2] = "-";
                break;

            case 75:
                c[0] = "T17";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 74:
                c[0] = "T14";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 73:
                c[0] = "T19";
                c[1] = "D8";
                c[2] = "-";
                break;

            case 72:
                c[0] = "T16";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 71:
                c[0] = "T13";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 70:
                c[0] = "T18";
                c[1] = "D8";
                c[2] = "-";
                break;

            case 69:
                c[0] = "T19";
                c[1] = "D6";
                c[2] = "-";
                break;

            case 68:
                c[0] = "T16";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 67:
                c[0] = "T9";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 66:
                c[0] = "T10";
                c[1] = "D18";
                c[2] = "-";
                break;

            case 65:
                c[0] = "T11";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 64:
                c[0] = "T16";
                c[1] = "D8";
                c[2] = "-";
                break;

            case 63:
                c[0] = "T13";
                c[1] = "D12";
                c[2] = "-";
                break;

            case 62:
                c[0] = "T10";
                c[1] = "D16";
                c[2] = "-";
                break;

            case 61:
                c[0] = "T15";
                c[1] = "D8";
                c[2] = "-";
                break;

            case 60:
                c[0] = "20";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 59:
                c[0] = "19";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 58:
                c[0] = "18";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 57:
                c[0] = "17";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 56:
                c[0] = "T16";
                c[1] = "D4";
                c[2] = "-";
                break;

            case 55:
                c[0] = "16";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 54:
                c[0] = "14";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 53:
                c[0] = "13";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 52:
                c[0] = "12";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 51:
                c[0] = "11";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 50:
                c[0] = "10";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 49:
                c[0] = "9";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 48:
                c[0] = "8";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 47:
                c[0] = "7";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 46:
                c[0] = "6";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 45:
                c[0] = "5";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 44:
                c[0] = "4";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 43:
                c[0] = "3";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 42:
                c[0] = "2";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 41:
                c[0] = "9";
                c[1] = "D20";
                c[2] = "-";
                break;

            case 40:
                c[0] = "D20";
                c[1] = "-";
                c[2] = "-";
                break;

            case 39:
                c[0] = "19";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 38:
                c[0] = "18";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 37:
                c[0] = "17";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 36:
                c[0] = "16";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 35:
                c[0] = "15";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 34:
                c[0] = "14";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 33:
                c[0] = "13";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 32:
                c[0] = "12";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 31:
                c[0] = "11";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 30:
                c[0] = "10";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 29:
                c[0] = "9";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 28:
                c[0] = "8";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 27:
                c[0] = "7";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 26:
                c[0] = "6";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 25:
                c[0] = "5";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 24:
                c[0] = "4";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 23:
                c[0] = "3";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 22:
                c[0] = "2";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 21:
                c[0] = "1";
                c[1] = "D10";
                c[2] = "-";
                break;

            case 20:
                c[0] = "D10";
                c[1] = "-";
                c[2] = "-";
                break;

            case 19:
                c[0] = "9";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 18:
                c[0] = "8";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 17:
                c[0] = "7";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 16:
                c[0] = "6";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 15:
                c[0] = "5";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 14:
                c[0] = "4";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 13:
                c[0] = "3";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 12:
                c[0] = "2";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 11:
                c[0] = "1";
                c[1] = "D5";
                c[2] = "-";
                break;

            case 10:
                c[0] = "D5";
                c[1] = "-";
                c[2] = "-";
                break;

            case 9:
                c[0] = "1";
                c[1] = "D4";
                c[2] = "-";
                break;

            case 8:
                c[0] = "D4";
                c[1] = "-";
                c[2] = "-";
                break;

            case 7:
                c[0] = "1";
                c[1] = "D§";
                c[2] = "-";
                break;

            case 6:
                c[0] = "D3";
                c[1] = "-";
                c[2] = "-";
                break;

            case 5:
                c[0] = "1";
                c[1] = "D2";
                c[2] = "-";
                break;

            case 4:
                c[0] = "D2";
                c[1] = "-";
                c[2] = "-";
                break;

            case 3:
                c[0] = "1";
                c[1] = "D1";
                c[2] = "-";
                break;

            case 2:
                c[0] = "D1";
                c[1] = "-";
                c[2] = "-";
                break;

            default:
                c[0] = "-";
                c[1] = "-";
                c[2] = "-";
        }

        return c;
    }

    public void restart() {
        int size = player.size();

        for (int i = 0; i < size; i++) {
            Player p = player.get(i);
            p.reset();
        }
        player.removeAll(player);
        fireTableDataChanged();;
    }

    public void save() {

    }

    public void continuegame() {
        int size = player.size();
        Player h;

        for (int i = 0; i < size; i++) {
            Player p = player.get(i);

            if (p.isFinnished()) {
                p.setLegs(p.getLegs() + 1);
            }
            p.playon();
            //bug here // extra variable um spieler mitzuspeichern wer letzes drann war
           
            if(player.size() == 1){ h = player.get(0);}
            
          else if (player.size() == last) {
                h = player.get(0);              
            }
            else{ h = player.get(last + 1);}

             h.setThrowing(true);
        }
        fireTableDataChanged();;
    }
}
