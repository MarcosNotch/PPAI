package grupo4.demo.domain;


import lombok.Data;

import java.util.Date;


// La anotacion de Data de Lombok internamente crea los Get y los Set y el constructor
// de esta forma podemos dejar un codigo mas limpio y prolijo

@Data
public class TipoRecursoTecnologico {

    private String nombre;
    private String descripcion;
    private Caracteristica caracteristica;

    public TipoRecursoTecnologico(){}

    
}
