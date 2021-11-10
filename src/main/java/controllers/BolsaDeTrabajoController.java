package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.OfertaLaboral;
import models.Tarea;

import java.util.List;

public class BolsaDeTrabajoController {

    private static BolsaDeTrabajoController instancia;

    private Repository<OfertaLaboral> RepoOfertaLaboral;

    private BolsaDeTrabajoController() {
        this.RepoOfertaLaboral = RepoFactory.getRepoOfertaLaboral();
    }

    /*Método que retorna la oferta laboral con mas postulantes según mes/año*/
   /* public OfertaLaboral generarInformeMasPostulantes (int mes, int anio)
    {

    }*/

    /*Método que retorna las m categorias más seleccionadas en las oferta laborales*/
   /* public List <Categorias> generarInformeMCategorias (int m)
    {

    }*/

    /*Método que retorna la oferta laboral mas accesible*/
   /* public OfertaLaboral generarInformeTrabajoMasAccesible ()
    {

    }*/

    /*Método que retorna la oferta laboral mas exigente*/
   /* public OfertaLaboral generarInformeTrabajoMasExigente ()
    {

    }*/
    public static BolsaDeTrabajoController getInstancia() {
        if (instancia == null) {
            instancia = new BolsaDeTrabajoController();
        }

        return instancia;
    }
}
