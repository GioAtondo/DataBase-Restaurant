
package newpackage;
import java.io.Serializable;
/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ConsumoDTO implements Serializable{
    private String Codigo_consumo;
    private String Codigo_servicio;
    private String Codigo_comida;
    private String Cantidad;

    public String getCodigo_consumo() {
        return Codigo_consumo;
    }

    public void setCodigo_consumo(String Codigo_consumo) {
        this.Codigo_consumo = Codigo_consumo;
    }

    public String getCodigo_servicio() {
        return Codigo_servicio;
    }

    public void setCodigo_servicio(String Codigo_servicio) {
        this.Codigo_servicio = Codigo_servicio;
    }

    public String getCodigo_comida() {
        return Codigo_comida;
    }

    public void setCodigo_comida(String Codigo_comida) {
        this.Codigo_comida = Codigo_comida;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
}
