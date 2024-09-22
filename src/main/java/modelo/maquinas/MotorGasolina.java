package modelo.maquinas;

import java.time.LocalDate;

/**
 *
 * @author JHONATAN
 */
public class MotorGasolina extends Motor{
    private double capacidadCilindrada;

    public MotorGasolina(String modelo, String marca, String descripcionFallas, LocalDate fechaIngreso) {
        super(modelo, marca, descripcionFallas, fechaIngreso);
    }

    public double getCapacidadCilindrada() {
        return capacidadCilindrada;
    }

    public void setCapacidadCilindrada(double capacidadCilindrada) {
        this.capacidadCilindrada = capacidadCilindrada;
    }
    
}
