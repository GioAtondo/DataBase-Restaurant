
package newpackage;
import java.io.Serializable;

/**
 *
 * @author Giovanni Alberto Salas Atondo
 */
public class ClienteDTO implements Serializable{
    private String Codigo_cliente;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    
    public String getCodigoCliente(){
        return Codigo_cliente;
    }
    
    public void setCodigoCliente(String Codigo_cliente){
        this.Codigo_cliente = Codigo_cliente;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    public String getTelefono(){
        return Telefono;
    }
    
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
}
