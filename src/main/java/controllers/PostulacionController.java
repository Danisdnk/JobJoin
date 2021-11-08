package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.OfertaLaboral;
import models.Postulacion;

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

    public Postulacion getgetPostulacionByID(int id) {
        return this.RepoPostulacion.getByID(id);
    }

   /* public Postulacion getPostulacionByDesc(String desc) {
        return this.RepoPostulacion.getTodos()
                .stream()
                .filter(p -> p.getTitulo().equals(desc))
                .findFirst()
                .get();
    }*/

    public static PostulacionController getInstancia() {
        if (instancia == null) {
            instancia = new PostulacionController();
        }

        return instancia;
    }
}
