package grupo4.demo.domain;
import java.time.LocalDateTime;

import lombok.Data;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class CambioEstadoTurno {

    private LocalDateTime fechaHoraDesde;
    private LocalDateTime fechaHoraHasta;
    private Estado estado;

    public CambioEstadoTurno(){}

    public CambioEstadoTurno(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta, Estado estado){
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.estado = estado;
    }
    public Boolean esActual(){
        if (estado.getNombre() == "Actual" ){
            return true;
        }
        return false;
    }
    public Estado misTurnos(){
        return estado;
    }
    public Boolean esDisponible(){
        if (estado.getNombre() == "Disponible" ){
            return true;
        }
        return false;
    }
    public Boolean esConfirmado(){
        if (estado.getNombre() == "Confirmado" ){
            return true;
        }
        return false;
    }


    
}
