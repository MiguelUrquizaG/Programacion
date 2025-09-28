package ejercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dado {

    public int lanzar(int max, int min){
        Random rnd =  new Random(System.nanoTime());

        return rnd.nextInt(max-min+1)+min;
    }


    public List<Integer> lanzarNumeros(int tiradas,int max, int min){

        List<Integer>numerosAleatorios = new ArrayList<Integer>();

        for(int i=0;i<tiradas;i++){

            numerosAleatorios.add(lanzar(max,min));

        }

        return numerosAleatorios;

    }

    public int buscarNumMasAlto(List<Integer> listaNums){
        int max=-1;
        for(int num:listaNums){
            if(max<num){
                max =num;
            }
        }

        return max;
    }

    public int buscarNumMasBajo(List<Integer>listaNums){
        int min=7;
        for(int num : listaNums){
            if(min>num){
                min=num;
            }
        }
        return min;

    }

    public int buscarNumMasRepetido(List<Integer>listaNums){

        int numRepetido=0;
        int contador1=0;
        int contador2=0;

        for(int i = 1;i<7;i++){

            for (int a : listaNums){
                if(a == i){
                    contador1++;
                }
            }

            if(contador1>contador2){
                contador2=contador1;
                numRepetido=i;
                contador1=0;
            }

        }
        return numRepetido;
    }

}
