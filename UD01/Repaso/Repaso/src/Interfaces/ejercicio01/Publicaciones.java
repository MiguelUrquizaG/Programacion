package Interfaces.ejercicio01;

import java.time.LocalDate;

public class Publicaciones{

    private String nombre;
    private boolean prestado;
    private int fecha;


    public Publicaciones(String nombre, boolean prestado, int fecha) {
        this.nombre = nombre;
        this.prestado = prestado;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "nombre='" + nombre + '\'' +
                ", prestado=" + prestado +
                ", fecha=" + fecha +
                '}';
    }


}
