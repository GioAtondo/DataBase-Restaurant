
package newpackage;
import java.io.Serializable;
/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ServicioDTO implements Serializable{
    private String Codigo_Servicio;
    private String Codigo_Reservacion;
    private String Importe;

    public String getCodigo_Servicio() {
        return Codigo_Servicio;
    }

    public void setCodigo_Servicio(String Codigo_Servicio) {
        this.Codigo_Servicio = Codigo_Servicio;
    }

    public String getCodigo_Reservacion() {
        return Codigo_Reservacion;
    }

    public void setCodigo_Reservacion(String Codigo_Reservacion) {
        this.Codigo_Reservacion = Codigo_Reservacion;
    }

    public String getImporte() {
        return Importe;
    }

    public void setImporte(String Importe) {
        this.Importe = Importe;
    }
}
