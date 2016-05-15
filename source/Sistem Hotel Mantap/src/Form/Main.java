/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Class.*;

/**
 *
 * @author Irfandi
 */
public class Main extends javax.swing.JFrame {
    Thread UPDATE_TIME;
    DateAndTime dt = new DateAndTime();
    UserEngine user = new UserEngine();
    
    class GET_TIME implements Runnable {

        public void run() {
            try {
                for (int x = 0;; x++) {
                    lbl_jam.setText(dt.GET_CURRENT_TIME("H:M"));
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbl_tanggal.setText(dt.GET_CURRENT_DATE("D-M-Y"));
        UPDATE_TIME = new Thread(new GET_TIME());
        UPDATE_TIME.start();
        System.out.println(user.liat());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_beranda = new javax.swing.JLabel();
        icon_plus = new javax.swing.JLabel();
        icon_plus1 = new javax.swing.JLabel();
        icon_plus2 = new javax.swing.JLabel();
        icon_plus3 = new javax.swing.JLabel();
        menu_transaksi = new javax.swing.JLabel();
        menu_pelanggan = new javax.swing.JLabel();
        menu_keuangan = new javax.swing.JLabel();
        icon_beranda = new javax.swing.JLabel();
        icon_transaksi = new javax.swing.JLabel();
        icon_pelanggan = new javax.swing.JLabel();
        icon_keuangan = new javax.swing.JLabel();
        highlight = new javax.swing.JLabel();
        PANEL_BERANDA_OVERVIEW = new javax.swing.JLayeredPane();
        lbl_jam = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_beranda.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        menu_beranda.setForeground(new java.awt.Color(255, 255, 255));
        menu_beranda.setText("Beranda");
        menu_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_berandaMouseClicked(evt);
            }
        });
        getContentPane().add(menu_beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 120, -1, -1));

        icon_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        getContentPane().add(icon_plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 122, -1, -1));

        icon_plus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        getContentPane().add(icon_plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 192, -1, -1));

        icon_plus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        getContentPane().add(icon_plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 262, -1, -1));

        icon_plus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        getContentPane().add(icon_plus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 332, -1, -1));

        menu_transaksi.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        menu_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        menu_transaksi.setText("Transaksi");
        menu_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_transaksiMouseClicked(evt);
            }
        });
        getContentPane().add(menu_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, -1, -1));

        menu_pelanggan.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        menu_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        menu_pelanggan.setText("Pelanggan");
        menu_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_pelangganMouseClicked(evt);
            }
        });
        getContentPane().add(menu_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 260, -1, -1));

        menu_keuangan.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        menu_keuangan.setForeground(new java.awt.Color(255, 255, 255));
        menu_keuangan.setText("Keuangan");
        menu_keuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_keuanganMouseClicked(evt);
            }
        });
        getContentPane().add(menu_keuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 330, -1, -1));

        icon_beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/beranda.png"))); // NOI18N
        getContentPane().add(icon_beranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, -1, -1));

        icon_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transaksi.png"))); // NOI18N
        getContentPane().add(icon_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 192, -1, -1));

        icon_pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pelanggan.png"))); // NOI18N
        getContentPane().add(icon_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 262, -1, -1));

        icon_keuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/keuangan.png"))); // NOI18N
        getContentPane().add(icon_keuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 332, -1, -1));

        highlight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/selected.png"))); // NOI18N
        getContentPane().add(highlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 100, 280, 70));

        PANEL_BERANDA_OVERVIEW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_jam.setFont(new java.awt.Font("Segoe UI Light", 0, 72)); // NOI18N
        lbl_jam.setText("19:45");
        PANEL_BERANDA_OVERVIEW.add(lbl_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        lbl_tanggal.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lbl_tanggal.setText("15 Mei 2016");
        PANEL_BERANDA_OVERVIEW.add(lbl_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 83, -1, -1));

        getContentPane().add(PANEL_BERANDA_OVERVIEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 990, 550));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MAIN LAYOUT.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_transaksiMouseClicked
        highlight.setLocation(-4, 170);
    }//GEN-LAST:event_menu_transaksiMouseClicked

    private void menu_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_berandaMouseClicked
        highlight.setLocation(-4, 100);
    }//GEN-LAST:event_menu_berandaMouseClicked

    private void menu_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_pelangganMouseClicked
        highlight.setLocation(-4, 240);
    }//GEN-LAST:event_menu_pelangganMouseClicked

    private void menu_keuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_keuanganMouseClicked
        highlight.setLocation(-4, 310);
    }//GEN-LAST:event_menu_keuanganMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLayeredPane PANEL_BERANDA_OVERVIEW;
    private javax.swing.JLabel highlight;
    private javax.swing.JLabel icon_beranda;
    private javax.swing.JLabel icon_keuangan;
    private javax.swing.JLabel icon_pelanggan;
    private javax.swing.JLabel icon_plus;
    private javax.swing.JLabel icon_plus1;
    private javax.swing.JLabel icon_plus2;
    private javax.swing.JLabel icon_plus3;
    private javax.swing.JLabel icon_transaksi;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_tanggal;
    private javax.swing.JLabel menu_beranda;
    private javax.swing.JLabel menu_keuangan;
    private javax.swing.JLabel menu_pelanggan;
    private javax.swing.JLabel menu_transaksi;
    // End of variables declaration//GEN-END:variables
}
