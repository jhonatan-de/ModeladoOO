package modelo.servicios;

import modelo.personas.Mecanico;
import modelo.personas.Cliente;
import modelo.maquinas.Maquina;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JHONATAN
 */
public class Servicio {

    private final int DIAS_GARANTIA = 30;
    private String descripcion;
    private double costo;
    private double costoAdicional;
    private LocalDate fechaSolicitud;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private EstadoServicio estado;
    private Cliente cliente;
    private Mecanico mecanico;
    private Maquina maquina;
    private EstadoAutorizacion estadoAutorizacion;
    private List<DetalleRefaccion> refacciones;

    public Servicio(Cliente cliente, Mecanico mecanico, Maquina maquina) {
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.maquina = maquina;
        refacciones = new ArrayList<>();
        fechaSolicitud = LocalDate.now();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public EstadoAutorizacion getEstadoAutorizacion() {
        return estadoAutorizacion;
    }

    public void setEstadoAutorizacion(EstadoAutorizacion estadoAutorizacion) {
        this.estadoAutorizacion = estadoAutorizacion;
    }

    public List<DetalleRefaccion> getRefacciones() {
        return refacciones;
    }

    public void setRefacciones(List<DetalleRefaccion> refacciones) {
        this.refacciones = refacciones;
    }

}
