package grupo4.demo.dummyData;
import java.time.LocalDateTime;
import grupo4.demo.domain.CambioEstadoTurno;
import grupo4.demo.domain.Estado;

public class GeneradorCambioEstadoTurno {
    public static CambioEstadoTurno generarCambioEstadoDisponible(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta){
        Estado estadoDisponible = GeneradorEstadoTurno.generarEstadoDisponible();
        CambioEstadoTurno cambioEstadoTurno = new CambioEstadoTurno();
        cambioEstadoTurno.setEstado(estadoDisponible);
        cambioEstadoTurno.setFechaHoraDesde(fechaHoraDesde);
        cambioEstadoTurno.setFechaHoraHasta(fechaHoraHasta);
        return cambioEstadoTurno;
    }

    public static CambioEstadoTurno generarCambioEstadoConfirmado(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta)
    {
        Estado estadoConfirmado = GeneradorEstadoTurno.generarEstadoConfirmado();
        CambioEstadoTurno cambioEstadoTurno = new CambioEstadoTurno();
        cambioEstadoTurno.setEstado(estadoConfirmado);
        cambioEstadoTurno.setFechaHoraDesde(fechaHoraDesde);
        cambioEstadoTurno.setFechaHoraHasta(fechaHoraHasta);
        return cambioEstadoTurno;
    }

    public static CambioEstadoTurno generarCambioEstadoPendiente(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta)
    {
        Estado estadoPendiente = GeneradorEstadoTurno.generarEstadoPendiente();
        CambioEstadoTurno cambioEstadoTurno = new CambioEstadoTurno();
        cambioEstadoTurno.setEstado(estadoPendiente);
        cambioEstadoTurno.setFechaHoraDesde(fechaHoraDesde);
        cambioEstadoTurno.setFechaHoraHasta(fechaHoraHasta);
        return cambioEstadoTurno;
    }
}
