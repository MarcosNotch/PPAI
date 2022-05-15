package grupo4.demo.domain;

import lombok.Data;

@Data
public class Modelo {
    private String nombre;

    public boolean esDeMarca(String Marca)
    {
        // Valida si Modelo es de Marca
        return false;
    }

    public void mostrarModelo()
    {

    }
}
