package grupo4.demo.domain;


import lombok.Data;

import java.util.Date;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class CambioEstadoTurno {

    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private Estado estado;

    public CambioEstadoTurno(){}
    public bool misTurnos(){}
    public bool estaConfirmadoOPendienteConfirmacion(){}
    public Estado getActual(){}
    public bool esConfirmado(){}
    public bool esPendienteDeConfirmacion(){}

    
}
