package models;

import dal.Identificable;

import java.time.LocalDate;

public class Postulacion implements Identificable {
    private Integer id;
    private LocalDate fechaPostulacion;
    private Double remuneracionPretendida;
    private Postulante postulante;
    private OfertaLaboral oferta;
    //falta el C.V


    public Postulacion(Integer id, LocalDate fechaPostulacion, Double remuneracionPretendida, Postulante postulante, OfertaLaboral oferta) {
        this.id = id;
        this.fechaPostulacion = fechaPostulacion;
        this.remuneracionPretendida = remuneracionPretendida;
        this.postulante = postulante;
        this.oferta = oferta;
    }

    public Postulacion(LocalDate fechaPostulacion, Double remuneracionPretendida, Postulante postulante, OfertaLaboral oferta) {
        this.fechaPostulacion = fechaPostulacion;
        this.remuneracionPretendida = remuneracionPretendida;
        this.postulante = postulante;
        this.oferta = oferta;
    }
    public LocalDate getFechaPostulacion() {
        return fechaPostulacion;
    }

    public void setFechaPostulacion(LocalDate fechaPostulacion) {
        this.fechaPostulacion = fechaPostulacion;
    }

    public Double getRemuneracionPretendida() {
        return remuneracionPretendida;
    }

    public void setRemuneracionPretendida(Double remuneracionPretendida) {
        this.remuneracionPretendida = remuneracionPretendida;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public OfertaLaboral getOferta() {
        return oferta;
    }

    public void setOferta(OfertaLaboral oferta) {
        this.oferta = oferta;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {

    }
}
