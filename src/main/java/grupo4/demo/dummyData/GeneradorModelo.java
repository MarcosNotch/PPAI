package grupo4.demo.dummyData;

import java.util.ArrayList;
import java.util.List;
import grupo4.demo.domain.Modelo;

public class GeneradorModelo {
    public static List<Modelo> generarModelos() {
        List<Modelo> modelos = new ArrayList<>();
        
        Modelo modelo1 = new Modelo();
        modelo1.setNombre("Modelo 1");

        Modelo modelo2 = new Modelo();
        modelo2.setNombre("Modelo 2");

        Modelo modelo3 = new Modelo();
        modelo3.setNombre("Modelo 3");

        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        return modelos;
    }

    public static Modelo generarModelo(String nombre)
    {
        Modelo modelo = new Modelo();
        modelo.setNombre(nombre);
        return modelo;
    }
}

