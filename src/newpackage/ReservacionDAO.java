package newpackage;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ReservacionDAO extends Conexion {

    private static final String CODIGO_RESERVACION = "Codigo_Reservacion";
    private static final String CODIGO_MESA = "Codigo_Mesa";
    private static final String CODIGO_CLIENTE = "Codigo_Cliente";
    private static final String FECHA = "Fecha";
    private static final String SQL_SELECT_ALL = "SELECT * FROM RESERVACION";
    private static final String SQL_INSERT = "INSERT INTO RESERVACION"
            + "(" + CODIGO_MESA
            + "," + CODIGO_CLIENTE
            + "," + FECHA
            + ")VALUES (?,?,?)";
    private static final String SQL_READ = "SELECT * FROM RESERVACION WHERE "
            + CODIGO_RESERVACION + " = ?";
    private static final String SQL_DELETE = "DELETE FROM RESERVACION WHERE "
            + CODIGO_RESERVACION + " = ?";
    private static final String SQL_UPDATE = "UPDATE RESERVACION SET "
            + CODIGO_MESA + " = ?,"
            + CODIGO_CLIENTE + " = ?,"
            + FECHA + " = ?"
            + " WHERE " + CODIGO_RESERVACION + " = ?";
    private static final String SQL_COUNT = "SELECT COUNT(*) FROM CLIENTE";

    public ReservacionDAO() {
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

    public void append(ReservacionDTO dto) throws Exception {
        PreparedStatement ps = null;
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        ps = con.prepareStatement(SQL_INSERT);
        //ps.setString sustituye cada uno de los simbolos de interrogacion que se encuentran en la sentencia SQL, por los
        //valores deseados. A cada simbolo de interrogacion le corresponde una posicion.
        ps.setString(1, dto.getCodigo_Mesa());
        ps.setString(2, dto.getCodigo_Cliente());
        ps.setString(3, dto.getFecha());
        //Ejecuta la actualizacion
        ps.executeUpdate();
        cerrar(ps);
    }

    public void update(ReservacionDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getCodigo_Mesa());
        ps.setString(2, dto.getCodigo_Cliente());
        ps.setString(3, dto.getFecha());
        ps.setString(4, dto.getCodigo_Reservacion());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(ReservacionDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_DELETE);
        ps.setString(1, dto.getCodigo_Reservacion());
        ps.executeUpdate();
        cerrar(ps);
    }

    public ReservacionDTO read(int dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ReservacionDTO result = null;
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

    public ArrayList<ReservacionDTO> getAll() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ReservacionDTO> result = new ArrayList();
        ps = con.prepareStatement(SQL_SELECT_ALL);
        rs = ps.executeQuery();
        while (rs.next()) {
            result.add(getObject(rs));
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    public String timeDiff(String fecha1, String fecha2) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = null;
        ps = con.prepareStatement("SELECT ABS(HOUR(TIMEDIFF('" + fecha1 + "','" + fecha2 + "')))");
        rs = ps.executeQuery();
        if (rs.next()) {
            result = rs.getString(1);
        }
        cerrar(ps);
        cerrar(rs);
        return result;
    }

    public String selectHour(String Fecha) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = null;
        ps = con.prepareStatement("SELECT HOUR('" + Fecha + "')");
        rs = ps.executeQuery();
        if (rs.next()) {
            result = rs.getString(1);
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

    private ReservacionDTO getObject(ResultSet rs) throws Exception {
        ReservacionDTO dtoreservacion = new ReservacionDTO();
        dtoreservacion.setCodigo_Reservacion(rs.getString(CODIGO_RESERVACION));
        dtoreservacion.setCodigo_Mesa(rs.getString(CODIGO_MESA));
        dtoreservacion.setCodigo_Cliente(rs.getString(CODIGO_CLIENTE));
        dtoreservacion.setFecha(rs.getString(FECHA));
        return dtoreservacion;
    }
}
