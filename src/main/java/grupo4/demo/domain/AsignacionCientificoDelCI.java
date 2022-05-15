package grupo4.demo.domain;

import lombok.Data;
import java.util.ArrayList;
import java.util.Date;

@Data
public class AsignacionCientificoDelCI {
    private Date fechaDesde;
    private Date fechaHasta;
    private ArrayList<Turno> turnos;
    private PersonalCientifico personalCientifico;

    public void mostrarCientificoDelCI(){}


}
