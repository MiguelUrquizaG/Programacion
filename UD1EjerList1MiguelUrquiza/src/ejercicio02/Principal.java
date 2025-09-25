package ejercicio02;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        double [] notas = new double[10];
        double cantidadSuspensos;

        Random rnd  = new Random(System.nanoTime());

        for(int i=0;i< notas.length-1;i++){
            notas[i]=rnd.nextDouble(10);

        }
        System.out.println(notas[0]);
        /*for(double nota:notas){
            if(nota>0){

            }
        }*/

    }
}
