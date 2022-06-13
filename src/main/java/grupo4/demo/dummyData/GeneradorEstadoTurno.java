package grupo4.demo.dummyData;

import grupo4.demo.domain.Estado;

public class GeneradorEstadoTurno {
    public static Estado generarEstadoConfirmado() {
        Estado estado = new Estado();
        estado.setNombre("Confirmado");
        estado.setDescripcion("Descripción del estado confirmado");
        estado.setAmbito("Turno");

        return estado;
    }

    public static Estado generarEstadoDisponible()
    {
        Estado estado = new Estado();
        estado.setNombre("Disponible");
        estado.setDescripcion("Descripción del estado disponible");
        estado.setAmbito("Turno");

        return estado;
    }

    public static Estado generarEstadoPendiente()
    {
        Estado estado = new Estado();
        estado.setNombre("Pendiente");
        estado.setDescripcion("Descripción del estado pendiente");
        estado.setAmbito("Turno");

        return estado;
    }
}
