package modelo.personas;

import java.util.ArrayList;
import java.util.List;
import modelo.servicios.Servicio;

/**
 *
 * @author JHONATAN
 */
public class Mecanico extends Empleado {
    private List<Servicio> serviciosAsignados;

    public Mecanico(String nombre, String apellido1, String apellido2, String telefono, String direccion) {
        super(nombre, apellido1, apellido2, telefono, direccion);
        serviciosAsignados = new ArrayList<>();
    }

    public Mecanico(String nombre, String apellido1, String telefono, String direccion) {
        super(nombre, apellido1, telefono, direccion);
        serviciosAsignados = new ArrayList<>();
    }

    public List<Servicio> getServiciosAsignados() {
        return serviciosAsignados;
    }

    
}
