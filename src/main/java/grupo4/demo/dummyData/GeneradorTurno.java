package grupo4.demo.dummyData;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import grupo4.demo.domain.CambioEstadoTurno;
import grupo4.demo.domain.Turno;

public class GeneradorTurno {

    public static List<Turno> generarTurnos() {
        List<Turno> turnos = new ArrayList<Turno>();
        // ------------------------------------------------------------------------------------------------- Turno 1
        CambioEstadoTurno cambioEstado1T1 = GeneradorCambioEstadoTurno.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 05, 02, 14, 53), 
            LocalDateTime.of(2022, 05, 02, 18, 51));

        CambioEstadoTurno cambioEstado2T1 = GeneradorCambioEstadoTurno.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 05, 02, 18, 51), 
            LocalDateTime.of(2022, 05, 04, 18, 23));

        CambioEstadoTurno cambioEstado3T1 = GeneradorCambioEstadoTurno.generarCambioEstadoConfirmado(
            LocalDateTime.of(2022, 05, 04, 18, 23), 
            null);

        ArrayList<CambioEstadoTurno> cambiosEstadosTurno1 = new ArrayList<CambioEstadoTurno>();
        cambiosEstadosTurno1.add(cambioEstado1T1);
        cambiosEstadosTurno1.add(cambioEstado2T1);
        cambiosEstadosTurno1.add(cambioEstado3T1);

        Turno turno1 = new Turno();
        turno1.setFechaHoraInicio(LocalDateTime.of(2022, 05, 31, 18, 0));
        turno1.setFechaHoraFin(LocalDateTime.of(2022, 05, 31, 20, 0));
        turno1.setCambiosEstadoTurno(cambiosEstadosTurno1);

        turnos.add(turno1);

        // ------------------------------------------------------------------------------------------------- Turno 2
        CambioEstadoTurno cambioEstado1T2 = GeneradorCambioEstadoTurno.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 05, 01, 10, 53), 
            LocalDateTime.of(2022, 05, 03, 18, 51));
        
        CambioEstadoTurno cambioEstado2T2 = GeneradorCambioEstadoTurno.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 05, 03, 18, 51), 
            LocalDateTime.of(2022, 05, 05, 15, 23));
        
        CambioEstadoTurno cambioEstado3T2 = GeneradorCambioEstadoTurno.generarCambioEstadoConfirmado(
            LocalDateTime.of(2022, 05, 05, 15, 23), 
            null);
        
        ArrayList<CambioEstadoTurno> cambiosEstadosTurno2 = new ArrayList<CambioEstadoTurno>();
        cambiosEstadosTurno2.add(cambioEstado1T2);
        cambiosEstadosTurno2.add(cambioEstado2T2);
        cambiosEstadosTurno2.add(cambioEstado3T2);

        Turno turno2 = new Turno();
        turno2.setFechaHoraInicio(LocalDateTime.of(2022, 06, 1, 18, 0));
        turno2.setFechaHoraFin(LocalDateTime.of(2022, 06, 1, 20, 0));
        turno2.setCambiosEstadoTurno(cambiosEstadosTurno2);

        turnos.add(turno2);

        // ------------------------------------------------------------------------------------------------- Turno 3
        CambioEstadoTurno cambioEstado1T3 = GeneradorCambioEstadoTurno.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 05, 10, 11, 53), 
            LocalDateTime.of(2022, 05, 11, 18, 23));

        CambioEstadoTurno cambioEstado2T3 = GeneradorCambioEstadoTurno.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 05, 11, 18, 23), 
            LocalDateTime.of(2022, 05, 12, 20, 01));
        
        CambioEstadoTurno cambioEstado3T3 = GeneradorCambioEstadoTurno.generarCambioEstadoConfirmado(
            LocalDateTime.of(2022, 05, 12, 20, 01), 
            null);
        
        ArrayList<CambioEstadoTurno> cambiosEstadosTurno3 = new ArrayList<CambioEstadoTurno>();
        cambiosEstadosTurno3.add(cambioEstado1T3);
        cambiosEstadosTurno3.add(cambioEstado2T3);
        cambiosEstadosTurno3.add(cambioEstado3T3);

        Turno turno3 = new Turno();
        turno3.setFechaHoraInicio(LocalDateTime.of(2022, 06, 2, 14, 0));
        turno3.setFechaHoraFin(LocalDateTime.of(2022, 06, 2, 15, 0));
        turno3.setCambiosEstadoTurno(cambiosEstadosTurno3);

        turnos.add(turno3);

        // ------------------------------------------------------------------------------------------------- Turno 4
        CambioEstadoTurno cambioEstado1T4 = GeneradorCambioEstadoTurno.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 05, 7, 16, 17), 
            LocalDateTime.of(2022, 05, 8, 15, 32));

        CambioEstadoTurno cambioEstado2T4 = GeneradorCambioEstadoTurno.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 8, 15, 32), 
            LocalDateTime.of(2022, 5, 9, 8, 23));

        CambioEstadoTurno cambioEstado3T4 = GeneradorCambioEstadoTurno.generarCambioEstadoConfirmado(
            LocalDateTime.of(2022, 05, 9, 8, 23), 
            null);
        
        ArrayList<CambioEstadoTurno> cambiosEstadosTurno4 = new ArrayList<CambioEstadoTurno>();
        cambiosEstadosTurno4.add(cambioEstado1T4);
        cambiosEstadosTurno4.add(cambioEstado2T4);
        cambiosEstadosTurno4.add(cambioEstado3T4);

        Turno turno4 = new Turno();
        turno4.setFechaHoraInicio(LocalDateTime.of(2022, 06, 3, 14, 0));
        turno4.setFechaHoraFin(LocalDateTime.of(2022, 06, 3, 15, 0));
        turno4.setCambiosEstadoTurno(cambiosEstadosTurno4);

        turnos.add(turno4);

        // ------------------------------------------------------------------------------------------------- Turno 5
        CambioEstadoTurno cambioEstado1T5 = GeneradorCambioEstadoTurno.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 05, 15, 14, 53), 
            LocalDateTime.of(2022, 05, 15, 18, 1));
        
        CambioEstadoTurno cambioEstado2T5 = GeneradorCambioEstadoTurno.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 05, 15, 18, 1), 
            LocalDateTime.of(2022, 05, 18, 9, 45));
        
        CambioEstadoTurno cambioEstado3T5 = GeneradorCambioEstadoTurno.generarCambioEstadoConfirmado(
            LocalDateTime.of(2022, 05, 18, 19, 45), 
            null);
        
        ArrayList<CambioEstadoTurno> cambiosEstadosTurno5 = new ArrayList<CambioEstadoTurno>();
        cambiosEstadosTurno5.add(cambioEstado1T5);
        cambiosEstadosTurno5.add(cambioEstado2T5);
        cambiosEstadosTurno5.add(cambioEstado3T5);

        Turno turno5 = new Turno();
        turno5.setFechaHoraInicio(LocalDateTime.of(2022, 06, 4, 14, 0));
        turno5.setFechaHoraFin(LocalDateTime.of(2022, 06, 4, 15, 0));
        turno5.setCambiosEstadoTurno(cambiosEstadosTurno5);

        turnos.add(turno5);

        return turnos;
    }
}
