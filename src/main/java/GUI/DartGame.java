/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.DartCountModel;
import BL.Player;
import Table.DartCountTableRenderer;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author stefan
 */
public class DartGame extends javax.swing.JFrame {

    /**
     * Creates new form DartGame
     */
    private int format = 0;
    private Player currentPlayer;

    private DartCountModel bl = new DartCountModel();
    private Color bc = new Color(46, 53, 57);

    public DartGame() {
        //background.setIcon(new ImageIcon("./Assets/Board.png"));
        //   this.setBackground(Color.CYAN); 

        initComponents();
        table.setModel(bl);
        table.setDefaultRenderer(Object.class, new DartCountTableRenderer());
        s1.setOpaque(true);
        s2.setOpaque(true);
        s3.setOpaque(true);
        s.setOpaque(true);
        c.setBackground(bc);
        c.setOpaque(true);
        b.setIcon(new ImageIcon("/Users/stefan/git/DartCounter/src/main/java/Assets/Board.jpg"));
        b.setBackground(bc);
        b.setOpaque(true);
        c1.setBackground(bc);
        c1.setIcon(new ImageIcon("/Users/stefan/git/DartCounter/src/main/java/Assets/_.jpg"));
        c2.setIcon(new ImageIcon("/Users/stefan/git/DartCounter/src/main/java/Assets/_.jpg"));
        c3.setIcon(new ImageIcon("/Users/stefan/git/DartCounter/src/main/java/Assets/_.jpg"));
        c2.setBackground(bc);
        c3.setBackground(bc);
        c1.setOpaque(true);
        c2.setOpaque(true);
        c3.setOpaque(true);

    }

    // if(format == 0)
    // {JOptionpane.showMessageDialog{"Kein Format ausgewählt!"; break;}}
    // if(bl.size == 0)
    // {JOptionpane.showMessageDialog{"Keine Spieler vorhanden!"; break;}}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        board = new javax.swing.JPanel();
        b = new javax.swing.JLabel();
        player = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        checkout = new javax.swing.JPanel();
        c = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        throwvalue = new javax.swing.JPanel();
        undo = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        s = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Format = new javax.swing.JMenu();
        f_301 = new javax.swing.JMenuItem();
        f_501 = new javax.swing.JMenuItem();
        Spieler = new javax.swing.JMenu();
        p_1 = new javax.swing.JMenuItem();
        p_2 = new javax.swing.JMenuItem();
        p_3 = new javax.swing.JMenuItem();
        p_4 = new javax.swing.JMenuItem();
        Steuerung = new javax.swing.JMenu();
        s_r = new javax.swing.JMenuItem();
        s_input_val = new javax.swing.JMenuItem();
        s_input_three = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dart counter");
        setBackground(new java.awt.Color(46, 53, 57));
        setPreferredSize(new java.awt.Dimension(1300, 860));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        board.setLayout(new java.awt.GridBagLayout());

