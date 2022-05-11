package grupo4.demo.domain;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class AsignacionResponsableTecnicoRT {
    private Date fechaDesde;
    private Date fechaHasta;
    private ArrayList<RecursoTecnologico> recursos;
    private PersonalCientifico personalCientifico;

    public boolean esDeUsuario(String nombreUsuario)
    {
        return false;
    }

    public boolean esDeCI(String nombreCI)
    {
        // Valida si PersonalCientifico es del CI
        // No sé si hace falta para el CU
        return false;
    }

    public ArrayList<RecursoTecnologico> getRecursosTecnologicosDisponibles()
    {
        ArrayList<RecursoTecnologico> recursos = new ArrayList<>();

        // codigo...

        return recursos;
    }
}
