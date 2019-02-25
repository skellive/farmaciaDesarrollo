/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.view.principal;

import com.farmacia.dao.CRUD;
import java.awt.MouseInfo;
import java.awt.Point;

/**
 *
 * @author michaels
 */
public class Tipo_Nuevo extends javax.swing.JDialog {

    CRUD crud = new CRUD();
    Tipo_Producto tipo = new Tipo_Producto(new javax.swing.JFrame(), true);
    int x,y;
    /**
     * Creates new form Tipo_Actualizado
     *
     * @param parent
     * @param modal
     */
    public Tipo_Nuevo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        insertar_tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        salir_btn = new javax.swing.JButton();
        guardar_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUEVO TIPO DE PRODUCTO");
        jLabel2.setOpaque(true);
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        insertar_tf.setBorder(null);
        insertar_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                insertar_tfFocusLost(evt);
            }
        });
        insertar_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar_tfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText(" TIPO:");

        salir_btn.setBackground(new java.awt.Color(235, 4, 4));
        salir_btn.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        salir_btn.setForeground(new java.awt.Color(254, 254, 254));
        salir_btn.setText("CANCELAR");
        salir_btn.setOpaque(true);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        guardar_bt.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        guardar_bt.setForeground(new java.awt.Color(71, 118, 83));
        guardar_bt.setText("GUARDAR");
        guardar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardar_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btActionPerformed
        // TODO add your handling code here:
        String valor = insertar_tf.getText();
        crud.InsertarTipo(valor);
        setVisible(false);
        Tipo_Producto t_p = new Tipo_Producto(new javax.swing.JFrame(), true);
        t_p.setVisible(true);
    }//GEN-LAST:event_guardar_btActionPerformed

    private void insertar_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insertar_tfFocusLost
        insertar_tf.setText(insertar_tf.getText().toUpperCase());
    }//GEN-LAST:event_insertar_tfFocusLost

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tipo.setVisible(true);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void insertar_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertar_tfActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
            setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jLabel2MouseDragged

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipo_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Tipo_Nuevo dialog = new Tipo_Nuevo(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar_bt;
    private javax.swing.JTextField insertar_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
