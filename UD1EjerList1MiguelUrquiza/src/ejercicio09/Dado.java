package ejercicio09;

import java.util.*;
import java.util.stream.Collectors;

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

    public List<Integer> buscarNumMasRepetido(List<Integer>listaNums){

        List<Integer>listaRepetidos=new ArrayList<>();
        List<Integer> numRepetidos = new ArrayList<Integer>();
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

    public List<Integer>filtrarRepetidos(List<Integer> listaRepetidos){
        List<Integer>listaRepetidosFiltrada=new ArrayList<>();

        for(int i=1;i<7;i++){
            if(listaRepetidos.contains(i)){

            listaRepetidosFiltrada.add(i);
            }
        }

        return listaRepetidosFiltrada;
    }


    public double porcentajeNumIndicado(List<Integer> lista,int num){
        double base=100;
        int cantNum = (int)lista.stream().
                filter(n -> num==n)
                .count();


        return cantNum*base/lista.size();
    }

    public double mediaTodosNumeros(List<Integer>lista){

        double suma=0;
                suma =lista.stream()
                        .mapToInt(n->n)
                        .average()
                        .orElse(0);

                return suma;
    }

    //PARTE CHAT GPT  --> Genereame dos métodos más elaborados y que introduzcan una mecánica interesante
    /*public List<String> simularPartidas(int numPartidas, int tiradasPorPartida, int max, int min) {
        List<String> resultados = new ArrayList<>();

        for (int p = 1; p <= numPartidas; p++) {
            List<Integer> tiradas = lanzarNumeros(tiradasPorPartida, max, min);

            int maxNum = buscarNumMasAlto(tiradas);
            int minNum = buscarNumMasBajo(tiradas);
            double media = mediaTodosNumeros(tiradas);
            List<Integer> listaRepetidos = buscarNumMasRepetido(tiradas);

            // Sacamos los números "distintos" que están en la lista repetida
            List<Integer> numerosMasRepetidos = new ArrayList<>();
            for (int i = 1; i <= max; i++) {
                if (listaRepetidos.contains(i)) {
                    numerosMasRepetidos.add(i);
                }
            }
            int cantidadRepeticiones = listaRepetidos.size() / numerosMasRepetidos.size();

            // Construcción del resultado en un solo bloque
            StringBuilder sb = new StringBuilder();
            sb.append("🎲 Partida ").append(p).append("\n")
                    .append("Tiradas: ").append(tiradas).append("\n")
                    .append("Máx: ").append(maxNum).append(" | ")
                    .append("Mín: ").append(minNum).append(" | ")
                    .append("Media: ").append(String.format("%.2f", media)).append("\n")
                    .append("Más repetido(s): ").append(numerosMasRepetidos)
                    .append(" (").append(cantidadRepeticiones).append(" veces)").append("\n");

            resultados.add(sb.toString());
        }

        return resultados;
    }*/

    public List<List<Integer>> simularPartidas(int numPartidas, int tiradasPorPartida, int max, int min) {
        List<List<Integer>> partidas = new ArrayList<>();

        for (int p = 1; p <= numPartidas; p++) {
            List<Integer> tiradas = lanzarNumeros(tiradasPorPartida, max, min);
            partidas.add(tiradas);
        }

        return partidas;
    }


    public List<Integer> aplanarTiradas(List<List<Integer>> partidas) {
        List<Integer> todasTiradas = new ArrayList<>();
        for (List<Integer> partida : partidas) {
            todasTiradas.addAll(partida);
        }
        return todasTiradas;
    }

    public Map<List<Integer>, Integer> numeroMasAfortunadoGlobal(List<List<Integer>> partidas) {
        // Obtenemos todas las tiradas aplanadas
        List<Integer> todasTiradas = aplanarTiradas(partidas);

        // Usamos tu método existente para obtener los números más repetidos
        List<Integer> listaRepetidos = buscarNumMasRepetido(todasTiradas);

        // Sacamos los números distintos
        List<Integer> numerosMasAfortunados = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            if (listaRepetidos.contains(i)) {
                numerosMasAfortunados.add(i);
            }
        }

        // Cantidad de veces que se repitieron
        int cantidadRepeticiones = listaRepetidos.size() / numerosMasAfortunados.size();

        // Devolvemos en un Map para mantener la estructura
        Map<List<Integer>, Integer> resultado = new HashMap<>();
        resultado.put(numerosMasAfortunados, cantidadRepeticiones);

        return resultado;
    }




}
