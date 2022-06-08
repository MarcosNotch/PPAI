package grupo4.demo.domain;


import lombok.Data;

import java.util.Date;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class CambioEstadoRT {

    private Date _fechaHoraDesde;
    private Date _fechaHoraHasta;
    private Estado _estado;

    public CambioEstadoRT(Date fechaHoraDesde,Date fechaHoraHasta, Estado estado){
        _fechaHoraDesde = fechaHoraDesde;
        _fechaHoraHasta = fechaHoraHasta;
        _estado = estado
    }
    public Boolean esActual(){
        if (_estado.getNombre == 'Actual' ){
            return true
        }
        return false
    }
    public Boolean esDisponible(){
        if (_estado.getNombre == 'Disponible' ){
            return true
        }
        return false
    }


    
}
