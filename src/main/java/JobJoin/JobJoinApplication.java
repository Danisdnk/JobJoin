package JobJoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobJoinApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JobJoinApplication.class, args);
		System.out.println("JobJoin");
		InicializadorDeDatos.iniciar();
		System.out.println("Fin carga de Datos");
		new menuConsola().iniciar();


	}

}
