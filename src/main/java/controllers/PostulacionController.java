package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.OfertaLaboral;
import models.Postulacion;
import models.Postulante;
import notificaciones.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PostulacionController {
    private static PostulacionController instancia;

    private Repository<Postulacion> RepoPostulacion;
    private Repository<Postulante> RepoPostulante;

    private PostulacionController() {

        this.RepoPostulacion = RepoFactory.getRepoPostulacion();
        this.RepoPostulante = RepoFactory.getRepoPostulante();
    }

    /*Metodo que levanta todas las postulaciones*/
    public List<Postulacion> getPostulacion() {
        return this.RepoPostulacion.getTodos();
    }

    /*Metodo que levanta una postulación por ID*/
    public Postulacion getPostulacionByID(int id) {
        return this.RepoPostulacion.getByID(id);
    }

    /*Metodo que levanta todas las postulaciones de una oferta laboral*/
    public List<Postulacion> getPostulacionesSegunOfertaLab(int id) {
        return Stream.of(this.RepoPostulacion.getTodos())
                .flatMap(Collection::stream)
                .filter(c -> c.getOferta().getID() == id)
                .collect(Collectors.toList());
    }

    /*Metodo que inserta una nueva postulación*/
    public void agregarPostulacion(Postulacion postulacion) {
        Notificador notificador = new Notificador();
        Notificacion notificacion = new Notificacion();
        EstrategiaDeNotificacion notificadorWhatsApp = new NotificacionPorWhatsApp();
        EstrategiaDeNotificacion notificadorEmail = new NotificacionPorEmail();

        this.RepoPostulacion.insertar(postulacion);
    notificacion.setMensaje("Tenes un nuevo postulante");
        switch (postulacion.getOferta().getMedioNotificacion()) {
            case WHATSAPP:
                notificacion.setNroCompletoDestinatario(postulacion.getOferta().getEmpresa().getWhatsapp());
                notificador.setEstrategia(notificadorWhatsApp);
                break;
            case EMAIL:
                notificacion.setNroCompletoDestinatario(postulacion.getOferta().getEmpresa().getCorreoElectronico());
                notificador.setEstrategia(notificadorEmail);
                break;
        }

        notificador.enviar(notificacion);
    }

    /*Metodo que verifica los requisitos del postulante*/

    public boolean verificaRequisitos(OfertaLaboral ofertaLaboral, Postulante postulante) {
        return true;
    }

    /*Metodo que permite al postulante cargar el C.V*/
    public boolean cargarCV() {
        return true;
    }

    public static PostulacionController getInstancia() {
        if (instancia == null) {
            instancia = new PostulacionController();
        }

        return instancia;
    }
}
