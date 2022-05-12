package grupo4.demo.domain;


import lombok.Data;

import java.util.ArrayList;

@Data
public class GestorMantenimiento {


    private String usuarioLogueado;
    private ArrayList<AsiganacionResponsableTecnicoRT> asiganacionesResponsablesTecnicosRT;
    private ArrayList<RecursoTecnologico> recursosTecnologicos;

    public void  opcionReingresoRTMantCorrectivo(){}

    public void buscarRTParaUsrLogueado(){}

    public void tomarSeleccionDeRT(){}

    public void tomarDatosInhabilitacionRT(){}

    public void tomarConfirmacionIngresoMantenimiento(){}

    public void buscarRecursosTecnologicosDisponibles(){}

    public void validarTurnos(){}

    public void generarMantenimientoCorrectivo(){}

    public void notificarCientificos(){}

    public void finCU(){}





}
