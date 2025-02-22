/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuchanh1;

import java.awt.Color;
import java.awt.Window;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.SwingUtilities;




/**
 *
 * @author LAPTOP AK
 */
public class FormTinhDienHichHCN extends javax.swing.JFrame {
    /**
     * Creates new form FormTinhDienThichHCN
     */
    public FormTinhDienHichHCN() {
        initComponents();
        setLocationRelativeTo(null);
    }
private void luuLichSu(String ketQua) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("luutru.txt", true))) {
        writer.write(ketQua);
        writer.newLine();
    } catch (IOException e) {
        System.out.println("Lỗi khi ghi vào file: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTinh = new javax.swing.JButton();
        btnNhaplai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtKetQua = new javax.swing.JTextField();
        txtChieuDai = new javax.swing.JTextField();
        txtChieuRong = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("TÍNH DIỆN TÍCH HÌNH CHỮ NHẬT");

        jLabel2.setText("Nhập chiều dài");

        jLabel3.setText("Nhập chiều rộng");

        btnTinh.setText("Tính");
        btnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhActionPerformed(evt);
            }
        });

        btnNhaplai.setText("Nhập lại");
        btnNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaplaiActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnTinh)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnNhaplai)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChieuDai, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(txtChieuRong)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtChieuDai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChieuRong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTinh)
                    .addComponent(btnNhaplai)
                    .addComponent(btnThoat))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhActionPerformed
        // TODO add your handling code here:
                                                    
    try {
        double chieuDai = Double.parseDouble(txtChieuDai.getText());
        double chieuRong = Double.parseDouble(txtChieuRong.getText());

        if (chieuDai <= 0 || chieuRong <= 0) {
            txtKetQua.setForeground(Color.RED);
            txtKetQua.setText("Chiều dài & chiều rộng phải > 0!");
            return;
        }

        double dienTich = chieuDai * chieuRong;
        txtKetQua.setForeground(Color.BLUE);
        txtKetQua.setText("Diện tích: " + dienTich);

        // Ghi vào file
        luuLichSu("Chiều dài: " + chieuDai + ", Chiều rộng: " + chieuRong + " -> Diện tích: " + dienTich);

    } catch (NumberFormatException e) {
        txtKetQua.setForeground(Color.RED);
        txtKetQua.setText("Vui lòng nhập số hợp lệ!");
    }
    // c


    }//GEN-LAST:event_btnTinhActionPerformed

    private void btnNhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaplaiActionPerformed
        // TODO add your handling code here:
        txtChieuDai.setText("");
        txtChieuRong.setText("");
        txtKetQua.setText("Kết quả: ");
        txtKetQua.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnNhaplaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();  

    
        FormChinh formChinh = new FormChinh();
        formChinh.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(FormTinhDienHichHCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTinhDienHichHCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTinhDienHichHCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTinhDienHichHCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTinhDienHichHCN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhaplai;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtChieuDai;
    private javax.swing.JTextField txtChieuRong;
    private javax.swing.JTextField txtKetQua;
    // End of variables declaration//GEN-END:variables
}
