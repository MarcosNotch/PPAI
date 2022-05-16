package grupo4.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import grupo4.demo.domain.GestorMantenimiento;

@Controller
public class PantallaIngresoMantenimientoCorrectivo {

    private boolean cuVisible = false; 
    private GestorMantenimiento gestorMantenimiento;

    @GetMapping("/")
    public String iniciar(Model model){
        return "index";
    }

    @GetMapping("/reg-ingreso")
    public String opcionRegIngresoRTMantCorrectivo(Model model)
    {
        habilitarPantalla(model);
        this.gestorMantenimiento = new GestorMantenimiento();

        // Pedir al gestor que busque los RT disponibles para el usuario logueado
        // Se le pasa al gestor el puntero de la pantalla y del objecto Model
        gestorMantenimiento.buscarRTParaUsrLogueado(this, model);

        return "index";
    }

    public void habilitarPantalla(Model model)
    {
        // Hacer visible los elementos necesarios para el CU
        cuVisible = true;
        model.addAttribute("cuVisible", cuVisible);
    }

    public void mostrarRecursosTecnologicos(Model model, String datosRecursos[][])
    {
        // Recibir lo datos de los recursos tecnológicos que envía el gestor para mostrarlos en la tabla
        // datosRecursos es una matriz de la forma:
        //String datosRecursos [][] = {
        //     {"tipo de RT 1", "numero RT 1", "Marca 1", "Modelo 1"},
        //     {"tipo de RT 2", "numero RT 1", "Marca 1", "Modelo 1"},
        //                             ...
        //     {"tipo de RT n", "numero RT n", "Marca n", "Modelo n"},
        //};

        model.addAttribute("datosRecursos", datosRecursos);
        solicitarSeleccionDeRT(); // No le encontré utilidad a este método
    }

    public void solicitarSeleccionDeRT()
    {
        // ??
    }

    @PostMapping("/reg-ingreso/seleccion-rt")
    public String tomarSeleccionDeRT(Model model, @RequestBody int index)
    {
        // Recibir el índice de la fila seleccionada y enviarla al gestor
        System.out.println("tomarSelecciónRT: " + index);
        gestorMantenimiento.tomarSeleccionDeRT(index);
        return "index";
    }

    public void solicitarFechaPrevistaYRazonInhab(){

    }

    public void tomarDatosInhabilitacionRT()
    {

    }

    public void mostrarTurnos()
    {

    }

    public void solicitarConfirmacionIngresoMantenimiento()
    {

    }

    public void solicitarOpcionesDeNotificacion()
    {

    }

    public void tomarConfirmacionIngresoMantenimiento()
    {

    }
}



