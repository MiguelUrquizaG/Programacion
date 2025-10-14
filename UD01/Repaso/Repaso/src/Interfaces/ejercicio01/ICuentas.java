package Interfaces.ejercicio01;

import java.time.LocalDate;

public interface ICuentas {

    public abstract Publicaciones[]  cuentaPrestados(Publicaciones[] lista);
    public abstract Publicaciones[] publicaciones(Publicaciones[]lista, int fecha);


}
