package models;

import java.util.Comparator;
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
        alumnoList.stream()
                .filter(a -> a.getNombre().startsWith(nombre))
                .forEach(System.out::println);

    }

    public long listSize(){
        return alumnoList.stream()
                .count();
    }

    public List<Alumno>alumnoMediaSuperior(double media){
        return alumnoList.stream()
                .filter(a -> a.getNotaMedia()>media)
                .toList();
    }

    public void imprimirAlumnos(int cant){
        alumnoList.stream()
                .limit(cant)
                .forEach(System.out::println);
    }
    public Alumno alumnoMenorEdad(){
        return alumnoList.stream()
                .min(Comparator.comparingInt(Alumno::getEdad))
                .orElseThrow();
    }

    public Alumno primerAlumno(){
        return alumnoList.stream()
                .findFirst().orElseThrow();
    }

    public List<Alumno>obtenerAlumnosNombre(int longitud){
        return alumnoList.stream()
                .filter(a-> a.getNombre().length()>longitud)
                .toList();
    }

    public List<Alumno>obtenerAlumnosLetra(int longitud){
        String letra="A";
        return alumnoList.stream()
                .filter(a->a.getNombre().startsWith(letra))
                .filter(a->a.getNombre().length()<=longitud)
                .toList();
    }




    @Override
    public String toString() {
        return "Secretaria{" +
                "alumnoList=" + alumnoList +
                '}';
    }
}
