package models;

import dal.Identificable;

public class Empresa implements Identificable {
    private Integer id;
    private Integer cuit;
    private String razonSocial;

    public Empresa(Integer id, Integer cuit, String razonSocial) {
        this.id = id;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }
}
