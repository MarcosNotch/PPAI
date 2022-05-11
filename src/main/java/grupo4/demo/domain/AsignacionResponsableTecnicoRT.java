package grupo4.demo.domain;


import lombok.Data;

import java.util.Date;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class AsignacionResponsableTecnicoRT {

    private Date fechaDesde;
    private Date fechaHasta;
    private RecursosTecnologicos recurso;
    private PersonalCientifico personalCientifico;

    public AsignacionResponsableTecnicoRT(){}
    public bool esDeUsuario(){}
    public bool esDeCI(){}
    public List<RecursosTecnologicos> getRecursosTecnologicosDisponibles(){}
}
