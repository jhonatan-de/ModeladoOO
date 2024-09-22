package modelo.ventas;

/**
 *
 * @author JHONATAN
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.personas.Cliente;

public class Venta {

    private Cliente cliente;
    private List<DetalleVenta> detalles;
    private LocalDate fecha;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.fecha = LocalDate.now();; // Fecha actual
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double calcularTotalVenta() {
        double total = 0;
        for (DetalleVenta detalle : detalles) {
            total += detalle.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append(cliente.getNombre()).append("\n");
        sb.append("Detalles de la venta:\n");
        for (DetalleVenta detalle : detalles) {
            sb.append(detalle.toString()).append("\n");
        }
        sb.append("Total de la venta: ").append(calcularTotalVenta());
        return sb.toString();
    }
}
