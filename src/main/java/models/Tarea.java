package models;

import dal.Identificable;

public class Tarea implements Identificable {
    private Integer id;
    private String descTarea;

    public Tarea(Integer id, String descTarea) {
        this.id = id;
        this.descTarea = descTarea;
    }

    public String getDescTarea() {
        return descTarea;
    }

    public void setDescTarea(String descTarea) {
        this.descTarea = descTarea;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }
}
