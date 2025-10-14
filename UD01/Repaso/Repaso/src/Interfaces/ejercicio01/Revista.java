package Interfaces.ejercicio01;

import java.time.LocalDate;

public class Revista extends Publicaciones{

    private double precio;

    public Revista(String nombre, boolean prestado, int fecha, double precio) {
        super(nombre, prestado, fecha);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "precio=" + precio +
                "} " + super.toString();
    }
}
