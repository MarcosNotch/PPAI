package grupo4.demo.dummyData;
import java.time.LocalDateTime;
import grupo4.demo.domain.CambioEstadoRT;
import grupo4.demo.domain.Estado;

public class GeneradorCambioEstadoRT {
    public static CambioEstadoRT generarCambioEstadoPendiente(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta)
    {
        Estado estadoPendiente = GeneradorEstadoRT.generarEstadoPendiente();
        CambioEstadoRT cambioEstadoRT = new CambioEstadoRT();
        cambioEstadoRT.setEstado(estadoPendiente);
        cambioEstadoRT.setFechaHoraDesde(fechaHoraDesde);
        cambioEstadoRT.setFechaHoraHasta(fechaHoraHasta);
        return cambioEstadoRT;
    }

    public static CambioEstadoRT generarCambioEstadoDisponible(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta)
    {
        Estado estadoDisponible = GeneradorEstadoRT.generarEstadoDisponible();
        CambioEstadoRT cambioEstadoRT = new CambioEstadoRT();
        cambioEstadoRT.setEstado(estadoDisponible);
        cambioEstadoRT.setFechaHoraDesde(fechaHoraDesde);
        cambioEstadoRT.setFechaHoraHasta(fechaHoraHasta);
        return cambioEstadoRT;
    }

    public static CambioEstadoRT generarCambioEstadoNoDisponible(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta)
    {
        Estado estadoNoDisponible = GeneradorEstadoRT.generarEstadoNoDisponible();
        CambioEstadoRT cambioEstadoRT = new CambioEstadoRT();
        cambioEstadoRT.setEstado(estadoNoDisponible);
        cambioEstadoRT.setFechaHoraDesde(fechaHoraDesde);
        cambioEstadoRT.setFechaHoraHasta(fechaHoraHasta);
        return cambioEstadoRT;
    }
}
