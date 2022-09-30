
package newpackage;
import java.io.Serializable;
/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class MesaDTO implements Serializable{
    private String Codigo_mesa;
    private String Localizacion;

    public String getCodigo_mesa() {
        return Codigo_mesa;
    }

    public void setCodigo_mesa(String Codigo_mesa) {
        this.Codigo_mesa = Codigo_mesa;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }
    
    
}
