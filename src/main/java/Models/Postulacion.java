package Models;

import java.time.LocalDate;

public class Postulacion {
    private LocalDate fechaPostulacion;
    private Double remuneracionPretendida;
    private Postulante postulante;
    //falta el C.V y notificacion


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
}
