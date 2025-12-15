import models.Alumno;
import models.Secretaria;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Alumno> alumnoList = List.of(new Alumno("Miguel", "Urquiza", "2ºDAM", 7.32f, 22),
                new Alumno("Cristina", "Rus", "2ºDAM", 9.12f, 20));


        Secretaria secretaria = new Secretaria(alumnoList);

        secretaria.printAlumnos();
    }


}