/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halallabirintus;

import javax.swing.JOptionPane;

/**
 *
 * @author KádárKristófPéter(SZ
 */
public class StartMenu extends javax.swing.JFrame {

    /**
     * Creates new form HalalLabirintus
     */
    public StartMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_cim = new javax.swing.JLabel();
        label_kezdes = new javax.swing.JButton();
        label_kilepes = new javax.swing.JButton();
        button_stablista = new javax.swing.JButton();
        label_mezo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        label_cim.setFont(new java.awt.Font("Viner Hand ITC", 3, 48)); // NOI18N
        label_cim.setForeground(new java.awt.Color(153, 0, 0));
        label_cim.setText("Halál Labirintus");
        getContentPane().add(label_cim);
        label_cim.setBounds(90, 50, 420, 80);

        label_kezdes.setText("Játék kezdés");
        label_kezdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_kezdesActionPerformed(evt);
            }
        });
        getContentPane().add(label_kezdes);
        label_kezdes.setBounds(130, 270, 110, 40);

        label_kilepes.setText("Kilépés");
        label_kilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_kilepesActionPerformed(evt);
            }
        });
        getContentPane().add(label_kilepes);
        label_kilepes.setBounds(380, 270, 110, 40);

        button_stablista.setText("Stáblista");
        button_stablista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_stablistaActionPerformed(evt);
            }
        });
        getContentPane().add(button_stablista);
        button_stablista.setBounds(270, 280, 90, 23);

        label_mezo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/mezo.jpg"))); // NOI18N
        getContentPane().add(label_mezo);
        label_mezo.setBounds(0, 0, 587, 330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_stablistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_stablistaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Tar Gergő\nKépiró Balázs\nKádár Kristóf");
    }//GEN-LAST:event_button_stablistaActionPerformed

    private void label_kilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_kilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_label_kilepesActionPerformed

    private void label_kezdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_kezdesActionPerformed
        dispose();
        JatekArena pi = new JatekArena();
        pi.setVisible(true);
    }//GEN-LAST:event_label_kezdesActionPerformed
    
    
    private void kilepes() {
        //System.exit(0);
        //int gomb = JOptionPane.showConfirmDialog(rootPane,"Biztosan kilép?");
        
        String kerdes = "Biztosan kilép?";
        String cim = "KILÉPÉS";
        int gombokTipusa = JOptionPane.OK_CANCEL_OPTION;
        
        int gomb = JOptionPane.showConfirmDialog(rootPane,kerdes,cim,gombokTipusa);
        //System.out.println("gomb = " + gomb);
        
        if (gomb == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }
    
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
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_stablista;
    private javax.swing.JLabel label_cim;
    private javax.swing.JButton label_kezdes;
    private javax.swing.JButton label_kilepes;
    private javax.swing.JLabel label_mezo;
    // End of variables declaration//GEN-END:variables
}
