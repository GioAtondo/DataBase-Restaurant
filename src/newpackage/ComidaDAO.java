package newpackage;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ComidaDAO extends Conexion {

    private static final String CODIGO_COMIDA = "Codigo_comida";
    private static final String NOMBRE = "Nombre";
    private static final String PRECIO = "Precio";
    private static final String TIPO = "Tipo";
    private static final String DESCRIPCION = "Descripcion";
    private static final String SQL_SELECT_ALL = "SELECT * FROM COMIDA";
    private static final String SQL_INSERT = "INSERT INTO COMIDA"
            + "(" + NOMBRE
            + "," + PRECIO
            + "," + TIPO
            + "," + DESCRIPCION
            + ")VALUES (?,?,?,?)";
    private static final String SQL_READ = "SELECT * FROM COMIDA WHERE "
            + CODIGO_COMIDA + " = ?";
    private static final String SQL_DELETE = "DELETE FROM COMIDA WHERE "
            + CODIGO_COMIDA + " = ?";
    private static final String SQL_UPDATE = "UPDATE COMIDA SET "
            + NOMBRE + " = ?,"
            + PRECIO + " = ?,"
            + TIPO + " = ?,"
            + DESCRIPCION + " = ?"
            + " WHERE " + CODIGO_COMIDA + " = ?";
    private static final String SQL_COUNT = "SELECT COUNT(*) FROM COMIDA";

    public ComidaDAO() {
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

    public void append(ComidaDTO dto) throws Exception {
        PreparedStatement ps = null;
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        ps = con.prepareStatement(SQL_INSERT);
        //ps.setString sustituye cada uno de los simbolos de interrogacion que se encuentran en la sentencia SQL, por los
        //valores deseados. A cada simbolo de interrogacion le corresponde una posicion.
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getPrecio());
        ps.setString(3, dto.getTipo());
        ps.setString(4, dto.getDescripcion());
        //Ejecuta la actualizacion
        ps.executeUpdate();
        cerrar(ps);
    }

    public void update(ComidaDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getNombre());
        ps.setString(2, dto.getPrecio());
        ps.setString(3, dto.getTipo());
        ps.setString(4, dto.getDescripcion());
        ps.setString(5, dto.getCodigo_comida());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(ComidaDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_DELETE);
        ps.setString(1, dto.getCodigo_comida());
        ps.executeUpdate();
        cerrar(ps);
    }

    public ComidaDTO read(int dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ComidaDTO result = null;
        ps = con.prepareStatement(SQL_READ);
        ps.setString(1, dto + "");
        rs = ps.executeQuery();
        if (rs.next()) {
            result = getObject(rs);
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    public ArrayList<ComidaDTO> getAll() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ComidaDTO> result = new ArrayList();
        ps = con.prepareStatement(SQL_SELECT_ALL);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    public String getCount() throws Exception {
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

    private ComidaDTO getObject(ResultSet rs) throws Exception {
        ComidaDTO dtocomida = new ComidaDTO();
        dtocomida.setCodigo_comida(rs.getString(CODIGO_COMIDA));
        dtocomida.setNombre(rs.getString(NOMBRE));
        dtocomida.setPrecio(rs.getString(PRECIO));
        dtocomida.setTipo(rs.getString(TIPO));
        dtocomida.setDescripcion(rs.getString(DESCRIPCION));
        return dtocomida;
    }
}
