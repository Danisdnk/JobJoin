package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.OfertaLaboral;
import models.Postulacion;
import models.Postulante;
import notificaciones.*;

import java.time.LocalDate;
import java.util.List;

public class PostulacionController {
    private static PostulacionController instancia;

    private Repository<Postulacion> RepoPostulacion;

    private PostulacionController (){
        this.RepoPostulacion = RepoFactory.getRepoPostulacion();
    }

    public List<Postulacion> getPostulacion() {
        return this.RepoPostulacion.getTodos();
    }

    public Postulacion getPostulacionByID(int id) {
        return this.RepoPostulacion.getByID(id);
    }

   /* public Postulacion getPostulacionByDesc(String desc) {
        return this.RepoPostulacion.getTodos()
                .stream()
                .filter(p -> p.getTitulo().equals(desc))
                .findFirst()
                .get();
    }*/
    public void AltaPostulacion (Postulacion p){
        Notificador notificador = new Notificador();
        Notificacion notificacion = new Notificacion();
        EstrategiaDeNotificacion notificadorWhatsApp = new NotificacionPorWhatsApp();
        EstrategiaDeNotificacion notificadorEmail = new NotificacionPorEmail();

        this.RepoPostulacion.insertar(p);

        switch(p.getOferta().getMedioNotificacion()) {
            case WHATSAPP: notificador.setEstrategia(notificadorWhatsApp); break;
            case EMAIL: notificador.setEstrategia(notificadorEmail); break;
        }

        notificador.enviar(notificacion);
    }

    public static PostulacionController getInstancia() {
        if (instancia == null) {
            instancia = new PostulacionController();
        }

        return instancia;
    }
}
