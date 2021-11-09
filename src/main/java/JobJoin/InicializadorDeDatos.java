package JobJoin;

import dal.RepoFactory;
import models.*;
import notificaciones.MedioNotificacion;

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
            repoEmpresa.insertar(new Empresa(3,24454525,"AccionaIT"));
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
            repoTarea.insertar(new Tarea(3000, "Asistente de RR.HH"));
            repoTarea.insertar(new Tarea(4000, "Coordinador/a de proyectos de RRHH y Digitalización"));
            repoTarea.insertar(new Tarea(5000, "Administrar servidores Unix"));
            repoTarea.insertar(new Tarea(6000, "Administrar base de datos Oracle"));
            repoTarea.insertar(new Tarea(7000, "Manejar registros, sistemas y presupuestos financieros"));
            repoTarea.insertar(new Tarea(8000, "Desarrollar Front End HTML5 + CCS + JavaScript"));
            repoTarea.insertar(new Tarea(9000, "Desarrollar Back End Node.JS"));
            repoTarea.insertar(new Tarea(10000, "Contactar postulantes y realizar entrevistas"));
            repoTarea.insertar(new Tarea(11000, "Desarrollo de aplicaciones"));
            repoTarea.insertar(new Tarea(12000, "Revisar los libros contables de los clientes"));
            repoTarea.insertar(new Tarea(13000, "Elaborar el balance de los libros financieron"));

        }

        //Oferta Laboral
        if (repoOfertaLaboral.getTodos().size()==0){
            var tareas1 = new ArrayList<Tarea>();
            var tareas2 = new ArrayList<Tarea>();
            var tareas3 = new ArrayList<Tarea>();
            var tareas4 = new ArrayList<Tarea>();
            var tareas5 = new ArrayList<Tarea>();
            var tareas6 = new ArrayList<Tarea>();

            var requisitos = new ArrayList<String>();

            tareas1.add(repoTarea.getByID(1000));
            tareas1.add(repoTarea.getByID(9000));
            tareas2.add(repoTarea.getByID(1000));
            tareas2.add(repoTarea.getByID(8000));
            tareas2.add(repoTarea.getByID(9000));
            tareas3.add(repoTarea.getByID(3000));
            tareas3.add(repoTarea.getByID(11000));
            tareas4.add(repoTarea.getByID(5000));
            tareas5.add(repoTarea.getByID(6000));
            tareas6.add(repoTarea.getByID(7000));
            tareas6.add(repoTarea.getByID(12000));
            tareas6.add(repoTarea.getByID(13000));

            repoOfertaLaboral.insertar(new OfertaLaboral(111, "Desarrollador/a de aplicaciones en Angular", tareas1, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Reconquista 2015,CABA, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-09-01"),LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.EMAIL));
            repoOfertaLaboral.insertar(new OfertaLaboral(112, "Asistente de RRHH", tareas3, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "San Martin 1095,CABA, Argentina", Categoria.RR_HH, requisitos, 1750000D, LocalDate.parse("2021-11-01"),LocalDate.parse("2021-12-31"), Estado.ABIERTA, MedioNotificacion.EMAIL));
            repoOfertaLaboral.insertar(new OfertaLaboral(113, "Administrador/a de base de datos Oracle", tareas5, ModalidadContrato.FULLTIME, TipoTrabajo.REMOTO, Categoria.Sistemas, requisitos, 150000D, LocalDate.parse("2021-11-08"),LocalDate.parse("2022-01-31"), Estado.ABIERTA, MedioNotificacion.EMAIL));
            repoOfertaLaboral.insertar(new OfertaLaboral(114, "Administrador/a de servidores Unix", tareas4, ModalidadContrato.PARTTIME, TipoTrabajo.REMOTO, Categoria.Sistemas, requisitos, 130000D, LocalDate.parse("2021-11-08"),LocalDate.parse("2021-12-31"), Estado.ABIERTA, MedioNotificacion.EMAIL));
            repoOfertaLaboral.insertar(new OfertaLaboral(115, "Desarrollador/a Front End", tareas2, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Avellaneda 2033,Munro, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-11-08"),LocalDate.parse("2021-12-20"), Estado.ABIERTA, MedioNotificacion.WHATSAPP));
            repoOfertaLaboral.insertar(new OfertaLaboral(116, tareas1, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Humberto Primo 1133,San Martin, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-11-09"),LocalDate.parse("2022-01-25"), Estado.ABIERTA, MedioNotificacion.WHATSAPP));
            repoOfertaLaboral.insertar(new OfertaLaboral(117, "Desarrollador/a Front End", tareas2, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, "Directorio 1161,CABA, Argentina", Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-08-01"),LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.WHATSAPP));
            repoOfertaLaboral.insertar(new OfertaLaboral(118,  tareas4, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, Categoria.Sistemas, requisitos, 250000D, LocalDate.parse("2021-09-01"),LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.WHATSAPP));
            repoOfertaLaboral.insertar(new OfertaLaboral(119,"Coordinador/a de proyectos de RRHH y Digitalización" , tareas3, ModalidadContrato.FULLTIME, TipoTrabajo.PRESENCIAL, Categoria.RR_HH, requisitos, 255000D, LocalDate.parse("2021-09-01"),LocalDate.parse("2021-11-06"), Estado.CERRADA, MedioNotificacion.EMAIL));
            repoOfertaLaboral.insertar(new OfertaLaboral(120, "Contadores Sr.", tareas6, ModalidadContrato.PARTTIME, TipoTrabajo.REMOTO, Categoria.Contable, requisitos, 145000D, LocalDate.parse("2021-11-08"),LocalDate.parse("2021-12-31"), Estado.ABIERTA, MedioNotificacion.EMAIL));

        }

        //Postulante
        if (repoPostulante.getTodos().size()==0) {
            var nacionalidades1 = new ArrayList<Nacionalidad>();
            var nacionalidades2 = new ArrayList<Nacionalidad>();
            var nacionalidades3 = new ArrayList<Nacionalidad>();
            var idiomas1 = new ArrayList<Idioma>();
            var idiomas2 = new ArrayList<Idioma>();
            var intereses1 = new ArrayList<Categoria>();
            var intereses2 = new ArrayList<Categoria>();
            var intereses3 = new ArrayList<Categoria>();

            nacionalidades1.add(repoNacionalidad.getByID(100));
            nacionalidades2.add(repoNacionalidad.getByID(100));
            nacionalidades2.add(repoNacionalidad.getByID(400));
            nacionalidades3.add(repoNacionalidad.getByID(500));

            idiomas1.add(repoIdioma.getByID(10));
            idiomas2.add(repoIdioma.getByID(10));
            idiomas2.add(repoIdioma.getByID(30));

            intereses1.add(Categoria.Sistemas);
            intereses2.add(Categoria.Sistemas);
            intereses2.add(Categoria.IndustriaPetrolera);
            intereses3.add(Categoria.Contable);
            intereses3.add(Categoria.RR_HH);

            repoPostulante.insertar(new Postulante(1,"Eugenia", "Sanchez",LocalDate.parse("2000-09-01"),nacionalidades1,idiomas1,intereses1));
            repoPostulante.insertar(new Postulante(2,"Adriana", "Ruiz",LocalDate.parse("1990-05-20"),nacionalidades2,idiomas2,intereses2));
            repoPostulante.insertar(new Postulante(3,"Luis", "Perez",LocalDate.parse("1985-03-15"),nacionalidades2,idiomas2,intereses3));
            repoPostulante.insertar(new Postulante(4,"Jorge", "Toloza",LocalDate.parse("1999-10-20"),nacionalidades3,idiomas1,intereses1));
            repoPostulante.insertar(new Postulante(5,"Marta", "Britez",LocalDate.parse("2000-09-01"),nacionalidades1,idiomas1,intereses2));
            repoPostulante.insertar(new Postulante(6,"Carlos", "Pasarin",LocalDate.parse("2002-11-11"),nacionalidades2,idiomas2,intereses2));
            repoPostulante.insertar(new Postulante(7,"Brian", "Feliu",LocalDate.parse("1987-09-21"),nacionalidades3,idiomas1,intereses1));
            repoPostulante.insertar(new Postulante(8,"Matias", "Lopez",LocalDate.parse("1993-04-03"),nacionalidades3,idiomas1,intereses3));
            repoPostulante.insertar(new Postulante(9,"Lorena", "Suarez",LocalDate.parse("1996-08-01"),nacionalidades1,idiomas1,intereses3));
        }

        //Postulacion
        if (repoPostulacion.getTodos().size()==0){
            var postulante1 = repoPostulante.getByID(1);
            var oferta1 = repoOfertaLaboral.getByID(111);
            repoPostulacion.insertar(new Postulacion(3000,LocalDate.parse("2021-09-13"),255000D,postulante1, oferta1));
            var postulante2 = repoPostulante.getByID(3);
            var oferta2 = repoOfertaLaboral.getByID(111);
            repoPostulacion.insertar(new Postulacion(3001,LocalDate.parse("2021-09-15"),253000D,postulante2, oferta2));
            var postulante3 = repoPostulante.getByID(4);
            var oferta3 = repoOfertaLaboral.getByID(113);
            repoPostulacion.insertar(new Postulacion(3002,LocalDate.parse("2021-11-10"),155000D,postulante3, oferta3));
            var postulante4 = repoPostulante.getByID(1);
            var oferta4 = repoOfertaLaboral.getByID(115);
            repoPostulacion.insertar(new Postulacion(3003,LocalDate.parse("2021-11-11"),256000D,postulante4, oferta4));
            var postulante5 = repoPostulante.getByID(8);
            var oferta5 = repoOfertaLaboral.getByID(119);
            repoPostulacion.insertar(new Postulacion(3004,LocalDate.parse("1996-08-01"),259000D,postulante5, oferta5));
            var postulante6 = repoPostulante.getByID(8);
            var oferta6 = repoOfertaLaboral.getByID(112);
            repoPostulacion.insertar(new Postulacion(3005,LocalDate.parse("2021-11-03"),180000D,postulante6, oferta6));
            var postulante7 = repoPostulante.getByID(6);
            var oferta7 = repoOfertaLaboral.getByID(115);
            repoPostulacion.insertar(new Postulacion(3006,LocalDate.parse("2021-11-08"),258000D,postulante7, oferta7));
        }
    }
}
