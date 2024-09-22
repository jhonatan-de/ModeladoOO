package modelo.personas;

/**
 *
 * @author JHONATAN
 */
public abstract class Empleado extends Persona {
    private String password;
    private String usuario;

    public Empleado(String nombre, String apellido1, String apellido2, String telefono, String direccion) {
        super(nombre, apellido1, apellido2, telefono, direccion);
    }

    public Empleado(String nombre, String apellido1, String telefono, String direccion) {
        super(nombre, apellido1, telefono, direccion);
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
