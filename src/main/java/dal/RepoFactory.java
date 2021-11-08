package dal;

import models.*;

public class RepoFactory {
    private static Repository<Empresa> empresaRepository;
    private static Repository<Idioma> idiomaRepository;
    private static Repository<Nacionalidad> nacionalidadRepository;
    private static Repository<OfertaLaboral> ofertaLaboralRepository;
    private static Repository<Postulacion> postulacionRepository;
    private static Repository<Postulante> postulanteRepository;
    private static Repository<Tarea> tareaRepository;

    public static Repository<Empresa> getRepoEmpresa(){
        if (empresaRepository == null) {
            empresaRepository = new Repository<>(Empresa.class);
        }

        return  empresaRepository;
    }

    public static Repository<Idioma> getRepoIdioma(){
        if (idiomaRepository == null) {
            idiomaRepository = new Repository<>(Idioma.class);
        }

        return idiomaRepository;
    }

    public static Repository<Nacionalidad> getRepoNacionalidad(){
        if (nacionalidadRepository == null) {
            nacionalidadRepository = new Repository<>(Nacionalidad.class);
        }

        return nacionalidadRepository;
    }

    public static Repository<OfertaLaboral> getRepoOfertaLaboral(){
        if (ofertaLaboralRepository == null) {
            ofertaLaboralRepository = new Repository<>(OfertaLaboral.class);
        }

        return ofertaLaboralRepository;
    }

    public static Repository<Postulacion> getRepoPostulacion(){
        if (postulacionRepository == null) {
            postulacionRepository = new Repository<>(Postulacion.class);
        }

        return postulacionRepository;
    }

    public static Repository<Postulante> getRepoPostulante(){
        if (postulanteRepository == null) {
            postulanteRepository = new Repository<>(Postulante.class);
        }

        return postulanteRepository;
    }

    public static Repository<Tarea> getRepoTarea(){
        if (tareaRepository == null) {
            tareaRepository = new Repository<>(Tarea.class);
        }

        return tareaRepository;
    }
}
