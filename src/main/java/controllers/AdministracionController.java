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

    /*Método que devuelve todos los idiomas creados*/
    public List<Idioma> getIdiomas() {
        return this.RepoIdioma.getTodos();
    }

    /*Método que devuelve un idioma según el ID*/
    public Idioma getIdiomaByID(int id) {
        return this.RepoIdioma.getByID(id);
    }

    /*Método que devuelve un idioma según la descripción*/
    public Idioma getIdiomaByDesc(String desc) {
        return this.RepoIdioma.getTodos()
                .stream()
                .filter(p -> p.getDescIdioma().equals(desc))
                .findFirst()
                .get();
    }

    /*Método que devuelve todas los nacionalidades creadas*/
    public List<Nacionalidad> getNacionalidades() {
        return this.RepoNacionalidad.getTodos();
    }

    /*Método que devuelve una nacionalidad según la descripción*/
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

    /*Método que devuelve todas las tareas creadas*/
    public List<Tarea> getTarea() {
        return this.RepoTarea.getTodos();
    }

    /*Método que devuelve una tarea según la ID*/
    public Tarea getTareaByID(int id) {
        return this.RepoTarea.getByID(id);
    }

    /*Método que devuelve una tarea según la descripción*/
    public Tarea getTareaByDesc(String desc) {
        return this.RepoTarea.getTodos()
                .stream()
                .filter(p -> p.getDescTarea().equals(desc))
                .findFirst()
                .get();
    }

    /*Método que da de alta un idioma*/
    public void agregarIdioma(Idioma idioma) {
        this.RepoIdioma.insertar(idioma);
    }

    /*Método que da de alta una nacionalidad*/
    public void agregarNacionalidad(Nacionalidad nacionalidad) {
        this.RepoNacionalidad.insertar(nacionalidad);
    }

    /*Método que da de alta una tarea*/
    public void agregarTarea(Tarea tarea) {
        this.RepoTarea.insertar(tarea);
    }

    public static AdministracionController getInstancia() {
        if (instancia == null) {
            instancia = new AdministracionController();
        }

        return instancia;
    }
}
