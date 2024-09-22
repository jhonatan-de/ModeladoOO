package modelo.maquinas;

import java.time.LocalDate;

/**
 *
 * @author JHONATAN
 */
public class Auto extends Maquina {
    private String numeroPlacas;
    private String carroceria;
    private String color;

    public Auto(String modelo, String marca, String descripcionFallas, LocalDate fechaIngreso) {
        super(modelo, marca, descripcionFallas, fechaIngreso);
    }

    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
