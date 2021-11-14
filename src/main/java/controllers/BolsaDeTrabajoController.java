package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.OfertaLaboral;
import models.Postulacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BolsaDeTrabajoController {

    private static BolsaDeTrabajoController instancia;

    private Repository<OfertaLaboral> RepoOfertaLaboral;
    private Repository<Postulacion> repoPostulacion;

    private BolsaDeTrabajoController() {
        this.RepoOfertaLaboral = RepoFactory.getRepoOfertaLaboral();
        this.repoPostulacion = RepoFactory.getRepoPostulacion();
    }

    /*Método que retorna la oferta laboral con mas postulantes según mes/año*/
   /* public OfertaLaboral generarInformeMasPostulantes (int mes, int anio)
    {*/
    //TODO implementar filtrar por parametros
    public void generarInformeMasPostulantes(){

        Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();

        for (Postulacion p: this.repoPostulacion.getTodos()){

            if (dictionary.containsKey(p.getOferta().getID())){

                dictionary.put(p.getOferta().getID(), 1 + dictionary.get(p.getOferta().getID()));
            }
            else{
                dictionary.put(p.getOferta().getID(), 1);
            }
        }
        System.out.println("Initial Dictionary is: "+dictionary);

        int maxValueInMap=(Collections.max(dictionary.values()));  // devuelve valor mas grande del Hashmap
        for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {  // itera el Hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println("Reporte de oferta laboral con mas postulantes: \nLa oferta laboral numero " + maxValueInMap + " con " + entry.getKey() + " postulantes.");     // Imprime el valor maximo
            }
        }
    }

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
