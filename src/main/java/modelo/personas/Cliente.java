package modelo.personas;

/**
 *
 * @author JHONATAN
 */
public class Cliente extends Persona{
    private String rfc;
    private String email;

    public Cliente(String nombre, String apellido1, String apellido2, String telefono, String direccion) {
        super(nombre, apellido1, apellido2, telefono, direccion);
    }

    public Cliente(String nombre, String apellido1, String telefono, String direccion) {
        super(nombre, apellido1, telefono, direccion);
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
