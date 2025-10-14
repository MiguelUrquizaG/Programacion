package Interfaces.ejercicio01;

import java.time.LocalDate;

public class Aplicacion implements ICuentas{
    @Override
    public Publicaciones[]  cuentaPrestados(Publicaciones[] lista) {
        int tam =0;
        int contador=0;
        Publicaciones[]prestados;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].isPrestado()){
                tam++;
            }
        }


        prestados = new Publicaciones[tam];

        for (int i = 0; i < lista.length; i++) {
            if(lista[i].isPrestado()){
                prestados[contador]=lista[i];
                contador++;
            }
        }


        return prestados ;
    }

    @Override
    public Publicaciones[] publicaciones(Publicaciones[] lista, int fecha) {
        int tam=0;
        int contador=0;
        Publicaciones [] array;


        for (int i = 0; i < lista.length; i++) {

            if(lista[i].getFecha()<fecha){
                tam++;
            }

        }

        array = new Publicaciones[tam];

        for (int i = 0; i < lista.length; i++) {

            if(lista[i].getFecha()<fecha){
                array[contador]=lista[i];
                contador++;
            }

        }



        return array;
    }
}
