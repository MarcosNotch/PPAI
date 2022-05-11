package grupo4.demo.domain;
import lombok.Data;

// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class Usuario {
    public String usuario;
    public String contraseña;
}
