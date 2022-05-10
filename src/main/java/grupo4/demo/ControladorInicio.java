package grupo4.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensaje de ejemplo";

        model.addAttribute("mensaje", mensaje);

        return "index";
    }


}
