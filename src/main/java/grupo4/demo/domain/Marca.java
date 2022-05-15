package grupo4.demo.domain;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Marca {
    private String marca;
    private ArrayList<Modelo> modelos;

    public boolean sosMarca(String marca)
    {
        return false;
    }

}
