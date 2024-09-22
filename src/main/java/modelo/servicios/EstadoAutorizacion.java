package modelo.servicios;

/**
 *
 * @author JHONATAN
 */
public enum EstadoAutorizacion {
    ACEPTADO("Aceptado"),
    RECHAZADO("Rechazado");

    private String descripcion;

    private EstadoAutorizacion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

