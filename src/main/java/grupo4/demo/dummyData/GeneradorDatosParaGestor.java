package grupo4.demo.dummyData;
import grupo4.demo.domain.Sesion;
import grupo4.demo.domain.Usuario;

public class GeneradorDatosParaGestor {
    public static Usuario usuarioLogueado = GeneradorUsuario.generarUsuario();
    public static Sesion generarSesionActiva()
    {
        Sesion sesion = GeneradorSesion.generarSesion();
        sesion.setUsuarioLogueado(usuarioLogueado);
        return sesion;
    }

    // public static 
}
