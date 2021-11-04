package Models;

import java.time.LocalDate;
import java.util.List;

public class Postulante {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private List<Nacionalidad> nacionalidades;
    private List<Idioma> idiomas;
    private List<Categoria> intereses;

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
}
