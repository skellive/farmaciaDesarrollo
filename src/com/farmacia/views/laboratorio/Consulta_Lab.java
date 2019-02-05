/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.laboratorio;

//import com.objetos.conponentes.Tablas;
//import com.objetos.dao.CRUD;
//import com.objetos.dao.Consultas;
//import com.objetos.entities.Laboratorio;
//import com.objetos.file.Archivos;
import com.farmacia.conponentes.Tablas;
import com.farmacia.dao.CRUD;
import com.farmacia.dao.Consultas;
import com.farmacia.entities1.Laboratorio;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author alumno
 */
public class Consulta_Lab extends javax.swing.JDialog {

    int poss;
    static ArrayList<Laboratorio> listar = null;
    Laboratorio objeto = new Laboratorio();
    Consultas c = new Consultas();
    CRUD cr = new CRUD();
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    /**
     * Creates new form Consulta_Lab
     */
    public Consulta_Lab(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
//        
        this.setLocationRelativeTo(null);

        listar = cr.ListarLab();
//        System.out.println(listar.size());
//        for (int i = 0; i < listar.size(); i++) {
//             System.out.println (listar.get(i).getRUC() +", " + listar.get(i).getNombre() + ", " +  listar.get(i).getDireccion());
//
//        }
        // listar = Archivos.leerLab("Lab.txt");
        Tablas.listarLab(listar, Tabla);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        filtro = new javax.swing.JTextField();
        BotonNuevo = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        tipofiltro = new javax.swing.JComboBox<>();
        BotonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        Tabla.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RUC", "Nombre", "Direccion", "Telefono", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroKeyReleased(evt);
            }
        });

        BotonNuevo.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/añadir1.jpg"))); // NOI18N
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/eliminar1.png"))); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        tipofiltro.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tipofiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUC", "Nombre", "Direccion", "Telefono" }));

        BotonBuscar.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/buscar1.jpg"))); // NOI18N
        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel1.setText("Seleccione el campo que desea buscar");

        btnReporte.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnReporte.setText("IMPRIMIR");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tipofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonBuscar)
                .addGap(18, 18, 18)
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonSalir)
                    .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    public Laboratorio devuelveObjeto(String datos, ArrayList<Laboratorio> listarobj) {
        Laboratorio objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getRUC())) {
                objeto1 = listarobj.get(i);
                break;
            }
        }
        return objeto1;
    }

    private void filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroKeyReleased
        // TODO add your handling code here:
//        String dat = Filtro.getText();
//        Tablas.filtro(dat, Tabla);
    }//GEN-LAST:event_filtroKeyReleased

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        // TODO add your handling code here:
        Ingresar_Lab obj = new Ingresar_Lab(new javax.swing.JFrame(), true);
        obj.setVisible(true);
        // listar = Archivos.leerLab("Lab.txt");
        listar = cr.ListarLab();
        Tablas.listarLab(listar, Tabla);
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        // TODO add your handling code here:
        int i = 0;
        try {
            if (evt.getClickCount() == 2) {
                i = Tabla.getSelectedRow();
                objeto = devuelveObjeto(Tabla.getValueAt(i, 0).toString(), listar);
                if (objeto != null) {
                    Editar_Lab doc
                            = new Editar_Lab(new javax.swing.JFrame(), true, objeto, i);
                    doc.setVisible(true);

                   // setVisible(false);
                    // listar = Archivos.leerLab("Lab.txt");
                    listar = cr.ListarLab();
                    Tablas.listarLab(listar, Tabla);
                   // setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TablaMousePressed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        String f = filtro.getText().toUpperCase();
//        if(f==null || "".equals(f)){
//              JOptionPane.showMessageDialog(null, "Filtro invalido!");
//        }else{

            String query ="select * from laboratorio where "+(String)tipofiltro.getSelectedItem()+
                    " like '%"+f+"%'";
            System.err.println(query);
            listar=cr.ListarLabBtn(query);
            System.err.println(query);
            Tablas.listarLab(listar, Tabla);
            
          
//        }

    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        ArrayList tablac = new ArrayList();
        for(int i=0;i<Tabla.getRowCount();i++){
            Laboratorio tabla1 = new Laboratorio (Tabla.getValueAt(i,0).toString(),Tabla.getValueAt(i,1).toString(),Tabla.getValueAt(i,2).toString(),Tabla.getValueAt(i,3).toString(),Tabla.getValueAt(i,4).toString());
            tablac.add(tabla1);}
        try{
            JasperReport reporte = (JasperReport) JRLoader.loadObject("Consulta_Lab.jasper");
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null,new JRBeanCollectionDataSource(tablac));
            JDialog frame = new JDialog (this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho/2,alto/2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(Consulta_Lab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

//    public void Eliminar(String datos) {
//
//        Laboratorio res = null;
//
//        res = EliminarOp(datos);
//        if (res == null) {
//            JOptionPane.showMessageDialog(null, "Laboratorio eliminado");
//        } else {
//            JOptionPane.showMessageDialog(null, "Error, seleccione el Laboratoio a eliminar");
//        }
//    }
//
//    public Laboratorio EliminarOp(String datos) {
//       // listar = Archivos.leerLab("Lab.txt");
//        listar=  c.listarLab("proyecto", "Select * from laboratorio");
//        int per = -1;
//        Laboratorio lb = null;
//        per = getposicion(datos);
//
//        if (per != -1) {
//            listar.remove(per);
//            //Archivos.CrearArchi("Lab.txt", CadenaLab(), false);
//            cr.Eliminar("proyecto", lb);
//        }
//        return lb;
//
//    }
//    public static String CadenaLab() {
//        String cadena = " ";
//        for (int i = 0; i < listar.size(); i++) {
//            cadena = cadena + listar.get(i).getRUC() + "; "
//                    + listar.get(i).getNombre() + "; "
//                    + listar.get(i).getDireccion() + "; "
//                    + listar.get(i).getTelefono() + "; "
//                    + listar.get(i).getFecha() + "; "
//                    + listar.get(i).getImagen() + "; " + "\n";
//        }
//        return cadena;
//    }
//
//    public int getposicion(String datos) {
//        int per = -1;
//        try {
//            for (int j = 0; j < listar.size(); j++) {
//                if (datos.equals(listar.get(j).getRUC())) {
//                    per = j;
//                    break;
//                }
//            }
//        } catch (Exception e) {
//        }
//        return per;
//    }
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
            java.util.logging.Logger.getLogger(Consulta_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consulta_Lab dialog = new Consulta_Lab(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnReporte;
    private javax.swing.JTextField filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tipofiltro;
    // End of variables declaration//GEN-END:variables
}
