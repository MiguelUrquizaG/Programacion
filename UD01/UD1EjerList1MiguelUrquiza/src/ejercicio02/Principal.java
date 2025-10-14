package ejercicio02;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        double [] notas = new double[10];
        int cantidadSuspensos=0;
        int cantidadAprobados=0;
        double suma=0;
        double media;

        System.out.println("Bienvenido, este programa calcula cuantos alumnos han aprobado, suspendido y la media");

        Random rnd  = new Random(System.nanoTime());

        for(int i=0;i< notas.length-1;i++){
            notas[i]=rnd.nextDouble(10);

        }

        for(double nota:notas){
            if(nota>=5){
                cantidadAprobados++;
            }else{
                cantidadSuspensos++;
            }

        }

        for (int i = 0; i < notas.length; i++) {

            System.out.printf("%.2f\n",notas[i]);
            
        }
        System.out.println("Han aprobado --> "+cantidadAprobados);
        System.out.println("Han suspendido --> "+cantidadSuspensos);

        for(int i=0;i<notas.length;i++){

            suma+=notas[i];


        }


        media = suma/ notas.length;

        System.out.printf("La media de las notas es: %.2f\n",media);

        System.out.println("Gracias por utilizar el programa.");



    }
}
