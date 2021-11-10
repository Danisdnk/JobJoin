package JobJoin;

import controllers.PostulacionController;
import dal.RepoFactory;
import models.*;
import notificaciones.MedioNotificacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InicializadorDeDatos {

    public static void iniciar() {
        var repoEmpresa = RepoFactory.getRepoEmpresa();
        var repoIdioma = RepoFactory.getRepoIdioma();
        var repoNacionalidad = RepoFactory.getRepoNacionalidad();
        var repoOfertaLaboral = RepoFactory.getRepoOfertaLaboral();
        var repoPostulacion = RepoFactory.getRepoPostulacion();
        var repoPostulante = RepoFactory.getRepoPostulante();
        var repoTarea = RepoFactory.getRepoTarea();

        //Idiomas
        if (repoIdioma.getTodos().size() == 0) {
            repoIdioma.insertar(new Idioma( "Inglés"));
            repoIdioma.insertar(new Idioma("Portugués"));
            repoIdioma.insertar(new Idioma( "Italiano"));
            repoIdioma.insertar(new Idioma("Francés"));
        }

        //Nacionalidad
        if (repoNacionalidad.getTodos().size() == 0) {
            repoNacionalidad.insertar(new Nacionalidad("Argentina"));
            repoNacionalidad.insertar(new Nacionalidad("Uruguaya"));
            repoNacionalidad.insertar(new Nacionalidad("Chilena"));
            repoNacionalidad.insertar(new Nacionalidad("Italiana"));
            repoNacionalidad.insertar(new Nacionalidad("Venezolana"));
            repoNacionalidad.insertar(new Nacionalidad("Colombiana"));
        }

        //Tarea
        if (repoTarea.getTodos().size() == 0) {
            repoTarea.insertar(new Tarea("Desarrollar aplicaciones en Angular"));
            repoTarea.insertar(new Tarea("Administrar Redes"));
            repoTarea.insertar(new Tarea("Asistente de RR.HH"));
            repoTarea.insertar(new Tarea("Coordinador/a de proyectos de RRHH y Digitalización"));
            repoTarea.insertar(new Tarea("Administrar servidores Unix"));
            repoTarea.insertar(new Tarea("Administrar base de datos Oracle"));
            repoTarea.insertar(new Tarea("Manejar registros, sistemas y presupuestos financieros"));
            repoTarea.insertar(new Tarea("Desarrollar Front End HTML5 + CCS + JavaScript"));
            repoTarea.insertar(new Tarea("Desarrollar Back End Node.JS"));
            repoTarea.insertar(new Tarea( "Contactar postulantes y realizar entrevistas"));
            repoTarea.insertar(new Tarea( "Desarrollo de aplicaciones"));
            repoTarea.insertar(new Tarea( "Revisar los libros contables de los clientes"));
            repoTarea.insertar(new Tarea( "Elaborar el balance de los libros financieron"));

        }

        //Empresas

        if (repoEmpresa.getTodos().size() == 0) {

            repoEmpresa.insertar(new Empresa( 25354125, "Globant", "empleos@globan.com","24682468"));
            repoEmpresa.insertar(new Empresa( 11254541, "Accenture", "empleos@accenture.com","13571357"));
            repoEmpresa.insertar(new Empresa( 24454525, "AccionaIT","empleos@accionait.com","14725836"));
        }

        //Oferta Laboral
        if (repoOfertaLaboral.getTodos().size() == 0) {
            var tareas1 = new ArrayList<Tarea>();
            var tareas2 = new ArrayList<Tarea>();
            var tareas3 = new ArrayList<Tarea>();
            var tareas4 = new ArrayList<Tarea>();
            var tareas5 = new ArrayList<Tarea>();
            var tareas6 = new ArrayList<Tarea>();

            var requisitos = new ArrayList<String>();

            tareas1.add(repoTarea.getByID(1));
            tareas1.add(repoTarea.getByID(8));
            tareas2.add(repoTarea.getByID(1));
            tareas2.add(repoTarea.getByID(8));
            tareas2.add(repoTarea.getByID(9));
            tareas3.add(repoTarea.getByID(3));
            tareas3.add(repoTarea.getByID(10));
            tareas4.add(repoTarea.getByID(5));
            tareas5.add(repoTarea.getByID(6));
            tareas6.add(repoTarea.getByID(7));
            tareas6.add(repoTarea.getByID(12));
            tareas6.add(repoTarea.getByID(13));

            Empresa empresa1 = repoEmpresa.getByID(1);
            Empresa empresa2 = repoEmpresa.getByID(2);
            Empresa empresa3 = repoEmpresa.getByID(3);

            repoOfertaLaboral.insertar(new OfertaLaboral("Desarrollador/a de aplicaciones en Angular", tareas1, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Reconquista 2015,CABA, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-09-01"), LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.EMAIL, empresa1));
            repoOfertaLaboral.insertar(new OfertaLaboral("Asistente de RRHH", tareas3, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "San Martin 1095,CABA, Argentina", Categoria.RR_HH, requisitos, 1750000D, LocalDate.parse("2021-11-01"), LocalDate.parse("2021-12-31"), Estado.ABIERTA, MedioNotificacion.EMAIL, empresa2));
            repoOfertaLaboral.insertar(new OfertaLaboral("Administrador/a de base de datos Oracle", tareas5, ModalidadContrato.FULLTIME, TipoTrabajo.REMOTO, "",Categoria.Sistemas, requisitos, 150000D, LocalDate.parse("2021-11-08"), LocalDate.parse("2022-01-31"), Estado.ABIERTA, MedioNotificacion.EMAIL,empresa1));
            repoOfertaLaboral.insertar(new OfertaLaboral("Administrador/a de servidores Unix", tareas4, ModalidadContrato.PARTTIME, TipoTrabajo.REMOTO, "", Categoria.Sistemas, requisitos, 130000D, LocalDate.parse("2021-11-08"), LocalDate.parse("2021-12-31"), Estado.ABIERTA, MedioNotificacion.EMAIL,empresa3));
            repoOfertaLaboral.insertar(new OfertaLaboral("Desarrollador/a Front End", tareas2, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Avellaneda 2033,Munro, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-11-08"), LocalDate.parse("2021-12-20"), Estado.ABIERTA, MedioNotificacion.WHATSAPP,empresa3));
            repoOfertaLaboral.insertar(new OfertaLaboral( tareas1, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Humberto Primo 1133,San Martin, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-11-09"), LocalDate.parse("2022-01-25"), Estado.ABIERTA, MedioNotificacion.WHATSAPP,empresa1));
            repoOfertaLaboral.insertar(new OfertaLaboral("Desarrollador/a Front End", tareas2, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Directorio 1161,CABA, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-08-01"), LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.WHATSAPP,empresa3));
            repoOfertaLaboral.insertar(new OfertaLaboral( tareas4, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Monroe 2500, CABA, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-09-01"), LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.WHATSAPP,empresa3));
            repoOfertaLaboral.insertar(new OfertaLaboral("Coordinador/a de proyectos de RRHH y Digitalización", tareas3, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Lima 717, CABA, Argentina", Categoria.RR_HH, requisitos, 255000D, LocalDate.parse("2021-09-01"), LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.EMAIL,empresa2));
            repoOfertaLaboral.insertar(new OfertaLaboral("Contadores Sr.", tareas6, ModalidadContrato.PARTTIME, TipoTrabajo.REMOTO, "", Categoria.Contable, requisitos, 145000D, LocalDate.parse("2021-11-08"), LocalDate.parse("2021-12-31"), Estado.ABIERTA, MedioNotificacion.EMAIL,empresa2));

        }

        //Postulante
        if (repoPostulante.getTodos().size() == 0) {
            List<Nacionalidad> nacionalidades1 = new ArrayList<Nacionalidad>();
            var nacionalidades2 = new ArrayList<Nacionalidad>();
            var nacionalidades3 = new ArrayList<Nacionalidad>();
            var idiomas1 = new ArrayList<Idioma>();
            var idiomas2 = new ArrayList<Idioma>();
            var intereses1 = new ArrayList<Categoria>();
            var intereses2 = new ArrayList<Categoria>();
            var intereses3 = new ArrayList<Categoria>();

            nacionalidades1.add(repoNacionalidad.getByID(1));
            nacionalidades2.add(repoNacionalidad.getByID(1));
            nacionalidades2.add(repoNacionalidad.getByID(4));
            nacionalidades3.add(repoNacionalidad.getByID(5));

            idiomas1.add(repoIdioma.getByID(1));
            idiomas2.add(repoIdioma.getByID(1));
            idiomas2.add(repoIdioma.getByID(3));

            intereses1.add(Categoria.Sistemas);
            intereses2.add(Categoria.Sistemas);
            intereses2.add(Categoria.IndustriaPetrolera);
            intereses3.add(Categoria.Contable);
            intereses3.add(Categoria.RR_HH);

            repoPostulante.insertar(new Postulante("Eugenia", "Sanchez", LocalDate.parse("2000-09-01"), nacionalidades1, idiomas1, intereses1));
            repoPostulante.insertar(new Postulante("Adriana", "Ruiz", LocalDate.parse("1990-05-20"), nacionalidades2, idiomas2, intereses2));
            repoPostulante.insertar(new Postulante("Luis", "Perez", LocalDate.parse("1985-03-15"), nacionalidades2, idiomas2, intereses3));
            repoPostulante.insertar(new Postulante("Jorge", "Toloza", LocalDate.parse("1999-10-20"), nacionalidades3, idiomas1, intereses1));
            repoPostulante.insertar(new Postulante("Marta", "Britez", LocalDate.parse("2000-09-01"), nacionalidades1, idiomas1, intereses2));
            repoPostulante.insertar(new Postulante("Carlos", "Pasarin", LocalDate.parse("2002-11-11"), nacionalidades2, idiomas2, intereses2));
            repoPostulante.insertar(new Postulante("Brian", "Feliu", LocalDate.parse("1987-09-21"), nacionalidades3, idiomas1, intereses1));
            repoPostulante.insertar(new Postulante("Matias", "Lopez", LocalDate.parse("1993-04-03"), nacionalidades3, idiomas1, intereses3));
            repoPostulante.insertar(new Postulante("Lorena", "Suarez", LocalDate.parse("1996-08-01"), nacionalidades1, idiomas1, intereses3));
        }

        //Postulacion
        if (repoPostulacion.getTodos().size() == 0) {
            var postulacionController = PostulacionController.getInstancia();
            var postulante1 = repoPostulante.getByID(1);
            var oferta1 = repoOfertaLaboral.getByID(1);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-09-13"), 255000D, postulante1, oferta1));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-09-13"), 255000D, postulante1, oferta1));
            var postulante2 = repoPostulante.getByID(3);
            var oferta2 = repoOfertaLaboral.getByID(2);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-09-15"), 253000D, postulante2, oferta2));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-09-15"), 253000D, postulante2, oferta2));
            var postulante3 = repoPostulante.getByID(4);
            var oferta3 = repoOfertaLaboral.getByID(3);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-11-10"), 155000D, postulante3, oferta3));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-11-10"), 155000D, postulante3, oferta3));
            var postulante4 = repoPostulante.getByID(1);
            var oferta4 = repoOfertaLaboral.getByID(5);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-11-11"), 256000D, postulante4, oferta4));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-11-11"), 256000D, postulante4, oferta4));
            var postulante5 = repoPostulante.getByID(8);
            var oferta5 = repoOfertaLaboral.getByID(9);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-08-01"), 259000D, postulante5, oferta5));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-08-01"), 259000D, postulante5, oferta5));
            var postulante6 = repoPostulante.getByID(8);
            var oferta6 = repoOfertaLaboral.getByID(2);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-11-03"), 180000D, postulante6, oferta6));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-11-03"), 180000D, postulante6, oferta6));
            var postulante7 = repoPostulante.getByID(6);
            var oferta7 = repoOfertaLaboral.getByID(5);
            //repoPostulacion.insertar(new Postulacion(LocalDate.parse("2021-11-08"), 258000D, postulante7, oferta7));
            postulacionController.agregarPostulacion(new Postulacion(LocalDate.parse("2021-11-08"), 258000D, postulante7, oferta7));
        }
    }
}
