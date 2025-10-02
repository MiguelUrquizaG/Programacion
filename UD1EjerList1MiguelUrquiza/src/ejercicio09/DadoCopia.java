package ejercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DadoCopia {


    //Usa Una lista como variable para almacenar los datos.

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

        //mayor = listNum.stream().max(Integer::compareTo).get();
        //Un stream sirve para hacer operaciones con listas es como una tubería,
        //Para coger el máximo Integer::compareTo
        //Cuando trabajmos con muchos datos hacemos flujos de datos.
        //En los tubos hacemos operaciones intermedias y se hacen una final siempre para tener como un producto final
        //Cada vez que se utilizaba un stream el primer paso es crear un stream --> .stream crea el stream
        //Una vez creada hacemos operaciones intermedias y cuando lo buscamos podemos hacer varias cosas
        //Un min necesita el criterio de comparar que es el (Integer :: compareTo)
        //En los stream estan los filtros
        //Con el :: nos ayuda a simplificar para nombrar las cosas.
        //Se puede trabajar con streams usando Maps?¿?
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

    public List<Integer> buscarNumMasRepetido(List<Integer>listaNums){

        List<Integer> numRepetidos = new ArrayList<Integer>();
        int numRepetido=0;
        int contador1=0;
        int contador2=0;

        for(int i = 1;i<listaNums.size()+1;i++){

            for (int a : listaNums){
                if(a == i){
                    contador1++;
                }
            }

            if(contador1>contador2){
                numRepetidos.removeAll(numRepetidos);

                contador2=contador1;
                for (int j =0;j<contador1;j++){
                    numRepetidos.add(i);
                }


            }else if(contador1 == contador2){

                for (int j =0;j<contador1;j++){
                    numRepetidos.add(i);

                }

            }
            contador1=0;
        }
        return numRepetidos;
    }

    //Para hacer el que mas se repite
    //Primero crea dos variables y una lista de los que mas se repiten
    //Para saber el numero máximo de repeticiones
    //Para ello creamos un stream con la lista.mapToInt(n -> )

}