        b.setMaximumSize(new java.awt.Dimension(800, 800));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        board.add(b, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(board, gridBagConstraints);

        player.setLayout(new java.awt.GridBagLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        player.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(player, gridBagConstraints);

        checkout.setLayout(new java.awt.GridBagLayout());

        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("Checkout");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        checkout.add(c, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        checkout.add(c1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        checkout.add(c2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        checkout.add(c3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(checkout, gridBagConstraints);

        throwvalue.setLayout(new java.awt.GridBagLayout());

        undo.setBackground(new java.awt.Color(255, 51, 51));
        undo.setForeground(new java.awt.Color(255, 255, 255));
        undo.setText("Undo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        throwvalue.add(undo, gridBagConstraints);

        confirm.setBackground(new java.awt.Color(102, 255, 102));
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        throwvalue.add(confirm, gridBagConstraints);

        s.setBackground(new java.awt.Color(46, 53, 57));
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("Score");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        throwvalue.add(s, gridBagConstraints);

        s1.setBackground(new java.awt.Color(46, 53, 57));
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        throwvalue.add(s1, gridBagConstraints);

        s2.setBackground(new java.awt.Color(46, 53, 57));
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        throwvalue.add(s2, gridBagConstraints);

        s3.setBackground(new java.awt.Color(46, 53, 57));
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        throwvalue.add(s3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(throwvalue, gridBagConstraints);

        Format.setText("Format");

        f_301.setText("301 - Double out");
        f_301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_301ActionPerformed(evt);
            }
        });
        Format.add(f_301);

        f_501.setText("501 - Double out");
        f_501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_501ActionPerformed(evt);
            }
        });
        Format.add(f_501);

        jMenuBar1.add(Format);

        Spieler.setText("Spieler");

        p_1.setText("1 Spieler");
        p_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_1ActionPerformed(evt);
            }
        });
        Spieler.add(p_1);

        p_2.setText("2 Spieler");
        p_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_2ActionPerformed(evt);
            }
        });
        Spieler.add(p_2);

        p_3.setText("3 Spieler");
        p_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_3ActionPerformed(evt);
            }
        });
        Spieler.add(p_3);

        p_4.setText("4 Spieler");
        p_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_4ActionPerformed(evt);
            }
        });
        Spieler.add(p_4);

        jMenuBar1.add(Spieler);

        Steuerung.setText("Steuerung");

        s_r.setText("Restart");
        s_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_rActionPerformed(evt);
            }
        });
        Steuerung.add(s_r);

        s_input_val.setText("Wert input");
        s_input_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_input_valActionPerformed(evt);
            }
        });
        Steuerung.add(s_input_val);

        s_input_three.setText("Felder input");
        s_input_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_input_threeActionPerformed(evt);
            }
        });
        Steuerung.add(s_input_three);

        jMenuBar1.add(Steuerung);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_1ActionPerformed
        // TODO add your handling code here:

        if (format != 0 && bl.size() == 0) {
            for (int i = 1; i < 2; i++) {
                String name = JOptionPane.showInputDialog("Name von Spieler " + i);
                if (name == null) {
                    break;
                }
                Player pl = new Player(name, format);
                pl.setThrowing(true);
                bl.add(pl);

            }
        } else {
            if (format == 0) {
                JOptionPane.showMessageDialog(null, "Kein Format ausgewählt!");
            } else {
                JOptionPane.showMessageDialog(null, "Um weitere Spieler hinzufügen zu können müssen Sie das Spiel neu starten.");
            }
        }

    }//GEN-LAST:event_p_1ActionPerformed

    private void p_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_2ActionPerformed
        // TODO add your handling code here:

        if (format != 0 && bl.size() == 0) {
            for (int i = 1; i < 3; i++) {
                String name = JOptionPane.showInputDialog("Name von Spieler " + i);
                if (name == null) {
                    break;
                }
                Player pl = new Player(name, format);
                if (i == 1) {
                    pl.setThrowing(true);
                }
                bl.add(pl);

            }
        } else {
            if (format == 0) {
                JOptionPane.showMessageDialog(null, "Kein Format ausgewählt!");
            } else {
                JOptionPane.showMessageDialog(null, "Um weitere Spieler hinzufügen zu können müssen Sie das Spiel neu starten.");
            }
        }
    }//GEN-LAST:event_p_2ActionPerformed

    private void p_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_3ActionPerformed
        // TODO add your handling code here:

        if (format != 0 && bl.size() == 0) {
            for (int i = 1; i < 4; i++) {
                String name = JOptionPane.showInputDialog("Name von Spieler " + i);
                if (name == null) {
                    break;
                }
                Player pl = new Player(name, format);
                if (i == 1) {
                    pl.setThrowing(true);
                }
                bl.add(pl);

            }
        } else {
            if (format == 0) {
                JOptionPane.showMessageDialog(null, "Kein Format ausgewählt!");
            } else {
                JOptionPane.showMessageDialog(null, "Um weitere Spieler hinzufügen zu können müssen Sie das Spiel neu starten.");
            }
        }
    }//GEN-LAST:event_p_3ActionPerformed

    private void p_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_4ActionPerformed
        // TODO add your handling code here:

        if (format != 0 && bl.size() == 0) {
            for (int i = 1; i < 5; i++) {
                String name = JOptionPane.showInputDialog("Name von Spieler " + i);
                if (name == null) {
                    break;
                }
                Player pl = new Player(name, format);
                if (i == 1) {
                    pl.setThrowing(true);
                }
                bl.add(pl);

            }
        } else {
            if (format == 0) {
                JOptionPane.showMessageDialog(null, "Kein Format ausgewählt!");
            } else {
                JOptionPane.showMessageDialog(null, "Um weitere Spieler hinzufügen zu können müssen Sie das Spiel neu starten.");
            }
        }
    }//GEN-LAST:event_p_4ActionPerformed

    private void f_301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_301ActionPerformed
        // TODO add your handling code here:
        if (format != 0) {
            JOptionPane.showMessageDialog(null, "Restarte das Spiel um die Änderungen zu aktivieren!");
        }
        format = 301;

    }//GEN-LAST:event_f_301ActionPerformed

    private void f_501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_501ActionPerformed
        // TODO add your handling code here:
        if (format != 0) {
            JOptionPane.showMessageDialog(null, "Restarte das Spiel um die Änderungen zu aktivieren!");
        }
        format = 501;

    }//GEN-LAST:event_f_501ActionPerformed

    private void s_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_rActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_s_rActionPerformed

    private void s_input_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_input_valActionPerformed
        // TODO add your handling code here:
        //wert input
        currentPlayer = bl.getCurrent();

        if (format != 0 && bl.size() != 0) {
            int wurf = 0;
            String geworfen = JOptionPane.showInputDialog("Anzahl der geworfenen Punkte: ");
            try {
                wurf = Integer.parseInt(geworfen);
                if (wurf < 0 || wurf > 180) {
                    JOptionPane.showMessageDialog(null, "Ungültige Anzahl an Punkten!");

                } else {
                    currentPlayer.throw_input_value(wurf);
                    bl.next(currentPlayer);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ungültiger Wert!");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Kein Format oder Spieler!");
        }


    }//GEN-LAST:event_s_input_valActionPerformed

    private void s_input_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_input_threeActionPerformed
        // TODO add your handling code here:
        //felder input

        currentPlayer = bl.getCurrent();

        if (format != 0 && bl.size() != 0) {
            int value = 0;

            for (int i = 1; i < 4; i++) {
                String feld = JOptionPane.showInputDialog("Getroffenes Feld beim " + i + ". Wurf");

                try {
                    currentPlayer.throw_input_einzeln(feld);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ungültiger Wert!");
                    i--;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kein Format oder Spieler!");
        }

        bl.next(currentPlayer);
    }//GEN-LAST:event_s_input_threeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DartGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Format;
    private javax.swing.JMenu Spieler;
    private javax.swing.JMenu Steuerung;
    private javax.swing.JLabel b;
    private javax.swing.JPanel board;
    private javax.swing.JLabel c;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JPanel checkout;
    private javax.swing.JButton confirm;
    private javax.swing.JMenuItem f_301;
    private javax.swing.JMenuItem f_501;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem p_1;
    private javax.swing.JMenuItem p_2;
    private javax.swing.JMenuItem p_3;
    private javax.swing.JMenuItem p_4;
    private javax.swing.JPanel player;
    private javax.swing.JLabel s;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JMenuItem s_input_three;
    private javax.swing.JMenuItem s_input_val;
    private javax.swing.JMenuItem s_r;
    private javax.swing.JTable table;
    private javax.swing.JPanel throwvalue;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
