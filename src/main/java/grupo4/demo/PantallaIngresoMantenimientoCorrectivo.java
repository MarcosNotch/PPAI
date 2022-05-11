//------------------------------------------------------------------------ Version 1
// package grupo4.demo;
//
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
//
// @Controller
// public class ControladorInicio {
//
//     @GetMapping("/")
//     public String inicio(Model model){
//         var mensaje = "Mensaje de ejemplo";
//         model.addAttribute("mensaje", mensaje);
//
//         return "index";
//     }
// }

//------------------------------------------------------------------------ Version 2
package grupo4.demo;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;

@Controller
 public class PantallaIngresoMantenimientoCorrectivo {

     @GetMapping("/")
     public String iniciar(Model model){

         return "index";
     }

     public void opcionRegIngresoRTMantCorrectivo()
     {

     }

     public void habilitarPantalla()
     {

     }

     public void mostrarRecursosTecnologicos()
     {

     }

     public void solicitarSeleccionDeRT()
     {

     }

     public void tomarSeleccionDeRT()
     {

     }

     public void solicitarFechaPrevistaYRazonInhab()
     {

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



