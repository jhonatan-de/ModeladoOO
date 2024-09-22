package controlador;

/**
 *
 * @author JHONATAN
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.maquinas.Auto;
import modelo.maquinas.Maquina;
import modelo.maquinas.MotorElectrico;
import modelo.maquinas.MotorGasolina;

public class GestorMaquinas {
    private List<Maquina> listaMaquinas;

    public GestorMaquinas() {
        this.listaMaquinas = new ArrayList<>();
    }

    public void registrarAuto(String modelo, String marca, String descripcionFallas) {
        Maquina maquina = new Auto(modelo, marca, descripcionFallas, LocalDate.now());
        listaMaquinas.add(maquina);
        System.out.println("Vehículo registrado: " + maquina.getModelo());
    }
     public void registrarMotorGasolina(String modelo, String marca, String descripcionFallas) {
        Maquina maquina = new MotorGasolina(modelo, marca, descripcionFallas, LocalDate.now());
        listaMaquinas.add(maquina);
        System.out.println("Motor de gasolina registrado: " + maquina.getModelo());
    }
    public void registrarMotorElectrico(String modelo, String marca, String descripcionFallas) {
        Maquina maquina = new MotorElectrico(modelo, marca, descripcionFallas, LocalDate.now());; 
        listaMaquinas.add(maquina);
        System.out.println("Motor eléctrico: " + maquina.getModelo());
    }

    public Maquina buscarMaquina(String modelo) {
        for (Maquina maquina : listaMaquinas) {
            if (maquina.getModelo().equalsIgnoreCase(modelo)) {
                return maquina;
            }
        }
        System.out.println("Vehículo no encontrado.");
        return null;
    }

    public List<Maquina> getListaMaquinas() {
        return listaMaquinas;
    }
    
}

