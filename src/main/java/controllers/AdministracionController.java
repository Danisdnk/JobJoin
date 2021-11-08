package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.Idioma;
import models.Nacionalidad;
import models.Tarea;

import java.util.List;

public class AdministracionController {
    private static AdministracionController instancia;

    private Repository<Idioma> RepoIdioma;
    private Repository<Nacionalidad> RepoNacionalidad;
    private Repository<Tarea> RepoTarea;

    private AdministracionController() {
        this.RepoIdioma = RepoFactory.getRepoIdioma();
        this.RepoNacionalidad = RepoFactory.getRepoNacionalidad();
        this.RepoTarea = RepoFactory.getRepoTarea();
    }

    public List<Idioma> getIdiomas() {
        return this.RepoIdioma.getTodos();
    }

    public Idioma getIdiomaByID(int id) {
        return this.RepoIdioma.getByID(id);
    }

    public Idioma getIdiomaByDesc(String desc) {
        return this.RepoIdioma.getTodos()
                .stream()
                .filter(p -> p.getDescIdioma().equals(desc))
                .findFirst()
                .get();
    }

    public List<Nacionalidad> getNacionalidades() {
        return this.RepoNacionalidad.getTodos();
    }

    public Nacionalidad getNacionalidadByID(int id) {
        return this.RepoNacionalidad.getByID(id);
    }

    public Nacionalidad getNacionalidadByDesc(String desc) {
        return this.RepoNacionalidad.getTodos()
                .stream()
                .filter(p -> p.getDescNacionalidad().equals(desc))
                .findFirst()
                .get();
    }

    public List<Tarea> getTarea() {
        return this.RepoTarea.getTodos();
    }

    public Tarea getTareaByID(int id) {
        return this.RepoTarea.getByID(id);
    }

    public Tarea getTareaByDesc(String desc) {
        return this.RepoTarea.getTodos()
                .stream()
                .filter(p -> p.getDescTarea().equals(desc))
                .findFirst()
                .get();
    }


    public static AdministracionController getInstancia() {
        if (instancia == null) {
            instancia = new AdministracionController();
        }

        return instancia;
    }
}
