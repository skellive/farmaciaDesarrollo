/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.usuario;

import com.farmacia.conponentes.Cargar;
import com.farmacia.dao.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import sistemafarmacia.presentacion.FrmLogin;

/**
 *
 * @author admin1
 */
public final class Frm_CargarSistema extends javax.swing.JFrame {
    
    private static final long serialVersionUID = 1L;
    Cargar hilo;
    Conexion c = new Conexion();

    /**
     * Creates new form CargaSistema
     */
    public Frm_CargarSistema() {
        setUndecorated(true);
        initComponents();
        Image logof = new ImageIcon(System.getProperty("user.dir")+"/src/Frm/imagen/Asofar.jpeg").getImage();
        
        this.setIconImage(logof);
        setLocationRelativeTo(null);
        carga_pb.setStringPainted(true);
        UIManager.put("nimbusOrange", new Color(38, 139, 210));
        hilo = new Cargar(carga_pb);
        hilo.start();
        hilo = null;
        imagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carga_pb = new javax.swing.JProgressBar();
        lbImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carga_pb.setBackground(java.awt.Color.black);
        carga_pb.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        carga_pb.setForeground(new java.awt.Color(153, 0, 0));
        carga_pb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                carga_pbStateChanged(evt);
            }
        });
        getContentPane().add(carga_pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 287, 730, -1));
        getContentPane().add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        public void imagenes(){
        Image logof = new ImageIcon(System.getProperty("user.dir")+"/src/Frm/imagen/fondofinal.jpg").getImage();
        Icon fondoLogo = new ImageIcon(logof.getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), Image.SCALE_DEFAULT));
        lbImagen.setIcon(fondoLogo);
        this.repaint();
    }
    private void carga_pbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_carga_pbStateChanged
        // TODO add your handling code here:
        if (carga_pb.getValue() == 100) {
            try {
                if (c.conectar() == null) {
                    JOptionPane.showMessageDialog(this, "LA BASE DE DATOS NO ESTÁ ACTIVA");
                } else {
                    dispose();
                    FrmLogin fl = new FrmLogin();
                    fl.setVisible(true);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Frm_CargarSistema.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_carga_pbStateChanged

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
            java.util.logging.Logger.getLogger(Frm_CargarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frm_CargarSistema().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar carga_pb;
    private javax.swing.JLabel lbImagen;
    // End of variables declaration//GEN-END:variables
}
