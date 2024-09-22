package controlador;

/**
 *
 * @author JHONATAN
 */
import java.util.ArrayList;
import java.util.List;
import modelo.maquinas.Maquina;
import modelo.personas.Cliente;
import modelo.personas.Mecanico;
import modelo.servicios.Servicio;

public class GestorMantenimiento {

    private List<Servicio> trabajosMantenimiento;

    public GestorMantenimiento() {
        this.trabajosMantenimiento = new ArrayList<>();
    }

    public void realizarMantenimiento(Cliente cliente, Mecanico mecanico, Maquina maquina) {
        Servicio servicio = new Servicio(cliente, mecanico, maquina);
        String trabajo = "Mantenimiento " + servicio.getDescripcion() + " realizado en " + servicio.getMaquina().getModelo();
        trabajosMantenimiento.add(servicio);
        System.out.println(trabajo);
    }

    public List<Servicio> getTrabajosMantenimiento() {
        return trabajosMantenimiento;
    }

}
