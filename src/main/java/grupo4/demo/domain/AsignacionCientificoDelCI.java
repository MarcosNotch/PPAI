package grupo4.demo.domain;

import lombok.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AsignacionCientificoDelCI {
    private Date fechaDesde;
    private Date fechaHasta;
    private List<Turno> turnos;
    private PersonalCientifico personalCientifico;

    public void mostrarCientificoDelCI(){}


}
