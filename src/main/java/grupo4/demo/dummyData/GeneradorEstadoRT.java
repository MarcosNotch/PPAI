package grupo4.demo.dummyData;

import grupo4.demo.domain.Estado;

public class GeneradorEstadoRT {
    public static Estado generarEstadoDisponible() {
        Estado estado = new Estado();
        estado.setNombre("Disponible");
        estado.setDescripcion("Descripción del estado disponible");
        estado.setAmbito("RT");
        return estado;
    }

    public static Estado generarEstadoPendiente()
    {
        Estado estado = new Estado();
        estado.setNombre("Pendiente");
        estado.setDescripcion("Descripción del estado pendiente");
        estado.setAmbito("RT");
        return estado;
    }

    public static Estado generarEstadoNoDisponible()
    {
        Estado estado = new Estado();
        estado.setNombre("No disponible");
        estado.setDescripcion("Descripción del estado no disponible");
        estado.setAmbito("RT");
        return estado;
    }
}
