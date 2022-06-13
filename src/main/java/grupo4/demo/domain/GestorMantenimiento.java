package grupo4.demo.domain;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import grupo4.demo.PantallaIngresoMantenimientoCorrectivo;

@Data
public class GestorMantenimiento {

    private Sesion sesion;
    private List<AsignacionResponsableTecnicoRT> asignacionesResponsablesTecnicosRT;
    private List<RecursoTecnologico> recursosTecnologicos;

    public void  opcionReingresoRTMantCorrectivo(PantallaIngresoMantenimientoCorrectivo pantalla, Model model){
        // buscarRTParaUsrLogueado(pantalla, model);
    }

    public void buscarRTParaUsrLogueado(PantallaIngresoMantenimientoCorrectivo pantalla, Model model){
        List<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();

        // Traer los recursos tecnológicos según usuario
        Usuario usuarioLogueado = sesion.getUsuarioLogueado();
        for(AsignacionResponsableTecnicoRT asignacion : asignacionesResponsablesTecnicosRT){
            if(asignacion.esDeUsuario(usuarioLogueado)){
                recursosTecnologicos = asignacion.getRecursosTecnologicosDisponibles();
                break;
            }
        }

        // Convertir los recursos tecnologicos en array bidimensional para pasar a la pantalla
        String datosRecursosTecnologicos[][] = new String[recursosTecnologicos.size()][4];
        for(int i = 0; i<recursosTecnologicos.size(); i++){
            RecursoTecnologico recurso = recursosTecnologicos.get(i);
            datosRecursosTecnologicos[i][0] = recurso.getTipoDeRT().getNombre();
            datosRecursosTecnologicos[i][1] = Integer.toString(recurso.getNumeroRt());
            // datosRecursosTecnologicos[i][2] = recurso.getMarca().getNombre();
            // datosRecursosTecnologicos[i][3] = recurso.getModelo().getNombre();
        }

        // Datos de prueba
        // String datosRecursos [][] = {
        //     {"Computadora", "1", "HP", "HP-123"},
        //     {"Impresora", "2", "Samsung", "Smg-123"},
        //     {"Monitor", "3", "Dell", "Dell-123"},
        //     {"Computadora", "1", "HP", "HP-123"},
        //     {"Impresora", "2", "Samsung", "Smg-123"},
        //     {"Monitor", "3", "Dell", "Dell-123"},
        //     {"Computadora", "1", "HP", "HP-123"},
        //     {"Impresora", "2", "Samsung", "Smg-123"},
        // };

        pantalla.mostrarRecursosTecnologicos(model, datosRecursosTecnologicos);
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

