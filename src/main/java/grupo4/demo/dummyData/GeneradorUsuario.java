package grupo4.demo.dummyData;

import grupo4.demo.domain.Usuario;

public class GeneradorUsuario {
    private static String claveAleatoria[] = {"123456", "qwerty", "asdfgh", "zxcvbn", "password", "12345678", "123456789", "1234567890"};
    private static String usuariosAleatorios [] = {"Juan", "Carlos", "María", "Silvina", "Mauro", "Judith"};

    public static Usuario generarUsuario()
    {
        Usuario usuario = new Usuario();
        usuario.setClave(claveAleatoria[(int) (Math.random() * claveAleatoria.length)]);
        usuario.setUsuario(usuariosAleatorios[(int) (Math.random() * usuariosAleatorios.length)]);
        usuario.setHabilitado(true);
        return usuario;
    }

}
