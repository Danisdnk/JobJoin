package models;

import dal.Identificable;

public class Idioma implements Identificable {
    private Integer id;
    private String descIdioma;

    public Idioma(Integer id, String descIdioma) {
        this.id = id;
        this.descIdioma = descIdioma;
    }

    public String getDescIdioma() {
        return descIdioma;
    }

    public void setDescIdioma(String descIdioma) {
        this.descIdioma = descIdioma;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }
}
