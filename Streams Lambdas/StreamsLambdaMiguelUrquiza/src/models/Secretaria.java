package models;

import java.util.List;

public class Secretaria {

    private List<Alumno> alumnoList;

    public Secretaria(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public List<Alumno> getAll(){
        return alumnoList.stream()
                .filter(a -> a!=null)
                .toList();
    }

    public void printAlumnos(){
        alumnoList.forEach(System.out::println);
    }


    public void printAlumnosNombre(String nombre){
       /* alumnoList.stream()
                .filter(a -> a.getNombre())
                */
    }


    @Override
    public String toString() {
        return "Secretaria{" +
                "alumnoList=" + alumnoList +
                '}';
    }
}
