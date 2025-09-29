package ejercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        /* Crea una clase Dado con algún método como lanzar() que devuelva un número aleatorio entre 1 y 6. Simula
10 tiradas y muestra la puntuación mayor, al menor y qué número se ha repetido más veces.
*/


        List<Integer>numeros = new ArrayList<Integer>();
        List<Integer>numRepetidos =  new ArrayList<Integer>();
        Dado d  = new Dado();
        int cantNumRepetidos;
        List<Integer>lista = new ArrayList<Integer>();

        numeros = d.lanzarNumeros(10,6,1);

        for(int a : numeros){
            System.out.printf("%d\t",a);
        }

        System.out.printf("El número más alto es: %d\n",d.buscarNumMasAlto(numeros));
        System.out.printf("El número más bajo es: %d\n",d.buscarNumMasBajo(numeros));


        lista = d.buscarNumMasRepetido(numeros);
        System.out.println(lista);

        for(int i=1;i<7;i++){
            if(lista.contains(i)) {
                System.out.printf("El %d es un número repetido.\n", i);
                numRepetidos.add(i);
            }
        }

        for (int i=0;i<numRepetidos.size();i++){
            if(i==0){
                System.out.println("El/Los número/s repetido/s son: ");
                System.out.printf("%d ",numRepetidos.get(i));
            }else{
                System.out.printf(", %d",numRepetidos.get(i));
            }

        }
        cantNumRepetidos = lista.size()/numRepetidos.size();
        System.out.printf("\tSe han repetido %d veces\n" ,cantNumRepetidos);



    }
}
