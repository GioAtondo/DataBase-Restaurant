package newpackage;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ClienteDAO extends Conexion {

    private static final String CODIGO_CLIENTE = "Codigo_cliente";
    private static final String NOMBRE = "Nombre";
    private static final String DIRECCION = "Direccion";
    private static final String TELEFONO = "Telefono";
    private static final String SQL_SELECT_ALL = "SELECT * FROM CLIENTE";
    private static final String SQL_INSERT = "INSERT INTO CLIENTE"
            + "(" + NOMBRE
            + "," + DIRECCION
            + "," + TELEFONO
            + ")VALUES (?,?,?)";
    private static final String SQL_READ = "SELECT * FROM CLIENTE WHERE "
            + CODIGO_CLIENTE + " = ?";
    private static final String SQL_DELETE = "DELETE FROM CLIENTE WHERE "
            + CODIGO_CLIENTE + " = ?";
    private static final String SQL_UPDATE = "UPDATE CLIENTE SET "
            + NOMBRE + " = ? ,"
            + DIRECCION + " = ? ,"
            + TELEFONO + " = ? "
            + " WHERE " + CODIGO_CLIENTE + " = ? ";
    private static final String SQL_COUNT = "SELECT COUNT(*) FROM CLIENTE";

    public ClienteDAO() {
        super();
    }

    public List readAll() throws Exception {
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        PreparedStatement ps = null;
        //Encargado de almacenar el resultado de la consulta a la base de datos
        ResultSet rs = null;
        List result = new ArrayList();
        //Coloca la sentencia sql en el PreparedStatement
        ps = con.prepareStatement(SQL_SELECT_ALL);
        //Ejecuta la consulta en la base de datos, y almacena el resultado en el ResuSet
        rs = ps.executeQuery();
        while (rs.next()) {
            //Obtiene uno a uno los objetos del rs para almacenarlos en la lista que sera regresada
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    public void append(ClienteDTO dto) throws Exception {
        PreparedStatement ps = null;
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        ps = con.prepareStatement(SQL_INSERT);
        //ps.setString sustituye cada uno de los simbolos de interrogacion que se encuentran en la sentencia SQL, por los
        //valores deseados. A cada simbolo de interrogacion le corresponde una posicion.
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getDireccion());
        ps.setString(3, dto.getTelefono());
        //Ejecuta la actualizacion
        ps.executeUpdate();

        cerrar(ps);
    }

    public void update(ClienteDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getDireccion());
        ps.setString(3, dto.getTelefono());
        ps.setString(4, dto.getCodigoCliente());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(ClienteDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_DELETE);
        ps.setString(1, dto.getCodigoCliente());
        ps.executeUpdate();
        cerrar(ps);
    }

    public ClienteDTO read(int dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ClienteDTO result = null;
        ps = con.prepareStatement(SQL_READ);
        ps.setString(1, dto+"");
        rs = ps.executeQuery();
        if (rs.next()) {
            result = getObject(rs);
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    public ArrayList<ClienteDTO> getAll() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ClienteDTO> result = new ArrayList();
        ps = con.prepareStatement(SQL_SELECT_ALL);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }
    
    public String getCount() throws Exception{
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = null;
        ps = con.prepareStatement(SQL_COUNT);
        if (rs.next()) {
            result = rs.getString(1);
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    private ClienteDTO getObject(ResultSet rs) throws Exception {
        ClienteDTO dtocliente = new ClienteDTO();
        dtocliente.setCodigoCliente(rs.getString(CODIGO_CLIENTE));
        dtocliente.setNombre(rs.getString(NOMBRE));
        dtocliente.setDireccion(rs.getString(DIRECCION));
        dtocliente.setTelefono(rs.getString(TELEFONO));
        return dtocliente;
    }
}
