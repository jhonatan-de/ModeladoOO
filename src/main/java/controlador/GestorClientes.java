package controlador;

/**
 *
 * @author JHONATAN
 */
import java.util.ArrayList;
import java.util.List;
import modelo.personas.Cliente;

public class GestorClientes {
    private List<Cliente> listaClientes;

    public GestorClientes() {
        this.listaClientes = new ArrayList<>();
    }

    public void agregarCliente(String nombre, String apellido1, String apellido2, String telefono, String direccion) {
        Cliente nuevoCliente = new Cliente(nombre, apellido1, apellido2, telefono,  direccion);
        listaClientes.add(nuevoCliente);
        System.out.println("Cliente agregado: " + nuevoCliente);
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado.");
        return null;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
}
