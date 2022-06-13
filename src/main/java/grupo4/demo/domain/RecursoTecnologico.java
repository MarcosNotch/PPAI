package grupo4.demo.domain;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class RecursoTecnologico {

    private int numeroRt;
    private TipoRecursoTecnologico tipoDeRT;
    private Modelo modeloDelRT;
    private List<CambioEstadoRT> cambiosEstadosRT;
    private List<Turno> turnos;

    public Boolean estaDisponible(){

        return false;
    }

    public Boolean esDisponible(){
        return false;
    }

    public void actualizarEstadoRT(){

    }
}
