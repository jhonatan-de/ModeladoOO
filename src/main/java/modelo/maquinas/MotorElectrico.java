package modelo.maquinas;

import java.time.LocalDate;

/**
 *
 * @author JHONATAN
 */
public class MotorElectrico extends Motor {
    private String tipoCargador;
    private double capacidadBateria;

    public MotorElectrico(String modelo, String marca, String descripcionFallas, LocalDate fechaIngreso) {
        super(modelo, marca, descripcionFallas, fechaIngreso);
    }
    

    public String getTipoCargador() {
        return tipoCargador;
    }

    public void setTipoCargador(String tipoCargador) {
        this.tipoCargador = tipoCargador;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
    
    
}
