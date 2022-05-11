package grupo4.demo.domain;

import lombok.Data;

@Data
public class PersonalCientifico {
    private int legajo;
    private String nombre;
    private String apellido;
    private Usuario usuario;

    public boolean esDeUsuario()
    {
        return false;
    }
}
