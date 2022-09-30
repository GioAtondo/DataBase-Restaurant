
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class Conexion {
    InterfazConexion interfaz = new InterfazConexion();
    protected Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="1234";
    private static final String url="jdbc:mysql://localhost:3306/proyecto_55492_58360?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public Conexion(){
        con=null;
        try{
            Class.forName(driver);
            //Nos conectamos a la base de datos
            con= DriverManager.getConnection(url,user,pass);
            //Si la coneccion fue exitosa mostramos un mensaje de conexion exitosa
            if(con!=null){
               final JPanel panel = new JPanel();
               //JOptionPane.showMessageDialog(panel, "Conexion Establecida", " ",JOptionPane.INFORMATION_MESSAGE);
                //System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "No se pudo conectar", " ",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    protected void cerrar(PreparedStatement ps) throws Exception {
        if(ps != null){
            ps.close();
        }
    }
    
     protected void cerrar(ResultSet rs) throws Exception {
        if(rs != null){
            rs.close();
        }
    }
}
