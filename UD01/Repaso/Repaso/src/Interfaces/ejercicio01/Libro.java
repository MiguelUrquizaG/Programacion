package Interfaces.ejercicio01;

import java.time.LocalDate;

public class Libro extends Publicaciones{

    private int paginas;

    public Libro(String nombre, boolean prestado, int fecha, int paginas) {
        super(nombre, prestado, fecha);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "paginas=" + paginas +
                "} " + super.toString();
    }
}
