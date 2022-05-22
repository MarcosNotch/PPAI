package grupo4.demo.domain;

import lombok.Data;

import java.util.ArrayList;

@Data
public class RecursoTecnologico {

    private int numeroRt;
    private TipoRecursoTecnologico tipoDeRT;
    private Modelo modeloDelRT;
    private ArrayList<CambioEstadoRT> cambioEstadoRT;
    private ArrayList<Turno> turnos;


    public Boolean estaDisponible(){

        return false;
    }


    public Boolean esDisponible(){

        return false;
    }

    public void actualizarEstadoRT(){


    }

}
