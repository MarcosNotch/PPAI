package grupo4.demo.domain;


import lombok.Data;

@Data
public class Estado {

    private String nombre;
    private String descripcion;
    private String ambito;


    public void mostrarEstado(){}

    public void sosCanceladoPorMantenimientoCorrectivo(){}

    public void sosConIngresoAMantenimientoCorrectivo(){}


}
