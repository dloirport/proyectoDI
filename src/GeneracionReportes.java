
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class GeneracionReportes {

    ConectorBaseDatos con = new ConectorBaseDatos();

    public void ITextHelloWorld(int idCliente) throws Exception {
        Document documento = new Document();

        FileOutputStream ficheroPDF;

        try {
            ficheroPDF = new FileOutputStream("C:/reportes/" + idCliente + ".pdf");
            PdfWriter.getInstance(documento, ficheroPDF).setInitialLeading(20);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        try {
            documento.open();

            //Imagen Cabecera
            Image imagen = Image.getInstance("src/Imagenes/cabecera.jpg");
            documento.add(imagen);

            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));

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

                    //Primer parrafo
                    documento.add(new Paragraph("DATOS DEL CLIENTE"));
                    //Salto de linea
                    documento.add(new Paragraph(" "));
                    //Crear una tabla
                    PdfPTable tabla = new PdfPTable(4);
                    tabla.getDefaultCell().setFixedHeight(20.0f);

                    //FILA 1   
                    PdfPCell celdaID = new PdfPCell(new Paragraph("ID Cliente"));
                    celdaID.setColspan(2);
                    celdaID.setFixedHeight(20.0f);
                    tabla.addCell(celdaID);
                    PdfPCell celdaIDCli = new PdfPCell(new Paragraph(datos[0].toString()));
                    celdaIDCli.setColspan(2);
                    celdaIDCli.setFixedHeight(20.0f);
                    tabla.addCell(celdaIDCli);

                    //FILA 2
                    tabla.addCell("Nombre:");
                    tabla.addCell(datos[1].toString());

                    tabla.addCell("Apellidos:");
                    tabla.addCell(datos[2].toString());

                    //FILA 3
                    PdfPCell celdaDireccion = new PdfPCell(new Paragraph("Direccion:"));
                    celdaDireccion.setColspan(1);
                    celdaDireccion.setFixedHeight(20.0f);
                    tabla.addCell(celdaDireccion);

                    PdfPCell celdaDireccionCli = new PdfPCell(new Paragraph(datos[3].toString()));
                    celdaDireccionCli.setColspan(3);
                    celdaDireccionCli.setFixedHeight(20.0f);
                    tabla.addCell(celdaDireccionCli);

                    //FILA 4
                    tabla.addCell("Poblacion:");
                    tabla.addCell(datos[4].toString());

                    tabla.addCell("Provincia:");
                    tabla.addCell(datos[5].toString());

                    //FILA 5
                    tabla.addCell("Telefono:");
                    tabla.addCell(datos[6].toString());

                    tabla.addCell(new Phrase("Email:"));
                    tabla.addCell(datos[7].toString());

                    documento.add(tabla);

                }
                con.cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(GestionClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            //FIN DATOS CLIENTE
            //REGALOS DISPONIBLES
            try {
                int puntos = puntosDisponibles(idCliente);

                con.conectar();
                Statement consulta;
                consulta = con.conect.createStatement();
                ResultSet rs = consulta.executeQuery("select * from regalos where costeRegalo<=" + puntos);

                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("REGALOS DISPONIBLES: Tu saldo de puntos es de   " + puntos + "    a fecha     " + obtenerFecha()));
                documento.add(new Paragraph(" "));

                PdfPTable tabla = new PdfPTable(3);
                tabla.getDefaultCell().setFixedHeight(20.0f);
                //Cabecera de la tabla
                tabla.addCell("ID Regalo:");
                tabla.addCell("Descripcion");
                tabla.addCell("Coste");

                while (rs.next()) {
                    Object[] datos = new Object[3];
                    datos[0] = rs.getInt(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getInt(3);

                    for (int i = 0; i < datos.length; i++) {
                        tabla.addCell(datos[i].toString());
                    }

                }
                documento.add(tabla);

                con.cerrar();

            } catch (SQLException ex) {

            }

            //FIN REGALOS DISPONIBLES
            //HISTORICO DE TRANSACCIONES
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("HISTORICO DE MOVIMIENTOS"));
            documento.add(new Paragraph(" "));
            
            try {
                con.conectar();
                PreparedStatement consulta;

                consulta = con.conect.prepareStatement("select * from transacciones where idCliente=?");
                consulta.setInt(1, idCliente);
                ResultSet rs = consulta.executeQuery();

                PdfPTable tabla = new PdfPTable(3);
                tabla.getDefaultCell().setFixedHeight(20.0f);
                //Cabecera de la tabla
                tabla.addCell("Valor");
                tabla.addCell("Descripcion");
                tabla.addCell("Fecha");

                while (rs.next()) {
                    Object[] datos = new Object[3];
                    datos[0] = rs.getInt(3);
                    datos[1] = rs.getString(4);
                    datos[2] = rs.getString(5);

                    for (int i = 0; i < datos.length; i++) {
                        tabla.addCell(datos[i].toString());
                    }

                }
                documento.add(tabla);
                con.cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(GestionClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            documento.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private int puntosDisponibles(int codigoCliente) {
        int puntos = 0;
        try {

            con.conectar();
            PreparedStatement consulta;

            consulta = con.conect.prepareStatement("select sum(valor) as puntos from transacciones where idCliente=? group by idCliente");
            consulta.setInt(1, codigoCliente);

            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                puntos = rs.getInt(1);
            }

            con.cerrar();

            return puntos;

        } catch (SQLException e) {
            return puntos;
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
}
