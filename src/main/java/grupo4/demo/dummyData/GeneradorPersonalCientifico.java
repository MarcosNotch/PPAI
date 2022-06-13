package grupo4.demo.dummyData;

import java.util.ArrayList;

import grupo4.demo.domain.PersonalCientifico;

public class GeneradorPersonalCientifico {
    private static String nombresAleatorios [] = {"Juan", "Carlos", "María", "Silvina", "Mauro", "Judith"};
    private static String apellidosAleatorios [] = {"Perez", "Gonzalez", "Lopez", "García", "Martínez", "Sanchez"};


    public static PersonalCientifico generarPersonalCientifico() {
        PersonalCientifico personalCientifico = new PersonalCientifico();
        String nombre = nombresAleatorios[(int) (Math.random() * nombresAleatorios.length)];
        String apellido = apellidosAleatorios[(int) (Math.random() * apellidosAleatorios.length)];
        int legajo = (int) (Math.random() * 10000);

        personalCientifico.setNombre(nombre);
        personalCientifico.setApellido(apellido);
        personalCientifico.setLegajo(legajo);
        personalCientifico.setUsuario(GeneradorUsuario.generarUsuario());
        personalCientifico.setCorreoElectronicoInstitucional(nombre + "." + apellido + "@UniNacional.edu.ar");
        return personalCientifico;
    }
}
