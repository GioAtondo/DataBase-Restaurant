package newpackage;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class MesaDAO extends Conexion {

    private static final String CODIGO_MESA = "Codigo_mesa";
    private static final String LOCALIZACION = "Localizacion";
    private static final String SQL_SELECT_ALL = "SELECT * FROM MESA";
    private static final String SQL_INSERT = "INSERT INTO MESA"
            + "(" + LOCALIZACION
            + ")VALUES (?)";
    private static final String SQL_READ = "SELECT * FROM MESA WHERE "
            + CODIGO_MESA + " = ?";
    private static final String SQL_DELETE = "DELETE FROM MESA WHERE "
            + CODIGO_MESA + " = ?";
    private static final String SQL_UPDATE = "UPDATE MESA SET "
            + LOCALIZACION + " = ?"
            + " WHERE " + CODIGO_MESA + " = ?";
    private static final String SQL_COUNT = "SELECT COUNT(*) FROM MESA";

    public MesaDAO() {
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

    public void append(MesaDTO dto) throws Exception {
        PreparedStatement ps = null;
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        ps = con.prepareStatement(SQL_INSERT);
        //ps.setString sustituye cada uno de los simbolos de interrogacion que se encuentran en la sentencia SQL, por los
        //valores deseados. A cada simbolo de interrogacion le corresponde una posicion.
        ps.setString(1, dto.getLocalizacion());
        //Ejecuta la actualizacion
        ps.executeUpdate();
        cerrar(ps);
    }

    public void update(MesaDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getLocalizacion());
        ps.setString(2, dto.getCodigo_mesa());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(MesaDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_DELETE);
        ps.setString(1, dto.getCodigo_mesa());
        ps.executeUpdate();
        cerrar(ps);
    }

    public MesaDTO read(int dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        MesaDTO result = null;
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

    private MesaDTO getObject(ResultSet rs) throws Exception {
        MesaDTO dtomesa = new MesaDTO();
        dtomesa.setCodigo_mesa(rs.getString(CODIGO_MESA));
        dtomesa.setLocalizacion(rs.getString(LOCALIZACION));
        return dtomesa;
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

    public ArrayList<MesaDTO> getAll() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<MesaDTO> result = new ArrayList();
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
