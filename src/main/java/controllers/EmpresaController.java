package controllers;

import dal.RepoFactory;
import dal.Repository;
import models.Empresa;

import java.util.List;

public class EmpresaController {

    private static EmpresaController instancia;

    private Repository<Empresa> RepoEmpresa;

    private EmpresaController() {
        this.RepoEmpresa = RepoFactory.getRepoEmpresa();
    }

    public List<Empresa> getEmpresa() {
        return this.RepoEmpresa.getTodos();
    }

    public Empresa getEmpresaByID(int id) {
        return this.RepoEmpresa.getByID(id);
    }

    public void agregarEmpresa(Empresa empresa) {
        this.RepoEmpresa.insertar(empresa);
    }

    public static EmpresaController getInstancia() {
        if (instancia == null) {
            instancia = new EmpresaController();
        }

        return instancia;
    }
}