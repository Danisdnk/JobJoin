package models;

import dal.Identificable;

public class Nacionalidad implements Identificable {
    private Integer id;
    private String descNacionalidad;

    public Nacionalidad(Integer id, String descNacionalidad) {
        this.id = id;
        this.descNacionalidad = descNacionalidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescNacionalidad() {
        return descNacionalidad;
    }

    public void setDescNacionalidad(String descNacionalidad) {
        this.descNacionalidad = descNacionalidad;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }
}
