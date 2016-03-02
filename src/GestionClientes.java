
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dloirport
 */
public class GestionClientes extends javax.swing.JFrame {

    ConectorBaseDatos con = new ConectorBaseDatos();

    public GestionClientes() {
        initComponents();
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaModificar = new javax.swing.JDialog();
        txtIdCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnGuardarModificacion = new javax.swing.JButton();
        btnCancelarModificacion = new javax.swing.JButton();
        lblNombre4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblNombre5 = new javax.swing.JLabel();
        lblApellidos1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre6 = new javax.swing.JLabel();
        lblCalle2 = new javax.swing.JLabel();
        lblCalle3 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblIdCliente1 = new javax.swing.JLabel();
        ventanaNuevo = new javax.swing.JDialog();
        txtIdClienteNuevo = new javax.swing.JTextField();
        txtNombreClienteNuevo = new javax.swing.JTextField();
        txtApellidosNuevo = new javax.swing.JTextField();
        txtDireccionNuevo = new javax.swing.JTextField();
        txtPoblacionNuevo = new javax.swing.JTextField();
        txtProvinciaNuevo = new javax.swing.JTextField();
        txtTelefonoNuevo = new javax.swing.JTextField();
        txtEmailNuevo = new javax.swing.JTextField();
        btnGuardarNuevo = new javax.swing.JButton();
        btnCancelarNuevo = new javax.swing.JButton();
        lblNombre8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblNombre9 = new javax.swing.JLabel();
        lblApellidos2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombre10 = new javax.swing.JLabel();
        lblCalle4 = new javax.swing.JLabel();
        lblCalle5 = new javax.swing.JLabel();
        lblNombre11 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblIdCliente2 = new javax.swing.JLabel();
        lblGestionClientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnBorrarCli = new javax.swing.JButton();
        btnModCli = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        ventanaModificar.setMinimumSize(new java.awt.Dimension(400, 550));
        ventanaModificar.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        ventanaModificar.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        txtIdCliente.setEnabled(false);
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoblacionActionPerformed(evt);
            }
        });

        txtProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnGuardarModificacion.setText("Guardar");
        btnGuardarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionActionPerformed(evt);
            }
        });

        btnCancelarModificacion.setText("Cancelar");
        btnCancelarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModificacionActionPerformed(evt);
            }
        });

        lblNombre4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre4.setText("Poblacion:");

        lblNombre5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre5.setText("E-Mail:");

        lblApellidos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidos1.setText("Apellidos:");

        lblNombre6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre6.setText("Provincia:");

        lblCalle2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalle2.setText("Telefono:");

        lblCalle3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalle3.setText("Direccion:");

        lblNombre7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre7.setText("Nombre:");

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Ficha Cliente");

        lblIdCliente1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdCliente1.setText("ID Cliente: ");

        javax.swing.GroupLayout ventanaModificarLayout = new javax.swing.GroupLayout(ventanaModificar.getContentPane());
        ventanaModificar.getContentPane().setLayout(ventanaModificarLayout);
        ventanaModificarLayout.setHorizontalGroup(
            ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaModificarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnGuardarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(ventanaModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaModificarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblNombre6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblApellidos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblNombre7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblIdCliente1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblNombre4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblCalle3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblCalle2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaModificarLayout.createSequentialGroup()
                                .addComponent(lblNombre5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        ventanaModificarLayout.setVerticalGroup(
            ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaModificarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo1)
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre7))
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos1)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalle3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre4))
                .addGap(21, 21, 21)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre6)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalle2)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnCancelarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        ventanaNuevo.setMinimumSize(new java.awt.Dimension(400, 550));
        ventanaNuevo.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        ventanaNuevo.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        txtIdClienteNuevo.setEnabled(false);
        txtIdClienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteNuevoActionPerformed(evt);
            }
        });

        txtNombreClienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteNuevoActionPerformed(evt);
            }
        });

        txtApellidosNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosNuevoActionPerformed(evt);
            }
        });

        txtDireccionNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionNuevoActionPerformed(evt);
            }
        });

        txtPoblacionNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoblacionNuevoActionPerformed(evt);
            }
        });

        txtProvinciaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaNuevoActionPerformed(evt);
            }
        });

        txtTelefonoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoNuevoActionPerformed(evt);
            }
        });

        txtEmailNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailNuevoActionPerformed(evt);
            }
        });

        btnGuardarNuevo.setText("Guardar");
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });

        btnCancelarNuevo.setText("Cancelar");
        btnCancelarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoActionPerformed(evt);
            }
        });

        lblNombre8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre8.setText("Poblacion:");

        lblNombre9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre9.setText("E-Mail:");

        lblApellidos2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidos2.setText("Apellidos:");

        lblNombre10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre10.setText("Provincia:");

        lblCalle4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalle4.setText("Telefono:");

        lblCalle5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalle5.setText("Direccion:");

        lblNombre11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre11.setText("Nombre:");

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Ficha Cliente");

        lblIdCliente2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdCliente2.setText("ID Cliente: ");

        javax.swing.GroupLayout ventanaNuevoLayout = new javax.swing.GroupLayout(ventanaNuevo.getContentPane());
        ventanaNuevo.getContentPane().setLayout(ventanaNuevoLayout);
        ventanaNuevoLayout.setHorizontalGroup(
            ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaNuevoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnGuardarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(ventanaNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaNuevoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblNombre10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProvinciaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator5)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblApellidos2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidosNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblNombre11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreClienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblIdCliente2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(txtIdClienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblNombre8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPoblacionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblCalle5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblCalle4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefonoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaNuevoLayout.createSequentialGroup()
                                .addComponent(lblNombre9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        ventanaNuevoLayout.setVerticalGroup(
            ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaNuevoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo2)
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente2)
                    .addComponent(txtIdClienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreClienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre11))
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos2)
                    .addComponent(txtApellidosNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalle5)
                    .addComponent(txtDireccionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPoblacionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre8))
                .addGap(21, 21, 21)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre10)
                    .addComponent(txtProvinciaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalle4)
                    .addComponent(txtTelefonoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre9)
                    .addComponent(txtEmailNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(ventanaNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnCancelarNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblGestionClientes.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblGestionClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionClientes.setText("Gestión de Clientes");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCliente", "Nombre", "Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBorrarCli.setText("Borrar Cliente");
        btnBorrarCli.setEnabled(false);
        btnBorrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCliActionPerformed(evt);
            }
        });

        btnModCli.setText("Modificar Cliente");
        btnModCli.setEnabled(false);
        btnModCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCliActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCancelar1.setText("Nuevo Cliente");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGestionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBorrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModCli, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblGestionClientes)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModCli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCliActionPerformed
        int idCliente = 0;
        try {
            con.conectar();
            int fila = tablaClientes.getSelectedRow();
            int id = (int) tablaClientes.getValueAt(fila, 0);
            idCliente = id;

            PreparedStatement ps = con.conect.prepareStatement("delete from clientes where idCliente=?");
            ps.setInt(1, id);
            ps.executeUpdate();

            con.cerrar();

        } catch (SQLException e) {

        }
        borrarTransaccionesCliente(idCliente);

        actualizar();
        btnBorrarCli.setEnabled(false);
        btnModCli.setEnabled(false);
    }//GEN-LAST:event_btnBorrarCliActionPerformed

    private void btnModCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCliActionPerformed
        int fila = tablaClientes.getSelectedRow();
        int id = (int) tablaClientes.getValueAt(fila, 0);

        modificarCliente(id);

        ventanaModificar.setLocationRelativeTo(this);
        ventanaModificar.setVisible(true);
    }//GEN-LAST:event_btnModCliActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        btnBorrarCli.setEnabled(true);
        btnModCli.setEnabled(true);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        ventanaNuevo.setLocationRelativeTo(this);
        ventanaNuevo.setVisible(true);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionActionPerformed
        try {
            int codCliente = Integer.parseInt(txtIdCliente.getText());
            String nombre = txtNombreCliente.getText();
            String apellidos = txtApellidos.getText();
            String direccion = txtDireccion.getText();
            String poblacion = txtPoblacion.getText();
            String provincia = txtProvincia.getText();
            String telefono = txtTelefono.getText();
            String email = txtEmail.getText();

            con.conectar();

            PreparedStatement ps = con.conect.prepareStatement("update clientes set NombreCliente=?,ApellidosCliente=?,Direccion=?,Poblacion=?,Provincia=?,Telefono=?,EMail=? where idCliente=?");
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, direccion);
            ps.setString(4, poblacion);
            ps.setString(5, provincia);
            ps.setString(6, telefono);
            ps.setString(7, email);
            ps.setInt(8, codCliente);
            ps.executeUpdate();

            con.cerrar();

            btnBorrarCli.setEnabled(false);
            btnModCli.setEnabled(false);
            actualizar();
            ventanaModificar.setVisible(false);

        } catch (SQLException excSQL) {

        }
    }//GEN-LAST:event_btnGuardarModificacionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoblacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoblacionActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinciaActionPerformed

    private void btnCancelarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModificacionActionPerformed
        ventanaModificar.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnCancelarModificacionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtIdClienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteNuevoActionPerformed

    private void txtNombreClienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteNuevoActionPerformed

    private void txtApellidosNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosNuevoActionPerformed

    private void txtDireccionNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionNuevoActionPerformed

    private void txtPoblacionNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoblacionNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoblacionNuevoActionPerformed

    private void txtProvinciaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinciaNuevoActionPerformed

    private void txtTelefonoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoNuevoActionPerformed

    private void txtEmailNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailNuevoActionPerformed

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        try {
            con.conectar();
            String nombre = txtNombreClienteNuevo.getText();
            String apellidos = txtApellidosNuevo.getText();
            String direccion = txtDireccionNuevo.getText();
            String poblacion = txtPoblacionNuevo.getText();
            String provincia = txtProvincia.getText();
            String telefono = txtTelefonoNuevo.getText();
            String email = txtEmailNuevo.getText();

            PreparedStatement ps = con.conect.prepareStatement("insert into clientes values (null,?,?,?,?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, direccion);
            ps.setString(4, poblacion);
            ps.setString(5, provincia);
            ps.setString(6, telefono);
            ps.setString(7, email);

            ps.executeUpdate();

            con.cerrar();

            actualizar();
            ventanaNuevo.setVisible(false);
            this.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("error al insertar");
        }
    }//GEN-LAST:event_btnGuardarNuevoActionPerformed

    private void btnCancelarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoActionPerformed
        ventanaNuevo.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnCancelarNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCli;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelarModificacion;
    private javax.swing.JButton btnCancelarNuevo;
    private javax.swing.JButton btnGuardarModificacion;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JButton btnModCli;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblApellidos1;
    private javax.swing.JLabel lblApellidos2;
    private javax.swing.JLabel lblCalle2;
    private javax.swing.JLabel lblCalle3;
    private javax.swing.JLabel lblCalle4;
    private javax.swing.JLabel lblCalle5;
    private javax.swing.JLabel lblGestionClientes;
    private javax.swing.JLabel lblIdCliente1;
    private javax.swing.JLabel lblIdCliente2;
    private javax.swing.JLabel lblNombre10;
    private javax.swing.JLabel lblNombre11;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel lblNombre9;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosNuevo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionNuevo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailNuevo;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdClienteNuevo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClienteNuevo;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtPoblacionNuevo;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtProvinciaNuevo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoNuevo;
    private javax.swing.JDialog ventanaModificar;
    private javax.swing.JDialog ventanaNuevo;
    // End of variables declaration//GEN-END:variables

    private void actualizar() {

        try {
            DefaultTableModel model = (DefaultTableModel) tablaClientes.getModel();
            con.conectar();
            Statement consulta;
            consulta = con.conect.createStatement();
            ResultSet rs = consulta.executeQuery("select *from clientes");

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            while (rs.next()) {
                Object[] datos = new Object[3];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);
            }
            con.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void modificarCliente(int idCliente) {

        try {
            con.conectar();
            PreparedStatement consulta;

            consulta = con.conect.prepareStatement("select * from clientes where idCliente=?");
            consulta.setInt(1, idCliente);
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                Object[] datos = new Object[8];
                datos[0] = rs.getInt(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] == null) {
                        datos[i] = "";
                    }
                }

                txtIdCliente.setText(datos[0].toString());
                txtNombreCliente.setText(datos[1].toString());
                txtApellidos.setText(datos[2].toString());
                txtDireccion.setText(datos[3].toString());
                txtPoblacion.setText(datos[4].toString());
                txtProvincia.setText(datos[5].toString());
                txtTelefono.setText(datos[6].toString());
                txtEmail.setText(datos[7].toString());

            }
            con.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(GestionClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void borrarTransaccionesCliente(int idCliente) {
        try {
            con.conectar();
            PreparedStatement ps = con.conect.prepareStatement("delete from transacciones where idCliente=?");
            ps.setInt(1, idCliente);
            ps.executeUpdate();
            con.cerrar();

        } catch (SQLException e) {

        }
    }
}
