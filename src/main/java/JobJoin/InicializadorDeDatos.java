package JobJoin;

import dal.RepoFactory;
import models.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class InicializadorDeDatos {
    public static void iniciar() {
        var repoEmpresa = RepoFactory.getRepoEmpresa();
        var repoIdioma =RepoFactory.getRepoIdioma();
        var repoNacionalidad = RepoFactory.getRepoNacionalidad();
        var repoOfertaLaboral = RepoFactory.getRepoOfertaLaboral();
        var repoPostulacion = RepoFactory.getRepoPostulacion();
        var repoPostulante = RepoFactory.getRepoPostulante();
        var repoTarea = RepoFactory.getRepoTarea();

        //Empresas
        if (repoEmpresa.getTodos().size() == 0){
            repoEmpresa.insertar(new Empresa(1,25354125,"Globant"));
            repoEmpresa.insertar(new Empresa(2,11254541,"Accenture"));
            repoEmpresa.insertar(new Empresa(3,25554525,"AccionaIT"));
        }

        //Idiomas
        if (repoIdioma.getTodos().size()==0){
            repoIdioma.insertar(new Idioma(10, "Inglés"));
            repoIdioma.insertar(new Idioma(20, "Portugués"));
            repoIdioma.insertar(new Idioma(30, "Italiano"));
            repoIdioma.insertar(new Idioma(40, "Francés"));
        }

        //Nacionalidad
        if (repoNacionalidad.getTodos().size()==0){
            repoNacionalidad.insertar(new Nacionalidad(100, "Argentina"));
            repoNacionalidad.insertar(new Nacionalidad(200, "Uruguaya"));
            repoNacionalidad.insertar(new Nacionalidad(300, "Chilena"));
            repoNacionalidad.insertar(new Nacionalidad(400, "Italiana"));
            repoNacionalidad.insertar(new Nacionalidad(500, "Venezonala"));
            repoNacionalidad.insertar(new Nacionalidad(600, "Colombiana"));
        }

        //Tarea
        if (repoTarea.getTodos().size()==0){
            repoTarea.insertar(new Tarea(1000, "Desarrollar aplicaciones en Angular"));
            repoTarea.insertar(new Tarea(2000, "Administrar Redes"));
            repoTarea.insertar(new Tarea(3000, "Administrar servidores Unix"));
            repoTarea.insertar(new Tarea(4000, "Administrar base de datos Oracle"));
            repoTarea.insertar(new Tarea(5000, "Desarrollar Front End HTML5 + CCS + JavaScript"));
            repoTarea.insertar(new Tarea(6000, "Desarrollar Back End Node.JS"));

        }

        //Oferta Laboral
        if (repoOfertaLaboral.getTodos().size()==0){
            var tareas = new ArrayList<Tarea>();
            var categorias = new ArrayList<Categoria>();
            var requisitos = new ArrayList<String>();

            repoOfertaLaboral.insertar(new OfertaLaboral(111, "Desarrollador/a de aplicaciones en Angular", tareas, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Reconquista 2015,CABA, Argentina", categorias, requisitos, 250000D, LocalDate.parse("2021-09-01"),LocalDate.parse("2021-11-06"), Estado.CERRADA));
        }
    }
}
