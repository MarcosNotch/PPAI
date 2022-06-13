package grupo4.demo.domain;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class Turno {

    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private List<CambioEstadoTurno> cambiosEstadoTurno;

    public void addCambioEstado(CambioEstadoTurno cambioEstado)
    {
        this.cambiosEstadoTurno.add(cambioEstado);
    }

    public Boolean estaDisponibleEnFecha(){
        return false;
    }

    public Boolean estaConfirmadoOPendienteConfirmacion(){
        return false;
    }

    public void mostrarCientificoDelCL(){

    }

    public void actualizarEstadoTurno(){

    }


}
