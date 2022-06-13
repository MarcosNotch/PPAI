package grupo4.demo.domain;
import java.time.LocalDateTime;

import lombok.Data;

// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class Sesion {
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Usuario usuarioLogueado;

}
