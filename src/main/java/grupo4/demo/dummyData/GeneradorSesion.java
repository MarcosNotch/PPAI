package grupo4.demo.dummyData;

import java.time.LocalDateTime;

import grupo4.demo.domain.Sesion;

public class GeneradorSesion {
    public static Sesion generarSesion()
    {
        Sesion sesion = new Sesion();
        sesion.setFechaHoraInicio(LocalDateTime.now());
        sesion.setUsuarioLogueado(GeneradorUsuario.generarUsuario());
        return sesion;
    }
}
