package newpackage;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ConsumoDAO extends Conexion {

    private static final String CODIGO_CONSUMO = "Codigo_consumo";
    private static final String CODIGO_SERVICIO = "Codigo_servicio";
    private static final String CODIGO_COMIDA = "Codigo_comida";
    private static final String CANTIDAD = "Cantidad";
    private static final String SQL_SELECT_ALL = "SELECT * FROM CONSUMO";
    private static final String SQL_INSERT = "INSERT INTO CONSUMO"
            + "(" + CODIGO_SERVICIO
            + "," + CODIGO_COMIDA
            + "," + CANTIDAD
            + ")VALUES (?,?,?)";
    private static final String SQL_READ = "SELECT * FROM CONSUMO WHERE"
            + CODIGO_CONSUMO + " = ?";
    private static final String SQL_DELETE = "DELETE FROM CONSUMO WHERE"
            + CODIGO_CONSUMO + " = ?";
    private static final String SQL_UPDATE = "UPDATE COMIDA SET"
            + CODIGO_SERVICIO + " = ?"
            + CODIGO_COMIDA + " = ?"
            + CANTIDAD + " = ?"
            + "WHERE " + CODIGO_CONSUMO + " = ?";
    private static final String SQL_COUNT = "SELECT COUNT(*) FROM CONSUMO";

    public ConsumoDAO() {
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

    public void append(ConsumoDTO dto) throws Exception {
        PreparedStatement ps = null;
        //Objeto sobre el cual se almacena la consulta SQL previamente creada
        ps = con.prepareStatement(SQL_INSERT);
        //ps.setString sustituye cada uno de los simbolos de interrogacion que se encuentran en la sentencia SQL, por los
        //valores deseados. A cada simbolo de interrogacion le corresponde una posicion.
        ps.setString(1, dto.getCodigo_servicio());
        ps.setString(2, dto.getCodigo_comida());
        ps.setString(3, dto.getCantidad());
        //Ejecuta la actualizacion
        ps.executeUpdate();
        cerrar(ps);
    }

    public void update(ConsumoDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_UPDATE);
        ps.setString(1, dto.getCodigo_consumo());
        ps.setString(2, dto.getCodigo_servicio());
        ps.setString(3, dto.getCodigo_comida());
        ps.setString(4, dto.getCantidad());
        ps.executeUpdate();
        cerrar(ps);
    }

    public void delete(ConsumoDTO dto) throws Exception {
        PreparedStatement ps = null;
        ps = con.prepareStatement(SQL_DELETE);
        ps.setString(1, dto.getCodigo_consumo());
        ps.executeUpdate();
        cerrar(ps);
    }

    public ConsumoDTO read(int dto) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConsumoDTO result = null;
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

    private ConsumoDTO getObject(ResultSet rs) throws Exception {
        ConsumoDTO dtoconsumo = new ConsumoDTO();
        dtoconsumo.setCodigo_consumo(rs.getString(CODIGO_CONSUMO));
        dtoconsumo.setCodigo_servicio(rs.getString(CODIGO_SERVICIO));
        dtoconsumo.setCodigo_comida(rs.getString(CODIGO_COMIDA));
        dtoconsumo.setCantidad(rs.getString(CANTIDAD));
        return dtoconsumo;
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

    public ArrayList<ConsumoDTO> getAll() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<ConsumoDTO> result = new ArrayList();
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
