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
    
    public void next(Player p)
    {
        p.setThrowing(false);
       int loc = 0;
        for (int i = 0; i < player.size(); i++) {
            if(p != player.get(i))
            {loc = i;}              
        }
       
        if(loc == player.size()){loc=0;}
        
        Player help = player.get(loc);
        help.setThrowing(true);
        fireTableDataChanged();
    }
    
   
}
