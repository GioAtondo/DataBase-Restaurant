
package newpackage;
import java.io.Serializable;
/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ComidaDTO implements Serializable{
    private String Codigo_comida;
    private String Nombre;
    private String Precio;
    private String Tipo;
    private String Descripcion;

    public String getCodigo_comida() {
        return Codigo_comida;
    }

    public void setCodigo_comida(String Codigo_comida) {
        this.Codigo_comida = Codigo_comida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
