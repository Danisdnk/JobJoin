package JobJoin;

import controllers.BolsaDeTrabajoController;

import java.util.Scanner;

public class menuConsola {

    private BolsaDeTrabajoController controlador;

    public void iniciar() {

        this.controlador = BolsaDeTrabajoController.getInstancia();

        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese una opcion de 1 a 4: ");
        int opcion= sc.nextInt();


        switch (opcion){
            case 1: controlador.generarInformeMasPostulantes();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
