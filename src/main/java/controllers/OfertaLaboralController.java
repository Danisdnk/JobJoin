package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.Idioma;
import models.OfertaLaboral;

import java.util.List;

public class OfertaLaboralController {
    private static OfertaLaboralController instancia;

    private Repository <OfertaLaboral> RepoOfertaLaboral;

    private OfertaLaboralController (){
        this.RepoOfertaLaboral = RepoFactory.getRepoOfertaLaboral();
    }

    public List<OfertaLaboral> getOfertaLaboral() {
        return this.RepoOfertaLaboral.getTodos();
    }

    public OfertaLaboral getOfertaLaboralByID(int id) {
        return this.RepoOfertaLaboral.getByID(id);
    }

    public OfertaLaboral getOfertaLaboralByDesc(String desc) {
        return this.RepoOfertaLaboral.getTodos()
                .stream()
                .filter(p -> p.getTitulo().equals(desc))
                .findFirst()
                .get();
    }

    public static OfertaLaboralController getInstancia() {
        if (instancia == null) {
            instancia = new OfertaLaboralController();
        }

        return instancia;
    }
}
