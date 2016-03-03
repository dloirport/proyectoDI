
import java.awt.Color;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class sumaPuntos extends javax.swing.JFrame {

    /**
     * Creates new form sumaPuntos
     */
    ConectorBaseDatos conector = new ConectorBaseDatos();
    String nombre = "";
    String apellidos = "";
    int puntos = 0;

    public sumaPuntos(int codCli) {
        initComponents();
        rellenarDatos(codCli);
        actualizarRegalos();
        btnCanjearRegalo.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelDatosClientes = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelPuntosAcumulados = new javax.swing.JPanel();
        lblPuntos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelTransacciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();
        cmbConcepto = new javax.swing.JComboBox();
        sumarPuntos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegalosDisponibles = new javax.swing.JTable();
        btnCanjearRegalo = new javax.swing.JButton();
        btnImprimirInforme = new javax.swing.JButton();

        setTitle("Gestion de puntos cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gesti�n de Puntos");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Juanito Perez");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setText("012354212412");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ID Cliente:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Regalos Disponibles:");

        panelPuntosAcumulados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4));

        lblPuntos.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(0, 204, 51));
        lblPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos.setText("1450");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Puntos disponibles:");

        javax.swing.GroupLayout panelPuntosAcumuladosLayout = new javax.swing.GroupLayout(panelPuntosAcumulados);
        panelPuntosAcumulados.setLayout(panelPuntosAcumuladosLayout);
        panelPuntosAcumuladosLayout.setHorizontalGroup(
            panelPuntosAcumuladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
            .addComponent(lblPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPuntosAcumuladosLayout.setVerticalGroup(
            panelPuntosAcumuladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPuntosAcumuladosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblPuntos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDatosClientesLayout = new javax.swing.GroupLayout(panelDatosClientes);
        panelDatosClientes.setLayout(panelDatosClientesLayout);
        panelDatosClientesLayout.setHorizontalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPuntosAcumulados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDatosClientesLayout.setVerticalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblID)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre))
                    .addComponent(panelPuntosAcumulados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Concepto: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Puntos:");

        cmbConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puntos por compra", "Promocion especial" }));

        javax.swing.GroupLayout panelTransaccionesLayout = new javax.swing.GroupLayout(panelTransacciones);
        panelTransacciones.setLayout(panelTransaccionesLayout);
        panelTransaccionesLayout.setHorizontalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cmbConcepto, 0, 178, Short.MAX_VALUE))
                    .addGroup(panelTransaccionesLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelTransaccionesLayout.setVerticalGroup(
            panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransaccionesLayout.createSequentialGroup()
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 37, Short.MAX_VALUE)
                .addGroup(panelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)))
        );

        sumarPuntos.setBackground(new java.awt.Color(0, 0, 0));
        sumarPuntos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sumarPuntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/suma.png"))); // NOI18N
        sumarPuntos.setActionCommand("");
        sumarPuntos.setBorder(null);
        sumarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarPuntosActionPerformed(evt);
            }
        });

        tablaRegalosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Regalo", "Descripcion", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRegalosDisponibles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaRegalosDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRegalosDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaRegalosDisponibles);

        btnCanjearRegalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regalo.png"))); // NOI18N
        btnCanjearRegalo.setText("Canjear Puntos");
        btnCanjearRegalo.setEnabled(false);
        btnCanjearRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanjearRegaloActionPerformed(evt);
            }
        });

        btnImprimirInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informes.png"))); // NOI18N
        btnImprimirInforme.setText("Historico");
        btnImprimirInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCanjearRegalo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimirInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panelTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sumarPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCanjearRegalo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimirInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumarPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCanjearRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanjearRegaloActionPerformed
        try{
            conector.conectar();
            
            int fila = tablaRegalosDisponibles.getSelectedRow();
            
            int idRegalo = (int) tablaRegalosDisponibles.getValueAt(fila, 0);
            String descripcion = (String) tablaRegalosDisponibles.getValueAt(fila, 1);
            int coste = (int) tablaRegalosDisponibles.getValueAt(fila, 2);
            
            int idCliente = Integer.parseInt(lblID.getText());
            
            String fecha = obtenerFecha();         
            
            PreparedStatement ps = conector.conect.prepareStatement("insert into transacciones values (null,?,?,?,?)");
            ps.setInt(1, idCliente);
            ps.setInt(2, coste*-1);
            ps.setString(3,descripcion);
            ps.setString(4, fecha);
            ps.executeUpdate();
            conector.cerrar();
            
            calcularPuntos(idCliente);
            actualizarRegalos();          
            
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
            //System.out.println("error al insertar");
        } catch (NumberFormatException e) {
           // System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnCanjearRegaloActionPerformed

    private void sumarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarPuntosActionPerformed
       try{
            conector.conectar();
            int valor = Integer.parseInt(txtPuntos.getText());
            String concepto = (String) cmbConcepto.getSelectedItem();
            int idCliente = Integer.parseInt(lblID.getText());
            String fecha = obtenerFecha();
            
           //System.out.println(concepto);

            PreparedStatement ps = conector.conect.prepareStatement("insert into transacciones values (null,?,?,?,?)");
            ps.setInt(1, idCliente);
            ps.setInt(2, valor);
            ps.setString(3,concepto);
            ps.setString(4, fecha);
            ps.executeUpdate();
            
            conector.cerrar();
            
            calcularPuntos(idCliente);
            actualizarRegalos();
            txtPuntos.setText("");
            btnCanjearRegalo.setEnabled(false);
            txtPuntos.setBackground(Color.white);
 

            
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
            //System.out.println("error al insertar");
        } catch (NumberFormatException e) {
            txtPuntos.setBackground(Color.red);
            txtPuntos.setText("");
        }
    }//GEN-LAST:event_sumarPuntosActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnImprimirInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirInformeActionPerformed
        int idCliente=Integer.parseInt(lblID.getText());
        //CrearDirectortio
        File carpeta = new File("C:/Reportes");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        
        try {
            GeneracionReportes p = new GeneracionReportes();

            p.ITextHelloWorld(idCliente);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnImprimirInformeActionPerformed

    private void tablaRegalosDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegalosDisponiblesMouseClicked
        btnCanjearRegalo.setEnabled(true);
    }//GEN-LAST:event_tablaRegalosDisponiblesMouseClicked

    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanjearRegalo;
    private javax.swing.JButton btnImprimirInforme;
    private javax.swing.JComboBox cmbConcepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JPanel panelDatosClientes;
    private javax.swing.JPanel panelPuntosAcumulados;
    private javax.swing.JPanel panelTransacciones;
    private javax.swing.JButton sumarPuntos;
    private javax.swing.JTable tablaRegalosDisponibles;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables

    private void rellenarDatos(int codigoCliente) {

        try {

            conector.conectar();
            PreparedStatement consulta;

            consulta = conector.conect.prepareStatement("select NombreCliente,ApellidosCliente from clientes where idCliente=?");
            consulta.setInt(1, codigoCliente);
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                nombre = rs.getString(1);
                apellidos = rs.getString(2);
            }

            lblNombre.setText(nombre + " " + apellidos);
            lblID.setText(codigoCliente + "");

            conector.cerrar();

            calcularPuntos(codigoCliente);

        } catch (SQLException ex) {
           // System.out.println("Error base datos");
        }

    }

    /*
    *** M�todo que se encarga de calcular los puntos de un cliente
     */
    private void calcularPuntos(int codigoCliente) {
        try {
            conector.conectar();
            PreparedStatement consulta;

            consulta = conector.conect.prepareStatement("select sum(valor) as puntos from transacciones where idCliente=? group by idCliente");
            consulta.setInt(1, codigoCliente);

            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                puntos = rs.getInt(1);
            }

            lblPuntos.setText(puntos + "");

            conector.cerrar();

        } catch (SQLException e) {
            //System.out.println("Error calcular puntos");
        }

    }
    
    private String obtenerFecha() {

        Calendar fecha = new GregorianCalendar();

        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        String fechaHoy = dia + "/" + (mes + 1) + "/" + ano;

        return fechaHoy;
    }
    

    /*
    *** M�todo que actualiza la lista de regalos disponibles para el cliente
     */
    private void actualizarRegalos() {

        try {
            DefaultTableModel model = (DefaultTableModel) tablaRegalosDisponibles.getModel();
            conector.conectar();
            Statement consulta;
            consulta = conector.conect.createStatement();
            ResultSet rs = consulta.executeQuery("select * from regalos where costeRegalo<=" + puntos);

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

                while (rs.next()) {
                    Object[] datos = new Object[3];
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    model.addRow(datos);
                btnCanjearRegalo.setEnabled(true);
                }
            
            
            conector.cerrar();

        } catch (SQLException ex) {

        }

    }
}
