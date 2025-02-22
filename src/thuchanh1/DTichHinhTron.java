
package thuchanh1;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DTichHinhTron extends javax.swing.JFrame {

    public DTichHinhTron() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private void luuLichSu(String banKinh, double dienTich) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("luutru.txt", true))) {
            writer.write("Bán kính: " + banKinh + " -> Diện tích: " + String.format("%.2f", dienTich));
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBankinh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTinh = new javax.swing.JButton();
        btnNhaplai = new javax.swing.JButton();
        txtKetqua = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBankinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankinhActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DIỆN TÍCH HÌNH TRÒN");

        jLabel2.setText("Nhập bán kính");

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

        txtKetqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKetquaActionPerformed(evt);
            }
        });

        btnThoat.setText("thoát");
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
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBankinh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addComponent(txtKetqua, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTinh)
                        .addGap(18, 18, 18)
                        .addComponent(btnNhaplai)
                        .addGap(27, 27, 27)
                        .addComponent(btnThoat)))
                .addGap(0, 117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBankinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(txtKetqua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTinh)
                    .addComponent(btnNhaplai)
                    .addComponent(btnThoat))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBankinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankinhActionPerformed

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhActionPerformed
        String input = txtBankinh.getText().trim();
        if (input.isEmpty()) {
            txtKetqua.setForeground(Color.RED);
            txtKetqua.setText("Vui lòng nhập bán kính!");
            txtBankinh.requestFocus();
            return;
        }
        try {
            double r = Double.parseDouble(input);
            if (r < 0) {
                txtKetqua.setForeground(Color.RED);
                txtKetqua.setText("Bán kính không hợp lệ!");
                return;
            }
            double area = Math.PI * r * r;
            txtKetqua.setForeground(Color.BLUE);
            txtKetqua.setText(String.format("Diện tích: %.2f", area));
            luuLichSu(input, area);
        } catch (NumberFormatException ex) {
            txtKetqua.setForeground(Color.RED);
            txtKetqua.setText("Bán kính phải là số!");
        }
    }//GEN-LAST:event_btnTinhActionPerformed

    private void btnNhaplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaplaiActionPerformed
        txtBankinh.setText("");
        txtKetqua.setText("");
        txtBankinh.requestFocus();

    }//GEN-LAST:event_btnNhaplaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();  

    
        FormChinh formChinh = new FormChinh();
        formChinh.setVisible(true);

    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtKetquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKetquaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKetquaActionPerformed

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
            java.util.logging.Logger.getLogger(DTichHinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DTichHinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DTichHinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DTichHinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DTichHinhTron().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhaplai;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtBankinh;
    private javax.swing.JTextField txtKetqua;
    // End of variables declaration//GEN-END:variables
}
