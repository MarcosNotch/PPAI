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
//package grupo4.demo;
//import java.util.ArrayList;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import grupo4.demo.domain.Usuario;
//
//@Controller
//public class ControladorInicio {
//    @GetMapping("/")
//    public String inicio1(Model model){
//        Usuario usr0 = new Usuario();
//        usr0.setUsuario("usuario0");
//        usr0.setContraseña("contraseña0");
//
//        Usuario usr1 = new Usuario();
//        usr1.setUsuario("usuario1");
//        usr1.setContraseña("contraseña1");
//
//        ArrayList<Usuario> usuarios = new ArrayList<>();
//        usuarios.add(usr0);
//        usuarios.add(usr1);
//
//        model.addAttribute("mensaje", usr0.getUsuario());
//        return "index";
//    }
//}

//------------------------------------------------------------------------ Version 3
 package grupo4.demo;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;
 import grupo4.demo.domain.Usuario;

 @Controller
 public class ControladorInicio {

     @GetMapping("/")
     public String inicio(Model model){
         var mensaje = "Mensaje de ejemplo";

         model.addAttribute("mensaje", mensaje);

         Usuario usr0 = new Usuario();
         usr0.setUsuario("usuario0");
         usr0.setContraseña("contraseña0");

         Usuario usr1 = new Usuario();
         usr1.setUsuario("usuario1");
         usr1.setContraseña("contraseña1");

         List<Usuario> usuarios = new ArrayList<>();
         usuarios.add(usr0);
         usuarios.add(usr1);

         model.addAttribute("usuarios", usuarios);

         return "index";
     }
 }




