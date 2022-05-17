package grupo4.demo.domain;


import lombok.Data;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import grupo4.demo.PantallaIngresoMantenimientoCorrectivo;

@Data
public class GestorMantenimiento {


    private String usuarioLogueado;
//    private ArrayList<AsiganacionResponsableTecnicoRT> asiganacionesResponsablesTecnicosRT;
    private ArrayList<RecursoTecnologico> recursosTecnologicos;

    public void  opcionReingresoRTMantCorrectivo(){}

    public void buscarRTParaUsrLogueado(PantallaIngresoMantenimientoCorrectivo pantalla, Model model){
        // Datos de prueba
        String datosRecursos [][] = {
            {"Computadora", "1", "HP", "HP-123"},
            {"Impresora", "2", "Samsung", "Smg-123"},
            {"Monitor", "3", "Dell", "Dell-123"},
            {"Computadora", "1", "HP", "HP-123"},
            {"Impresora", "2", "Samsung", "Smg-123"},
            {"Monitor", "3", "Dell", "Dell-123"},
            {"Computadora", "1", "HP", "HP-123"},
            {"Impresora", "2", "Samsung", "Smg-123"},
        };
        pantalla.mostrarRecursosTecnologicos(model, datosRecursos);
    }

    public void tomarSeleccionDeRT(int index){
        System.out.println("index en gestor: " + index);
    }

    public void tomarDatosInhabilitacionRT(){}

    public void tomarConfirmacionIngresoMantenimiento(){}

    public void buscarRecursosTecnologicosDisponibles(){}

    public void validarTurnos(){}

    public void generarMantenimientoCorrectivo(){}

    public void notificarCientificos(){}

    public void finCU(){}


}
