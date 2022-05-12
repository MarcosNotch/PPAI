package grupo4.demo.domain;


import lombok.Data;

import java.util.Date;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class Turno {

    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private ArrayList<CambioEstadoTurno> cambioEstadoTurno;

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
