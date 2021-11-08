package models;

import dal.Identificable;

import java.time.LocalDate;

public class Postulacion implements Identificable {
    private Integer id;
    private LocalDate fechaPostulacion;
    private Double remuneracionPretendida;
    private Postulante postulante;
    //falta el C.V y notificacion


    public Postulacion(Integer id, LocalDate fechaPostulacion, Double remuneracionPretendida, Postulante postulante) {
        this.id = id;
        this.fechaPostulacion = fechaPostulacion;
        this.remuneracionPretendida = remuneracionPretendida;
        this.postulante = postulante;
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

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }
}
