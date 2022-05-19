package grupo4.demo.domain;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.ui.Model;
import grupo4.demo.PantallaIngresoMantenimientoCorrectivo;

@Data
public class GestorMantenimiento {

    private Sesion sesion;
    private ArrayList<AsignacionResponsableTecnicoRT> asiganacionesResponsablesTecnicosRT;
    private ArrayList<RecursoTecnologico> recursosTecnologicos;

    public void  opcionReingresoRTMantCorrectivo(PantallaIngresoMantenimientoCorrectivo pantalla, Model model){
        ArrayList<RecursoTecnologico> recursosTecnologicos = buscarRTParaUsrLogueado();

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

    public ArrayList<RecursoTecnologico> buscarRTParaUsrLogueado(){
        ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
        Usuario usuarioLogueado = sesion
        for(AsignacionResponsableTecnicoRT asignacion : asiganacionesResponsablesTecnicosRT){
            if(asignacion.esDeCI(nombreCI)){
                recursosTecnologicos.add(asignacion.getRecursoTecnologico());
            }
        }

        return recursosTecnologicos;
    }

    public void tomarSeleccionDeRT(int index){
        System.out.println("index en gestor: " + index);
    }

    public void tomarDatosInhabilitacionRT(LocalDate fechaPrevista, String razonMantenimiento){
        System.out.println("tomarDatosInhabilitacionRT");
        System.out.println("fechaPrevista: " + fechaPrevista);
        System.out.println("razonMantenimiento: " + razonMantenimiento);


    }

    public void tomarConfirmacionIngresoMantenimiento(){}

    public void buscarRecursosTecnologicosDisponibles(){}

    public void validarTurnos(){}

    public void generarMantenimientoCorrectivo(){}

    public void notificarCientificos(){}

    public void finCU(){}
}

