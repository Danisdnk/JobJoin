package Controllers;

import Models.Tarea;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareaController {

    @RequestMapping (value = "tarea/{id}")
    public Tarea getTarea (Integer id){
        Tarea tarea = new Tarea();
        tarea.setDescTarea("Desarrollo de paginas web");
        return tarea;
    }

    @RequestMapping (value = "tarea")
    public Tarea editarTarea (){
        Tarea tarea = new Tarea();
        tarea.setDescTarea("Desarrollo de paginas web");
        return tarea;
    }

    @RequestMapping (value = "tarea")
    public Tarea eliminarTarea (){
        Tarea tarea = new Tarea();
        tarea.setDescTarea("Desarrollo de paginas web");
        return tarea;
    }
}
