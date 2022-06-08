package grupo4.demo.domain;


import lombok.Data;

import java.util.Date;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class CambioEstadoTurno {

    private Date _fechaHoraDesde;
    private Date _fechaHoraHasta;
    private Estado _estado;

    public CambioEstadoTurno(){
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
    public Estado misTurnos(){
        return _estado
    }
    public Boolean esDisponible(){
        if (_estado.getNombre == 'Disponible' ){
            return trueo
        }
        return false
    }
    public Boolean esConfirmado(){
        if (_estado.getNombre == 'Confirmado' ){
            return true
        }
        return false
    }


    
}
