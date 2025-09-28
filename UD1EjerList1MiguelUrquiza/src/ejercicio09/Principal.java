package ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /* Crea una clase Dado con algún método como lanzar() que devuelva un número aleatorio entre 1 y 6. Simula
10 tiradas y muestra la puntuación mayor, al menor y qué número se ha repetido más veces.
*/


        List<Integer>numeros = new ArrayList<Integer>();

        Dado d  = new Dado();

        numeros = d.lanzarNumeros(10,6,1);

        for(int a : numeros){
            System.out.println(a);
        }

        System.out.printf("El número más alto es: %d\n",d.buscarNumMasAlto(numeros));
        System.out.printf("El número más bajo es: %d\n",d.buscarNumMasBajo(numeros));
        System.out.printf("El número que mas se ha repetido es: %d",d.buscarNumMasRepetido(numeros));





    }
}
