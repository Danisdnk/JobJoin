package models;

import dal.Identificable;

import java.util.List;

public class Empresa implements Identificable {
    private Integer id;
    private Integer cuit;
    private String razonSocial;
    private String correoElectronico;
    private String whatsapp;

    public Empresa(Integer cuit, String razonSocial, String correoElectronico, String whatsapp) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.correoElectronico = correoElectronico;
        this.whatsapp = whatsapp;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void setID(int id) {

    }
}
