package ejercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        /* Crea una clase Dado con algún método como lanzar() que devuelva un número aleatorio entre 1 y 6. Simula
10 tiradas y muestra la puntuación mayor, al menor y qué número se ha repetido más veces.
*/



        List<Integer>numRepetidos =  new ArrayList<Integer>();
        Dado d  = new Dado();
        int cantNumRepetidos;
        List<Integer>lista = new ArrayList<Integer>();
        List<Integer>numeros =   d.lanzarNumeros(10,6,1);


        for(int a : numeros){
            System.out.printf("%d\t",a);
        }

        System.out.printf("\nEl número más alto es: %d\n",d.buscarNumMasAlto(numeros));
        System.out.printf("El número más bajo es: %d\n",d.buscarNumMasBajo(numeros));

        //Localizar números repetidos
        lista = d.buscarNumMasRepetido(numeros);

        numRepetidos=d.filtrarRepetidos(lista);



        //Lista con los números repetidos
        /*
        for(int i=1;i<7;i++){
            if(lista.contains(i)) {

                numRepetidos.add(i);
            }
        }*/
        //Imprimir números repetidos
        for (int i=0;i<numRepetidos.size();i++){
            if(i==0){
                System.out.println("El/Los número/s repetido/s son: ");
                System.out.printf("%d ",numRepetidos.get(i));
            }else{
                System.out.printf(", %d",numRepetidos.get(i));
            }

        }

        //Indicar cantidad de veces repetido un número
        cantNumRepetidos = lista.size()/numRepetidos.size();
        System.out.printf("\tSe han repetido %d veces\n" ,cantNumRepetidos);


        System.out.println("El porcentaje de veces que sale el número indicado es: "+d.porcentajeNumIndicado(numeros,2)+"%");
        System.out.println("La media es: "+d.mediaTodosNumeros(numeros));

        //CHAT GPT

        List<List<Integer>>partidas=d.simularPartidas(3,10,6,1);

        int partidaNum = 1;
        for (List<Integer> tiradas : partidas) {
            System.out.println("🎲 Partida " + partidaNum + ": " + tiradas);
            System.out.println("Máx: " + d.buscarNumMasAlto(tiradas));
            System.out.println("Mín: " + d.buscarNumMasBajo(tiradas));
            System.out.println("Media: " + d.mediaTodosNumeros(tiradas));

            List<Integer> listaRepetidos = d.buscarNumMasRepetido(tiradas);
            List<Integer> numerosMasRepetidos = new ArrayList<>();
            for (int i = 1; i <= 6; i++) {
                if (listaRepetidos.contains(i)) {
                    numerosMasRepetidos.add(i);
                }
            }
            int cantidadRepeticiones = listaRepetidos.size() / numerosMasRepetidos.size();
            System.out.println("Número(s) más repetido(s): " + numerosMasRepetidos +
                    " (" + cantidadRepeticiones + " veces)");

            System.out.println("-------------------------");
            partidaNum++;
        }

        //System.out.println(d.simularPartidas(5,10,6,1));

        Map<List<Integer>, Integer> resultadoGlobal = d.numeroMasAfortunadoGlobal(partidas);
        resultadoGlobal.forEach((nums, freq) -> {
            System.out.println("🌟 Número(s) más afortunado(s) global: " + nums +
                    " (" + freq + " veces)");
        });


    }
}
