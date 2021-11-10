package models;

import dal.Identificable;

import java.time.LocalDate;
import java.util.List;

public class Postulante implements Identificable {
    private Integer id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private List<Nacionalidad> nacionalidades;
    private List<Idioma> idiomas;
    private List<Categoria> intereses;

    public Postulante(Integer id, String nombre, String apellido, LocalDate fechaNacimiento, List<Nacionalidad> nacionalidades, List<Idioma> idiomas, List<Categoria> intereses) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidades = nacionalidades;
        this.idiomas = idiomas;
        this.intereses = intereses;
    }

    public Postulante(String nombre, String apellido, LocalDate fechaNacimiento, List<Nacionalidad> nacionalidades, List<Idioma> idiomas, List<Categoria> intereses) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidades = nacionalidades;
        this.idiomas = idiomas;
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Nacionalidad> getNacionalidades() {
        return nacionalidades;
    }

    public void setNacionalidades(List<Nacionalidad> nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public List<Categoria> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<Categoria> intereses) {
        this.intereses = intereses;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {

    }
}
