package modelo.servicios;

/**
 *
 * @author JHONATAN
 */
public enum EstadoServicio {
    INICIADO("Iniciado"),
    EN_PROCESO("En Proceso"),
    CANCELADO("Cancelado"),
    TERMINADO("Terminado");

    private String descripcion;

    private EstadoServicio(String descripcion) {
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
