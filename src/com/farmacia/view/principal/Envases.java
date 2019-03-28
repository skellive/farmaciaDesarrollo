/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.view.principal;

import com.farmacia.dao.CRUD;
import com.farmacia.conponentes.Tablas;
import com.farmacia.entities1.ClaseReporte;
import com.farmacia.entities1.EnvaseProducto;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;


/**
 *
 * @author michaels
 */
public class Envases extends javax.swing.JDialog {
    int x,y;
    CRUD crud = new CRUD();
    EnvaseProducto tp = new EnvaseProducto();
    ArrayList<EnvaseProducto> altp = null;
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    /**
     * Creates new form EstoEsPrueba
     *
     * @param parent
     * @param modal
     */
    public Envases(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        Defecto();

    }

    public void Defecto() {
        DefaultTableModel model = new DefaultTableModel();

        envase_tb.setModel(model);
        model.addColumn("ID");
        model.addColumn("Tipo de envase");

        altp = crud.MostrarEnvase();
        Tablas.listarEnvase(altp, envase_tb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        envase_tb = new javax.swing.JTable();
        nuevo_btn = new javax.swing.JButton();
        actualizar_bt = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        busqueda_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        envase_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        envase_tb.setFocusable(false);
        envase_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                envase_tbMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(envase_tb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        nuevo_btn.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        nuevo_btn.setForeground(new java.awt.Color(31, 115, 36));
        nuevo_btn.setText("NUEVO");
        nuevo_btn.setFocusable(false);
        nuevo_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        actualizar_bt.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        actualizar_bt.setText("ACTUALIZAR");
        actualizar_bt.setFocusable(false);
        actualizar_bt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizar_bt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(235, 4, 4));
        salir_btn.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        salir_btn.setForeground(new java.awt.Color(254, 254, 254));
        salir_btn.setText("SALIR");
        salir_btn.setFocusable(false);
        salir_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("BUSQUEDA:");

        busqueda_tf.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        busqueda_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busqueda_tfKeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENVASES");
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

        Reporte.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        Reporte.setText("IMPRIMIR");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(busqueda_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busqueda_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Envases_Nuevo tn = new Envases_Nuevo(new javax.swing.JFrame(), true);
        tn.setVisible(true);
    }//GEN-LAST:event_nuevo_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void envase_tbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envase_tbMousePressed
        int id = envase_tb.getSelectedRow();
        if (evt.getClickCount() == 2) {
            tp = devuelveObjeto(Integer.valueOf(envase_tb.getValueAt(id, 0).toString()), altp);
            if (tp != null) {
                setVisible(false);
                Envases_Actualizado ta = new Envases_Actualizado(new javax.swing.JFrame(), true, tp);
                ta.setVisible(true);
            }
        }
    }//GEN-LAST:event_envase_tbMousePressed

    private void actualizar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btActionPerformed
        // TODO add your handling code here:
        int id = envase_tb.getSelectedRow();
        if (envase_tb.getSelectedRow() >= 0) {
            tp = devuelveObjeto(Integer.valueOf(envase_tb.getValueAt(id, 0).toString()), altp);
            setVisible(false);
            Envases_Actualizado ta = new Envases_Actualizado(new javax.swing.JFrame(), true, tp);
            ta.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione un registro de la tabla primero");
        }
    }//GEN-LAST:event_actualizar_btActionPerformed

    private void busqueda_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busqueda_tfKeyReleased
        String valor = busqueda_tf.getText();
        Tablas.filtro(valor, envase_tb);
    }//GEN-LAST:event_busqueda_tfKeyReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        java.util.List lista = new ArrayList();
        for (int i = 0; i < envase_tb.getRowCount(); i++) {
            ClaseReporte Envases = new ClaseReporte (envase_tb.getValueAt(i, 0).toString(),envase_tb.getValueAt(i, 1).toString());
            lista.add(Envases);
        }
        try {
            String dir = System.getProperty("user.dir") + "/Reportes/" +"Envases.jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null, new JRBeanCollectionDataSource(lista));
            JDialog frame = new JDialog(this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho/2,alto/2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(Envases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReporteActionPerformed

    public EnvaseProducto devuelveObjeto(int id, ArrayList<EnvaseProducto> lista) {
        EnvaseProducto gh = new EnvaseProducto();
        for (int i = 0; i < lista.size(); i++) {
            if (id == lista.get(i).getId_envase()) {
                gh = lista.get(i);
            }
        }
        return gh;
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
            java.util.logging.Logger.getLogger(Tipo_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tipo_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tipo_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipo_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Envases dialog = new Envases(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Reporte;
    private javax.swing.JButton actualizar_bt;
    private javax.swing.JTextField busqueda_tf;
    private javax.swing.JTable envase_tb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
