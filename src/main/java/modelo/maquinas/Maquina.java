package modelo.maquinas;

import java.time.LocalDate;

/**
 *
 * @author JHONATAN
 */
public abstract class Maquina {

    private String modelo;
    private String marca;
    private String descripcionFallas;
    private LocalDate fechaIngreso;

    public Maquina(String modelo, String marca, String descripcionFallas, LocalDate fechaIngreso) {
        this.modelo = modelo;
        this.marca = marca;
        this.descripcionFallas = descripcionFallas;
        this.fechaIngreso = fechaIngreso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcionFallas() {
        return descripcionFallas;
    }

    public void setDescripcionFallas(String descripcionFallas) {
        this.descripcionFallas = descripcionFallas;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
