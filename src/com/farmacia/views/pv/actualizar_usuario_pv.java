/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.pv;

import com.farmacia.conponentes.Formulario;
import com.farmacia.dao.CRUD;
import com.farmacia.entities1.ClaseReporte;
import com.farmacia.entities1.Estado_usuario;
import com.farmacia.entities1.Genero;
import com.farmacia.entities1.Listar_usuario;
import com.farmacia.entities1.Rol_U;
import com.farmacia.entities1.Usuario_S;
import com.farmacia.operaciones.Operaciones;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class actualizar_usuario_pv extends javax.swing.JDialog {
     int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    CRUD crud = new CRUD();
    String imagen = "";
    ArrayList<Usuario_S> lista = null;
    ArrayList<Genero> lista1 = null;
    ArrayList<Rol_U> lista2 = null;
    ArrayList<Estado_usuario> lista3 = null;
//    ArrayList<Genero> lista1 = crud.listarGenero();
//    ArrayList<Rol_U> lista2 = crud.listarRol();
//    ArrayList<Estado_usuario> lista3 = crud.listarEstado();
    Listar_usuario obj1 = null;
    String ro =null;
    String est = null;
    String gen =null;
    private String rutaimagen = "";
    public String fil;

    
    /**
     * Creates new form Registrar
     */
    public actualizar_usuario_pv(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public actualizar_usuario_pv(java.awt.Frame parent, boolean modal,Listar_usuario obj2) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        obj1 = obj2;
        llenarForm(obj1);
        combos(obj1);
//        cbGenero.setModel(Formulario.listarComboGenero(lista1));
//        cbRol.setModel(Formulario.listarComboRol(lista2));
//        cbEstado.setModel(Formulario.listarComboEstado(lista3));
        txtId.setEnabled(false);
        bloqueo(false);
    }
    
    public void combos(Listar_usuario obj){
        lista1 = crud.listarGenero();
        lista2 = crud.listarRol();
        lista3 = crud.listarEstado();
        
        cbGenero.setModel(Formulario.listarComboGenero(lista1));
        cbRol.setModel(Formulario.listarComboRol(lista2));
        cbEstado.setModel(Formulario.listarComboEstado(lista3));
        
        ro = crud.getCombosAcUsuarios(Long.valueOf("1"), obj.getId_rol());
        cbRol.setSelectedItem(ro);
        System.out.println("pejjd"+obj.getId_rol());
        est = crud.getCombosAcUsuarios(Long.valueOf("2"), obj.getId_estado());
        cbEstado.setSelectedItem(est);
        gen = crud.getCombosAcUsuarios(Long.valueOf("3"), obj.getId_genero());
        cbGenero.setSelectedItem(gen);
    }
    
    public void llenarForm(Listar_usuario obj1){
        txtId.setText(obj1.getId_sesion().toString());
        txtCedula.setText(obj1.getCedula());
        txtApellido.setText(obj1.getApellidos());
        txtNombre.setText(obj1.getNombres());
        txtCell.setText(obj1.getTelefono());
        txtCorreo.setText(obj1.getCorreo());
        txtDireccion.setText(obj1.getDireccion());
        txtObservacion.setText(obj1.getObservacion());
        txtConven.setText(obj1.getConvencional());
        getPicture2(obj1.getRuta_imagen());
    }
    
    public void bloqueo(boolean opc){
        txtApellido.setEnabled(opc);
        txtCedula.setEnabled(opc);
        txtCell.setEnabled(opc);
        txtConPass.setEnabled(opc);
        txtConven.setEnabled(opc);
        txtCorreo.setEnabled(opc);
        txtDireccion.setEnabled(opc);
        txtNombre.setEnabled(opc);
        txtObservacion.setEnabled(opc);
        txtPass.setEnabled(opc);
        cbEstado.setEnabled(opc);
        cbGenero.setEnabled(opc);
        cbRol.setEnabled(opc);
        lbImagen.setEnabled(opc);
        btnGuardar.setEnabled(opc);
        btnImagen.setEnabled(opc);
        btnLimpiarImg.setEnabled(opc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        btnLimpiarImg = new javax.swing.JButton();
        btnImagen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        txtCell = new javax.swing.JTextField();
        txtConven = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtConPass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 1, 1), 2));

        lbImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLimpiarImg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiarImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/salir1.png"))); // NOI18N
        btnLimpiarImg.setText("LIMPIAR");
        btnLimpiarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarImgActionPerformed(evt);
            }
        });

        btnImagen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/agregarCliente.png"))); // NOI18N
        btnImagen.setText("IMAGEN");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });
        btnImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnImagenKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnImagen)
                .addGap(30, 30, 30)
                .addComponent(btnLimpiarImg)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 1, 1), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRES:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("APELLIDOS:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CEDULA:");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("DIRECCION:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("OBSERVACION:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("GENERO:");

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("CELULAR:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("CONVENCIONAL:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("CORREO:");

        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        cbGenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbGeneroFocusLost(evt);
            }
        });

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        txtObservacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacionFocusLost(evt);
            }
        });
        txtObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtObservacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservacion);

        txtCell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellKeyTyped(evt);
            }
        });

        txtConven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConvenKeyTyped(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("ROL:");

        cbRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("ESTADO:");

        cbEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("CODIGO:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("CONTRASEÑA:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("CONFIRMAR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(57, 57, 57)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(56, 56, 56)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60)
                        .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14)
                        .addGap(37, 37, 37)
                        .addComponent(txtConven, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(70, 70, 70)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12)
                        .addGap(62, 62, 62)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(54, 54, 54)
                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10)
                        .addGap(47, 47, 47)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(81, 81, 81)
                        .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel16)
                        .addGap(60, 60, 60)
                        .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConven, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Datos personales");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/eliminar1.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icon/guardar.jpg"))); // NOI18N
        btnGuardar.setText("ACTUALIZAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnHabilitar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/Activar.png"))); // NOI18N
        btnHabilitar.setText("HABILITAR");
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });

        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 153, 153));
        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(254, 254, 254));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ACTUALIZAR USUARIO");
        jLabel17.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHabilitar)
                .addGap(79, 79, 79)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(172, 172, 172))
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabilitar)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarImgActionPerformed
        VaciarImagen();
    }//GEN-LAST:event_btnLimpiarImgActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        String pass = "";
        getPicture(pass);
    }//GEN-LAST:event_btnImagenActionPerformed
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        txtNombre.setText(txtNombre.getText().toUpperCase());
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        txtApellido.setText(txtApellido.getText().toUpperCase());
    }//GEN-LAST:event_txtApellidoFocusLost

    private void cbGeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbGeneroFocusLost
        cbGenero.setSelectedItem(cbGenero.getSelectedItem().toString().toUpperCase());
    }//GEN-LAST:event_cbGeneroFocusLost

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        txtDireccion.setText(txtDireccion.getText().toUpperCase());
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtObservacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtObservacionFocusLost
        txtObservacion.setText(txtObservacion.getText().toUpperCase());
    }//GEN-LAST:event_txtObservacionFocusLost

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCellKeyTyped

    private void txtConvenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConvenKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtConvenKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        char c = evt.getKeyChar();
        char mas = '+', por='*', div='/', dp=':', pc=';', c2=',', p1='{', p2='}';
        char lla1='[',el='^', lla2=']',el2='¿', co='?', co2='¡',c3='!', d='"',e='#';
        char col='$', a='!',b='=',e2='%',f='&',g='=',h='º',i='ª',j='(',k=')',l='<',m='>';
        char n='ç',o='´',p='`',q='¨',r='Ñ',s='·',t='ñ';
        if (Character.isWhitespace(c) || c == mas || c == por || c ==  div || c == dp 
                || c == pc || c == c2 || c == p1 || c == p2 || c == lla1 || c == lla2 
                || c == el || c == el2 || c == co || c == co2 || c == c3 || c == d || c == e 
                || c ==  col || c == a || c == b || c == e2 || c == f || c == g || c == h 
                || c == i || c == j || c == k || c == l || c == m || c == n || c == o || c == p 
                || c ==  q || c == r || c == s || c == t) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionKeyTyped

    private void txtObservacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Guardar();
        }
    }//GEN-LAST:event_txtObservacionKeyPressed

    private void btnImagenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnImagenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Guardar();
        }
    }//GEN-LAST:event_btnImagenKeyPressed

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
        bloqueo(true);
    }//GEN-LAST:event_btnHabilitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    ArrayList dato = new ArrayList();
    ClaseReporte datos = new ClaseReporte(txtId.getText(),cbEstado.getSelectedItem().toString(),txtCedula.getText(),txtNombre.getText(),txtApellido.getText(),cbGenero.getSelectedItem().toString(),cbRol.getSelectedItem().toString(),txtObservacion.getText(),txtCell.getText(),txtConven.getText(),txtCorreo.getText(),txtDireccion.getText(),txtPass.getText(),txtConPass.getText(),lbImagen.toString());
    dato.add(datos);   
    try {
            String dir = System.getProperty("user.dir")+"/Reportes/"+"actualizar_usuario";
            JasperReport reporte = (JasperReport)JRLoader.loadObject(dir);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null,new JRBeanCollectionDataSource(dato));
            JDialog frame = new JDialog(this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho/2,alto/2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(actualizar_usuario_pv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void VaciarImagen() {
        // String fil = "\\G:\\sin-imagen.png";
        String fil = "//home//ineval//Escritorio//P-FARMACIA UBUNTU//sin-imagen.png";
        lbImagen.setIcon(new ImageIcon(fil));
        ImageIcon icon = new ImageIcon(fil);
        Image img = icon.getImage();
        System.out.println(fil + " Foto " + lbImagen.getWidth() + " " + lbImagen.getHeight());
        Image newimg = img.getScaledInstance(259, 221, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcono = new ImageIcon(newimg);
        lbImagen.setIcon(newIcono);
        imagen = fil;
    }

    private void getPicture(String path) {
        JFileChooser dig = new JFileChooser(path);
        dig.setFileFilter(new FileNameExtensionFilter("Archivos de imagen",
                "tif", "jpg", "jpeg", "png", "gif"));
        int opcion = dig.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            String fil = dig.getSelectedFile().getPath();
            lbImagen.setIcon(new ImageIcon(fil));
            ImageIcon icon = new ImageIcon(fil);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(lbImagen.getWidth(),lbImagen.getHeight(),Image.SCALE_DEFAULT/*259, 221, java.awt.Image.SCALE_SMOOTH*/);
            ImageIcon newIcono = new ImageIcon(newimg);
            lbImagen.setIcon(newIcono);
            imagen = dig.getSelectedFile().getPath();
            // rutaimagen = Cadenas.getPathMysql(dig.getSelectedFile().getPath());
            System.out.println(fil + " Foto " + lbImagen.getWidth() + " " + lbImagen.getHeight());
        }
    }
    
    private void getPicture2(String path) {
            lbImagen.setIcon(new ImageIcon(path));
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(lbImagen.getWidth(),lbImagen.getHeight(),Image.SCALE_DEFAULT);
            ImageIcon newIcono = new ImageIcon(newimg);
            lbImagen.setIcon(newIcono);       
            System.out.println(fil + " Foto " + lbImagen.getWidth() + " " + lbImagen.getHeight());
            System.out.println("ruta= "+rutaimagen +"\n"+
                                "ruta2 "+fil);
        }

    public void Guardar() {
        if (txtCedula.getText() == null ) {
            JOptionPane.showMessageDialog(null, "Revise el campo cédula");
        }else if (txtNombre.getText().length() < 3 || txtApellido.getText().length() < 3 ) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre o paellido válido ");
        }else if (txtCell.getText().length() < 9) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de contacto válido ");
        }else if (txtCell.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Exede la cantidad de números para un celular");
        }else if (txtCorreo.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Ingrese un correo válido ");
        }else if (txtDireccion.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Ingrese una dirección válida ");
        }else if (txtObservacion.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Ingrese una observación válida ");
        }else if (txtPass.getText().length() < 6) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 6 caracteres");
        }else if (!txtPass.getText().equals(txtConPass.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }else if (cbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un estado válido");
        }else if (cbGenero.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un género válido");
        }else if (cbRol.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un rol válido");
        }else {
            int r = JOptionPane.showConfirmDialog(null, "¿Está seguro de actualizar", "", JOptionPane.YES_NO_OPTION);

        if (r == JOptionPane.YES_OPTION) {
            
            Usuario_S obj = new Usuario_S();
            
            obj.setApellido(obj1.getApellidos());
            obj.setCargo(obj1.getCargo());
            obj.setCedula(obj1.getCedula());
            obj.setConvencional(obj1.getConvencional());
            obj.setCorreo(obj1.getCorreo());
            obj.setDireccion(obj1.getDireccion());
            obj.setEstado(obj1.getEstado());
            obj.setFecha_registro(Date.valueOf(obj1.getFecha_registro()));
            obj.setGenero(obj1.getGenero());
            obj.setId_sesion(obj1.getId_sesion());
            obj.setNombre(obj1.getNombres());
            obj.setTelefono(obj1.getTelefono());
            obj.setIp_equipo(Operaciones.getIpDispositivo());
//            obj.setIp_publico(Operaciones.getIpPublica().getIp_publica_full());
            obj.setDir_ip_completa(Operaciones.getIpLocalCompleta());
            obj.setUsuario_equipo(Operaciones.getNombreDispositivo());
            obj.setObservacion(obj.getObservacion());
            
            try {
                crud.Respaldo_usuario(obj);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            
//            System.out.println("apellido prueba:"+obj1.getApellidos());
            
            
            obj.setCedula(txtCedula.getText());
            obj.setNombre(txtNombre.getText());
            obj.setApellido(txtApellido.getText());
            obj.setTelefono(txtCell.getText());
            obj.setRuta_imagen(imagen);
            obj.setGenero(cbGenero.getSelectedItem().toString());
            obj.setCargo(cbRol.getSelectedItem().toString());
            obj.setConvencional(txtConven.getText());
            obj.setCorreo(txtCorreo.getText());
            obj.setDireccion(txtDireccion.getText());
            obj.setObservacion(txtObservacion.getText());
            obj.setIp_equipo(Operaciones.getIpDispositivo());
//            obj.setIp_publico(Operaciones.getIpPublica().getIp_publica_full());
            obj.setDir_ip_completa(Operaciones.getIpLocalCompleta());
            obj.setUsuario_equipo(Operaciones.getNombreDispositivo());
            obj.setPassword(txtPass.getText());
            obj.setEstado(cbEstado.getSelectedItem().toString());
            obj.setId_sesion(Long.valueOf(txtId.getText()));
            try {
            String a =  crud.Actualizar_usuario(obj);
            JOptionPane.showMessageDialog(this, a);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            setVisible(false);
        }
            
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
            java.util.logging.Logger.getLogger(actualizar_usuario_pv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar_usuario_pv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar_usuario_pv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar_usuario_pv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                actualizar_usuario_pv dialog = new actualizar_usuario_pv(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnLimpiarImg;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCell;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtConven;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
