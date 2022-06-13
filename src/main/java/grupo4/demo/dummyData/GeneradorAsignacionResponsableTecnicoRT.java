package grupo4.demo.dummyData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import grupo4.demo.domain.AsignacionResponsableTecnicoRT;
import grupo4.demo.domain.PersonalCientifico;
import grupo4.demo.domain.RecursoTecnologico;

public class GeneradorAsignacionResponsableTecnicoRT {
    public static List<AsignacionResponsableTecnicoRT> generarAsignacionesResponsableTecnicoRT() {
        List<AsignacionResponsableTecnicoRT> asignacionesResponsableTecnicoRT = new ArrayList<>();
        List<RecursoTecnologico> recursosTecnologicos = GeneradorRecursoTecnologico.generarRecursosTecnologicos();
        
        // ----------------------------------------------------------------------------------------------------------------- asignacionResponsableTecnicoRT1
        AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT1 = new AsignacionResponsableTecnicoRT();
        asignacionResponsableTecnicoRT1.setRecursosTecnologicos(recursosTecnologicos.subList(0, 2));
        asignacionResponsableTecnicoRT1.setPersonalCientifico(GeneradorPersonalCientifico.generarPersonalCientifico());
        asignacionResponsableTecnicoRT1.setFechaDesde(LocalDate.of(2022, 5, 30));
        asignacionResponsableTecnicoRT1.setFechaHasta(LocalDate.of(2022, 5, 31));

        asignacionesResponsableTecnicoRT.add(asignacionResponsableTecnicoRT1);

        // ----------------------------------------------------------------------------------------------------------------- asignacionResponsableTecnicoRT2
        AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT2 = new AsignacionResponsableTecnicoRT();
        asignacionResponsableTecnicoRT2.setRecursosTecnologicos(recursosTecnologicos.subList(2, 4));
        asignacionResponsableTecnicoRT2.setPersonalCientifico(GeneradorPersonalCientifico.generarPersonalCientifico());
        asignacionResponsableTecnicoRT2.setFechaDesde(LocalDate.of(2022, 5, 30));
        asignacionResponsableTecnicoRT2.setFechaHasta(LocalDate.of(2022, 5, 31));

        asignacionesResponsableTecnicoRT.add(asignacionResponsableTecnicoRT2);

        // ----------------------------------------------------------------------------------------------------------------- asignacionResponsableTecnicoRT3
        AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT3 = new AsignacionResponsableTecnicoRT();
        asignacionResponsableTecnicoRT3.setRecursosTecnologicos(recursosTecnologicos.subList(4, 6));
        asignacionResponsableTecnicoRT3.setPersonalCientifico(GeneradorPersonalCientifico.generarPersonalCientifico());
        asignacionResponsableTecnicoRT3.setFechaDesde(LocalDate.of(2022, 5, 30));
        asignacionResponsableTecnicoRT3.setFechaHasta(LocalDate.of(2022, 5, 31));

        asignacionesResponsableTecnicoRT.add(asignacionResponsableTecnicoRT3);

        // ----------------------------------------------------------------------------------------------------------------- asignacionResponsableTecnicoRT4
        AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT4 = new AsignacionResponsableTecnicoRT();
        asignacionResponsableTecnicoRT4.setRecursosTecnologicos(recursosTecnologicos.subList(6, 9));
        asignacionResponsableTecnicoRT4.setPersonalCientifico(GeneradorPersonalCientifico.generarPersonalCientifico());
        asignacionResponsableTecnicoRT4.setFechaDesde(LocalDate.of(2022, 5, 30));
        asignacionResponsableTecnicoRT4.setFechaHasta(LocalDate.of(2022, 5, 31));

        asignacionesResponsableTecnicoRT.add(asignacionResponsableTecnicoRT4);
        
        // ----------------------------------------------------------------------------------------------------------------- asignacionResponsableTecnicoRT5
        AsignacionResponsableTecnicoRT asignacionResponsableTecnicoRT5 = new AsignacionResponsableTecnicoRT();
        asignacionResponsableTecnicoRT5.setRecursosTecnologicos(recursosTecnologicos.subList(9, 10));
        asignacionResponsableTecnicoRT5.setPersonalCientifico(GeneradorPersonalCientifico.generarPersonalCientifico());
        asignacionResponsableTecnicoRT5.setFechaDesde(LocalDate.of(2022, 5, 30));
        asignacionResponsableTecnicoRT5.setFechaHasta(LocalDate.of(2022, 5, 31));

        asignacionesResponsableTecnicoRT.add(asignacionResponsableTecnicoRT5);
        return asignacionesResponsableTecnicoRT;
    }
}
