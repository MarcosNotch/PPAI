package grupo4.demo.dummyData;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import grupo4.demo.domain.CambioEstadoRT;
import grupo4.demo.domain.Modelo;
import grupo4.demo.domain.RecursoTecnologico;
import grupo4.demo.domain.TipoRecursoTecnologico;
import grupo4.demo.domain.Turno;

public class GeneradorRecursoTecnologico {
    static public List<RecursoTecnologico> generarRecursosTecnologicos()
    {
        // Crear una lista de modelos para todos los recursos tecnologicos
        List<Modelo> modelos = GeneradorModelo.generarModelos();
        List<Turno> turnos = GeneradorTurno.generarTurnos();
        

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 1
        TipoRecursoTecnologico tipoRecursoTecnologico1 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 1");

        CambioEstadoRT cambioEstado1PendienteRT1 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 14, 14, 15), 
            LocalDateTime.of(2022, 5, 15, 12, 30));
        
        CambioEstadoRT cambioEstado2DisponibleRT1 = GeneradorCambioEstadoRT.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 5, 15, 12, 30),
            null);

        ArrayList<CambioEstadoRT> cambiosEstados1 = new ArrayList<>();
        cambiosEstados1.add(cambioEstado1PendienteRT1);
        cambiosEstados1.add(cambioEstado2DisponibleRT1);

        RecursoTecnologico recursoTecnologico1 = new RecursoTecnologico();
        recursoTecnologico1.setNumeroRt(1);
        recursoTecnologico1.setTipoDeRT(tipoRecursoTecnologico1);
        recursoTecnologico1.setModeloDelRT(modelos.get(0));
        recursoTecnologico1.setCambiosEstadosRT(cambiosEstados1);
        recursoTecnologico1.setTurnos(turnos.subList(0, 1));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 2
        TipoRecursoTecnologico tipoRecursoTecnologico2 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 2");
        CambioEstadoRT cambioEstado1PendienteRT2 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 5, 14, 15), 
            LocalDateTime.of(2022, 5, 7, 12, 30));

        CambioEstadoRT cambioEstado3NoDisponibleRT2 = GeneradorCambioEstadoRT.generarCambioEstadoNoDisponible(
            LocalDateTime.of(2022, 5, 7, 12, 30),
            LocalDateTime.of(2022, 5, 12, 13, 30));
        
        CambioEstadoRT cambioEstado4DisponibleRT2 = GeneradorCambioEstadoRT.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 5, 12, 13, 30),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados2 = new ArrayList<>();
        cambiosEstados2.add(cambioEstado1PendienteRT2);
        cambiosEstados2.add(cambioEstado3NoDisponibleRT2);
        cambiosEstados2.add(cambioEstado4DisponibleRT2);

        RecursoTecnologico recursoTecnologico2 = new RecursoTecnologico();
        recursoTecnologico2.setNumeroRt(2);
        recursoTecnologico2.setTipoDeRT(tipoRecursoTecnologico2);
        recursoTecnologico2.setModeloDelRT(modelos.get(1));
        recursoTecnologico2.setCambiosEstadosRT(cambiosEstados2);
        recursoTecnologico2.setTurnos(turnos.subList(1, 2));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 3
        TipoRecursoTecnologico tipoRecursoTecnologico3 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 3");
        CambioEstadoRT cambioEstado1PendienteRT3 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 1, 14, 15), 
            LocalDateTime.of(2022, 5, 1, 12, 30));
        
        CambioEstadoRT cambioEstado2NoDisponibleRT3 = GeneradorCambioEstadoRT.generarCambioEstadoNoDisponible(
            LocalDateTime.of(2022, 5, 1, 12, 30),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados3 = new ArrayList<>();
        cambiosEstados3.add(cambioEstado1PendienteRT3);
        cambiosEstados3.add(cambioEstado2NoDisponibleRT3);

        RecursoTecnologico recursoTecnologico3 = new RecursoTecnologico();
        recursoTecnologico3.setNumeroRt(3);
        recursoTecnologico3.setTipoDeRT(tipoRecursoTecnologico3);
        recursoTecnologico3.setModeloDelRT(modelos.get(2));
        recursoTecnologico3.setCambiosEstadosRT(cambiosEstados3);
        recursoTecnologico3.setTurnos(turnos.subList(2, 4)); 
        
        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 4
        TipoRecursoTecnologico tipoRecursoTecnologico4 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 4");
        CambioEstadoRT cambioEstado1PendienteRT4 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 14, 10, 15), 
            LocalDateTime.of(2022, 5, 16, 12, 30));
        
        CambioEstadoRT cambioEstado2DisponibleRT4 = GeneradorCambioEstadoRT.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 5, 16, 12, 30),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados4 = new ArrayList<>();
        cambiosEstados4.add(cambioEstado1PendienteRT4);
        cambiosEstados4.add(cambioEstado2DisponibleRT4);

        RecursoTecnologico recursoTecnologico4 = new RecursoTecnologico();
        recursoTecnologico4.setNumeroRt(4);
        recursoTecnologico4.setTipoDeRT(tipoRecursoTecnologico4);
        recursoTecnologico4.setModeloDelRT(modelos.get(3));
        recursoTecnologico4.setCambiosEstadosRT(cambiosEstados4);
        recursoTecnologico4.setTurnos(turnos.subList(4, 5));

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 5
        TipoRecursoTecnologico tipoRecursoTecnologico5 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 5");
        CambioEstadoRT cambioEstado1PendienteRT5 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 11, 11, 23), 
            null);

        ArrayList<CambioEstadoRT> cambiosEstados5 = new ArrayList<>();
        cambiosEstados5.add(cambioEstado1PendienteRT5);

        RecursoTecnologico recursoTecnologico5 = new RecursoTecnologico();
        recursoTecnologico5.setNumeroRt(5);
        recursoTecnologico5.setTipoDeRT(tipoRecursoTecnologico5);
        recursoTecnologico5.setModeloDelRT(modelos.get(4));
        recursoTecnologico5.setCambiosEstadosRT(cambiosEstados5);

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 6
        TipoRecursoTecnologico tipoRecursoTecnologico6 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 6");
        CambioEstadoRT cambioEstado1PendienteRT6 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 8, 19, 16),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados6 = new ArrayList<>();
        cambiosEstados6.add(cambioEstado1PendienteRT6);

        RecursoTecnologico recursoTecnologico6 = new RecursoTecnologico();
        recursoTecnologico6.setNumeroRt(6);
        recursoTecnologico6.setTipoDeRT(tipoRecursoTecnologico6);
        recursoTecnologico6.setModeloDelRT(modelos.get(5));
        recursoTecnologico6.setCambiosEstadosRT(cambiosEstados6);

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 7
        TipoRecursoTecnologico tipoRecursoTecnologico7 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 7");
        CambioEstadoRT cambioEstado1PendienteRT7 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 16, 10, 15), 
            LocalDateTime.of(2022, 5, 17, 16, 15));
        
        CambioEstadoRT cambioEstado2DisponibleRT7 = GeneradorCambioEstadoRT.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 5, 17, 16, 15),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados7 = new ArrayList<>();
        cambiosEstados7.add(cambioEstado1PendienteRT7);
        cambiosEstados7.add(cambioEstado2DisponibleRT7);

        RecursoTecnologico recursoTecnologico7 = new RecursoTecnologico();
        recursoTecnologico7.setNumeroRt(7);
        recursoTecnologico7.setTipoDeRT(tipoRecursoTecnologico7);
        recursoTecnologico7.setModeloDelRT(modelos.get(6));
        recursoTecnologico7.setCambiosEstadosRT(cambiosEstados7);

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 8
        TipoRecursoTecnologico tipoRecursoTecnologico8 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 8");
        CambioEstadoRT cambioEstado1PendienteRT8 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 5, 18, 12), 
            LocalDateTime.of(2022, 5, 6, 18, 45));
        
        CambioEstadoRT cambioEstado2NoDisponibleRT8 = GeneradorCambioEstadoRT.generarCambioEstadoNoDisponible(
            LocalDateTime.of(2022, 5, 6, 18, 45),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados8 = new ArrayList<>();
        cambiosEstados8.add(cambioEstado1PendienteRT8);
        cambiosEstados8.add(cambioEstado2NoDisponibleRT8);

        RecursoTecnologico recursoTecnologico8 = new RecursoTecnologico();
        recursoTecnologico8.setNumeroRt(8);
        recursoTecnologico8.setTipoDeRT(tipoRecursoTecnologico8);
        recursoTecnologico8.setModeloDelRT(modelos.get(7));
        recursoTecnologico8.setCambiosEstadosRT(cambiosEstados8);

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 9
        TipoRecursoTecnologico tipoRecursoTecnologico9 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 9");
        CambioEstadoRT cambioEstado1PendienteRT9 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 17, 10, 15), 
            LocalDateTime.of(2022, 5, 18, 16, 15));
        
        CambioEstadoRT cambioEstado2DisponibleRT9 = GeneradorCambioEstadoRT.generarCambioEstadoDisponible(
            LocalDateTime.of(2022, 5, 18, 16, 15),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados9 = new ArrayList<>();
        cambiosEstados9.add(cambioEstado1PendienteRT9);
        cambiosEstados9.add(cambioEstado2DisponibleRT9);

        RecursoTecnologico recursoTecnologico9 = new RecursoTecnologico();
        recursoTecnologico9.setNumeroRt(9);
        recursoTecnologico9.setTipoDeRT(tipoRecursoTecnologico9);
        recursoTecnologico9.setModeloDelRT(modelos.get(8));
        recursoTecnologico9.setCambiosEstadosRT(cambiosEstados9);

        // ---------------------------------------------------------------------------------------------------------------------- Recurso tecnologico 10
        TipoRecursoTecnologico tipoRecursoTecnologico10 = GeneradorTipoRecursoTecnologico.generarTipoRecursoTecnologico("Tipo de RT 10");
        CambioEstadoRT cambioEstado1PendienteRT10 = GeneradorCambioEstadoRT.generarCambioEstadoPendiente(
            LocalDateTime.of(2022, 5, 20, 8, 40), 
            LocalDateTime.of(2022, 5, 20, 11, 50));
        
        CambioEstadoRT cambioEstado2NoDisponibleRT10 = GeneradorCambioEstadoRT.generarCambioEstadoNoDisponible(
            LocalDateTime.of(2022, 5, 20, 11, 50),
            null);
        
        ArrayList<CambioEstadoRT> cambiosEstados10 = new ArrayList<>();
        cambiosEstados10.add(cambioEstado1PendienteRT10);
        cambiosEstados10.add(cambioEstado2NoDisponibleRT10);

        RecursoTecnologico recursoTecnologico10 = new RecursoTecnologico();
        recursoTecnologico10.setNumeroRt(10);
        recursoTecnologico10.setTipoDeRT(tipoRecursoTecnologico10);
        recursoTecnologico10.setModeloDelRT(modelos.get(9));
        recursoTecnologico10.setCambiosEstadosRT(cambiosEstados10);

        // ------------------------------------------------------------------------------------------------------------------
        ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
        recursosTecnologicos.add(recursoTecnologico1);
        recursosTecnologicos.add(recursoTecnologico2);
        recursosTecnologicos.add(recursoTecnologico3);
        recursosTecnologicos.add(recursoTecnologico4);
        recursosTecnologicos.add(recursoTecnologico5);

        return recursosTecnologicos;
    }
}
