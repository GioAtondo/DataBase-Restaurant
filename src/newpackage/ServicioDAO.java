package newpackage;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ServicioDAO extends Conexion {

    private static final String CODIGO_SERVICIO = "Codigo_servicio";
    private static final String CODIGO_RESERVACION = "Codigo_reservacion";
    private static final String IMPORTE = "Importe";
    private static final String SQL_SELECT_ALL = "SELECT * FROM SERVICIO";
    private static final String SQL_INSERT = "INSERT INTO SERVICIO"
            + "(" + CODIGO_RESERVACION
            + ")VALUES (?)";
    private static final String SQL_READ = "SELECT * FROM SERVICIO WHERE "
            + CODIGO_SERVICIO + " = ?";
    private static final String SQL_DELETE = "DELETE FROM SERVICIO WHERE "
            + CODIGO_SERVICIO + " = ?";
    private static final String SQL_UPDATE = "UPDATE SERVICIO SET "
            + CODIGO_RESERVACION + " = ?,"
            + IMPORTE + " = ?"
            + " WHERE " + CODIGO_SERVICIO + " = ?";
    private static final String SQL_COUNT = "SELECT COUNT(*) FROM SERVICIO";

    public ServicioDAO() {
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

    public void append(ServicioDTO dto) throws Exception {
        PreparedStatement ps = null;
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        ps = con.prepareStatement(SQL_INSERT);
        //ps.setString sustituye cada uno de los simbolos de interrogacion que se encuentran en la sentencia SQL, por los
        //valores deseados. A cada simbolo de interrogacion le corresponde una posicion.
        ps.setString(1, dto.getCodigo_Reservacion());
        //Ejecuta la actualizacion
        ps.executeUpdate();
        cerrar(ps);
    }

    public void update(ServicioDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getCodigo_Servicio());
        ps.setString(2, dto.getCodigo_Reservacion());
        ps.setString(3, dto.getImporte());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(ServicioDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_DELETE);
        ps.setString(1, dto.getCodigo_Servicio());
        ps.executeUpdate();
        cerrar(ps);
    }

    public ServicioDTO read(int dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ServicioDTO result = null;
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

    private ServicioDTO getObject(ResultSet rs) throws Exception {
        ServicioDTO dtoservicio = new ServicioDTO();
        dtoservicio.setCodigo_Servicio(rs.getString(CODIGO_SERVICIO));
        dtoservicio.setCodigo_Reservacion(rs.getString(CODIGO_RESERVACION));
        dtoservicio.setImporte(rs.getString(IMPORTE));
        return dtoservicio;
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

    public ArrayList<ServicioDTO> getAll() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ServicioDTO> result = new ArrayList();
        ps = con.prepareStatement(SQL_SELECT_ALL);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

}
