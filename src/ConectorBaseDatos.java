
import java.sql.*;

public class ConectorBaseDatos {
    
    String url ="D:\\dloirport\\baseDatos.s3db";
    Connection conect;

    public ConectorBaseDatos() {
    }
    
    public void conectar(){
        try {
            conect = DriverManager.getConnection("jdbc:sqlite:"+url);
            if (conect != null) {
                System.out.println("Conectada a la base datos");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
        
    }
    
    public void cerrar(){
        try {
            conect.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar");
        }
    
    }
}
