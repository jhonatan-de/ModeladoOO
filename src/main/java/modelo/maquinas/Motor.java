package modelo.maquinas;

import java.time.LocalDate;

/**
 *
 * @author JHONATAN
 */
public abstract class Motor extends Maquina {

    public Motor(String modelo, String marca, String descripcionFallas, LocalDate fechaIngreso) {
        super(modelo, marca, descripcionFallas, fechaIngreso);
    }
    
}
