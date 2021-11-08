package models;

import dal.Identificable;

import java.time.LocalDate;
import java.util.List;

public class OfertaLaboral implements Identificable {
    private Integer id;
    private String titulo;
    private List<Tarea> detalle;
    private ModalidadContrato modalidadContrato;
    private TipoTrabajo tipoTrabajo;
    private String LugarTrabajo;
    private List<Categoria> categorias;
    private List<String> requisitos;
    private Double salario;
    private LocalDate fechaApertura;
    private LocalDate fechaCierre;
    private Estado estado;

    public OfertaLaboral(Integer id, String titulo, List<Tarea> detalle, ModalidadContrato modalidadContrato, TipoTrabajo tipoTrabajo, String lugarTrabajo, List<Categoria> categorias, List<String> requisitos, Double salario, LocalDate fechaApertura, LocalDate fechaCierre, Estado estado) {
        this.id = id;
        this.titulo = titulo;
        this.detalle = detalle;
        this.modalidadContrato = modalidadContrato;
        this.tipoTrabajo = tipoTrabajo;
        LugarTrabajo = lugarTrabajo;
        this.categorias = categorias;
        this.requisitos = requisitos;
        this.salario = salario;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Tarea> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Tarea> detalle) {
        this.detalle = detalle;
    }

    public ModalidadContrato getModalidadContrato() {
        return modalidadContrato;
    }

    public void setModalidadContrato(ModalidadContrato modalidadContrato) {
        this.modalidadContrato = modalidadContrato;
    }

    public TipoTrabajo getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        LugarTrabajo = lugarTrabajo;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }
}
