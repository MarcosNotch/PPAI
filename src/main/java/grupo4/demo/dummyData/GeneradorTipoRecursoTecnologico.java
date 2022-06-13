package grupo4.demo.dummyData;
import grupo4.demo.domain.TipoRecursoTecnologico;
import lombok.Data;

@Data
public class GeneradorTipoRecursoTecnologico {
    public static TipoRecursoTecnologico generarTipoRecursoTecnologico(String nombre) {
        TipoRecursoTecnologico tipoRecursoTecnologico = new TipoRecursoTecnologico();
        tipoRecursoTecnologico.setNombre(nombre);
        tipoRecursoTecnologico.setDescripcion("Descripcion de " + nombre);
        tipoRecursoTecnologico.setCaracteristica(GeneradorCaracteristica.generarCaracteristica("Caracteristica de " + nombre));
        return tipoRecursoTecnologico;
    }
}
