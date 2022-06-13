package grupo4.demo.dummyData;

import grupo4.demo.domain.Caracteristica;

public class GeneradorCaracteristica {
    public static Caracteristica generarCaracteristica(String nombre) {
        Caracteristica caracteristica = new Caracteristica();
        caracteristica.setNombre(nombre);
        caracteristica.setDescripcion("Descripcion de " + nombre);
        return caracteristica;
    }
}
