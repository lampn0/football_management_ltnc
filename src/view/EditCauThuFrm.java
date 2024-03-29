/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CauThuConTroller;
import controller.ClLBController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CLB;
import model.CauThu;

/**
 *
 * @author Dell
 */
public class EditCauThuFrm extends javax.swing.JDialog {

    /**
     * Creates new form EditCauThuFrm
     */
    
    int macauthu = 0;
    List<CLB> ClbList;
    HomeFrm homeFrm;
    
    public EditCauThuFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbTenDoi = new javax.swing.JLabel();
        jlbTenCauThu = new javax.swing.JLabel();
        jlbNgaySinh = new javax.swing.JLabel();
        jlbSoAo = new javax.swing.JLabel();
        jlbViTri = new javax.swing.JLabel();
        cbTenDoi = new javax.swing.JComboBox<>();
        jtfTenCauThu = new javax.swing.JTextField();
        jtfNgaySinh = new javax.swing.JTextField();
        jtfViTri = new javax.swing.JTextField();
        jtfSoao = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN CẦU THỦ");

        jlbTenDoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTenDoi.setText("Tên đội:");

        jlbTenCauThu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTenCauThu.setText("Tên cầu thủ");

        jlbNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbNgaySinh.setText("Ngày/ tháng/ năm sinh:");

        jlbSoAo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSoAo.setText("Số áo:");

        jlbViTri.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbViTri.setText("Vị trí:");

        cbTenDoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTenDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenDoiActionPerformed(evt);
            }
        });

        jtfTenCauThu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfViTri.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfViTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfViTriActionPerformed(evt);
            }
        });

        jtfSoao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSoao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoaoActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbTenCauThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbTenDoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbSoAo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbViTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTenCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSoao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTenDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTenDoi)
                    .addComponent(jlbTenDoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbTenCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfTenCauThu)
                        .addGap(5, 5, 5)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSoAo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSoao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfViTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfViTriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfViTriActionPerformed

    private void jtfSoaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoaoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ClbList = ClLBController.findAll();
        boolean isOK = true;
        int soao = 0, madoi = 0;
        Date ngaysinh = null;
        String tendoi = null, tencauthu = null, vitri = null;

        if (cbTenDoi.getSelectedIndex() >= 0) {
            tendoi = cbTenDoi.getSelectedItem().toString();
            for(CLB clb : ClbList) {
                if(clb.getTendoi().equals(tendoi)) {
                    madoi = clb.getMadoi();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa chọn CLB");
            isOK = false;
        }
        if (jtfTenCauThu.getText().length() > 0 && jtfTenCauThu.getText() != null) {
            tencauthu = jtfTenCauThu.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập tên cầu thủ");
            isOK = false;
        }

        if (jtfNgaySinh.getText().length() > 0 && jtfNgaySinh.getText() != null) {
            try {
                ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(jtfNgaySinh.getText());
            } catch (ParseException ex) {
                Logger.getLogger(EditCauThuFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập ngày sinh");
            isOK = false;
        }

        if (jtfSoao.getText().length() > 0 && jtfSoao.getText() != null) {
            soao = Integer.parseInt(jtfSoao.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập số áo");
            isOK = false;
        }
        
        if (jtfViTri.getText().length() > 0 && jtfViTri.getText() != null) {
            vitri = jtfViTri.getText();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn chưa nhập vị trí");
            isOK = false;
        }

        if (isOK) {
            CauThu cauThu = new CauThu(madoi, macauthu, soao, ngaysinh, tencauthu, vitri);
            JOptionPane.showMessageDialog(rootPane,
                    "Bạn đã cập nhật thành công cầu thủ");
            CauThuConTroller.update(cauThu);

            this.dispose();
        }
//        homeFrm = new HomeFrm();
//        homeFrm.ShowCauThu();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbTenDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenDoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTenDoiActionPerformed

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
            java.util.logging.Logger.getLogger(EditCauThuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCauThuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCauThuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCauThuFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditCauThuFrm dialog = new EditCauThuFrm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbTenDoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbNgaySinh;
    private javax.swing.JLabel jlbSoAo;
    private javax.swing.JLabel jlbTenCauThu;
    private javax.swing.JLabel jlbTenDoi;
    private javax.swing.JLabel jlbViTri;
    private javax.swing.JTextField jtfNgaySinh;
    private javax.swing.JTextField jtfSoao;
    private javax.swing.JTextField jtfTenCauThu;
    private javax.swing.JTextField jtfViTri;
    // End of variables declaration//GEN-END:variables

    void editCauThuData(CauThu cauThu) {
        showConboData();
        macauthu = cauThu.getMacauthu();
        cbTenDoi.setSelectedItem(cauThu.getTendoi());
        jtfTenCauThu.setText(cauThu.getTencauthu());
        jtfNgaySinh.setText(cauThu.getNgaysinh().toString());
        jtfSoao.setText(String.valueOf(cauThu.getSoao()));
        jtfViTri.setText(cauThu.getVitri());
    }
    
    
    public void showConboData() {
        ClbList = ClLBController.findAll();
        cbTenDoi.removeAllItems();
        ClbList.forEach(clb -> {
            cbTenDoi.addItem(clb.getTendoi());
        });
    }
}

