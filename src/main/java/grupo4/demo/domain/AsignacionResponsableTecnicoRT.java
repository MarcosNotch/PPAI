package grupo4.demo.domain;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class AsignacionResponsableTecnicoRT {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private List<RecursoTecnologico> recursosTecnologicos;
    private PersonalCientifico personalCientifico;

    public boolean esDeUsuario(Usuario usuario)
    {
        return personalCientifico.esDeUsuario();
    }

    public boolean esDeCI(String nombreCI)
    {
        // Valida si PersonalCientifico es del CI
        // No sé si hace falta para el CU
        return false;
    }

    public List<RecursoTecnologico> getRecursosTecnologicosDisponibles()
    {
        List<RecursoTecnologico> recursos = new ArrayList<>();

        for(RecursoTecnologico recurso : recursosTecnologicos){
            if(recurso.estaDisponible()){
                recursos.add(recurso);
            }
        }

        return recursos;
    }
}
