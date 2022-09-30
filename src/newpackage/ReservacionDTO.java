
package newpackage;
import java.io.Serializable;
/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ReservacionDTO implements Serializable{
    private String Codigo_Reservacion;
    private String Codigo_Mesa;
    private String Codigo_Cliente;
    private String Fecha;

    public String getCodigo_Reservacion() {
        return Codigo_Reservacion;
    }

    public void setCodigo_Reservacion(String Codigo_Reservacion) {
        this.Codigo_Reservacion = Codigo_Reservacion;
    }

    public String getCodigo_Mesa() {
        return Codigo_Mesa;
    }

    public void setCodigo_Mesa(String Codigo_Mesa) {
        this.Codigo_Mesa = Codigo_Mesa;
    }

    public String getCodigo_Cliente() {
        return Codigo_Cliente;
    }

    public void setCodigo_Cliente(String Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
