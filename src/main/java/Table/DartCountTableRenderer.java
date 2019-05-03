/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import BL.Player;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author stefan
 */
public class DartCountTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Color bc = new Color(46, 53, 57);
        Color gold = new Color(255, 215, 0);

        Player p = (Player) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        if (value == null) {
            return label;
        }

        switch (column) {
            case 0:
                label.setText(p.getName());
                break;
            case 1:
                label.setText("" + p.getLegs());
                break;
            case 2:
                label.setText("" + p.getFormat());
                break;
            case 3:
                if (p.isThrowing()) {
                    label.setBackground(gold);
                    break;
                }

        }
        return label;
    }

}
