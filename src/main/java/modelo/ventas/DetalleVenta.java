package modelo.ventas;

import modelo.productos.Producto;

/**
 *
 * @author JHONATAN
 */
public class DetalleVenta {
    private Producto producto;
    private int cantidad;

    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }


    public double calcularTotal() {
        return cantidad * producto.getPrecioUnitario();
    }

    @Override
    public String toString() {
        return producto.getNombre() + " | Cantidad: " + cantidad + " | Precio: " + producto.getPrecioUnitario() + " | Total: " + calcularTotal();
    }
}
