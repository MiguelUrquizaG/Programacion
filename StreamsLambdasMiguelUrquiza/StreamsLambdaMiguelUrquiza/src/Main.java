import models.Alumno;
import models.Secretaria;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Alumno> alumnoList = List.of(new Alumno("Miguel", "Urquiza", "2ºDAM", 7.32f, 22),
                new Alumno("Cristina", "Rus", "2ºDAM", 9.12f, 20),
                new Alumno("Alberto", "Rus", "2ºDAM", 5.12f, 43));


        Secretaria secretaria = new Secretaria(alumnoList);

        secretaria.printAlumnos();


        System.out.println(secretaria.alumnoMediaSuperior(7));

        secretaria.printAlumnosNombre("M");

        System.out.println(secretaria.listSize());

        secretaria.imprimirAlumnos(2);

        System.out.println(secretaria.alumnoMenorEdad());
        System.out.println(secretaria.primerAlumno());

        System.out.println(secretaria.obtenerAlumnosNombre(4));
        System.out.println(secretaria.obtenerAlumnosLetra(3));
    }


}