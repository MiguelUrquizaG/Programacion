package Map;

import java.util.*;

public class ServicioPalabra {
    private Map<String,Palabra> map =  new LinkedHashMap<>();

    public ServicioPalabra(Map<String, Palabra> map) {
        this.map = map;
    }

    public Map<String, Palabra> getMap() {
        return map;
    }

    public void setMap(Map<String, Palabra> map) {
        this.map = map;
    }


    public void add(Palabra palabra){
        map.put(palabra.getPalabra(), palabra);
    }

    public Palabra find(String palabra){
        return map.get(palabra);
    }

    public void editPalabra(Palabra palabra){
        map.replace(palabra.getPalabra(), palabra);
    }

    public void delete(String palabra){
        map.remove(palabra);
    }

    public Palabra mostrarPalabraDelDia(){
        int numAleatorio = (int)(Math.random()* map.size());
        Set<String> set = map.keySet();

        List<String> list = set.stream().toList();

        String clave = list.get(numAleatorio);

        return  find(clave);

    }

    //Adivinar la palabra por su significado
    public Palabra generarDefinicionAdivinar(String palabra){

        int aleatorio = (int) (Math.random()*map.size());

        List<Palabra> palabraList=  map.values().stream()
                .toList();

        Palabra descripcionAdivinar = palabraList.get(aleatorio);

        return descripcionAdivinar;
    }
/*
    public List<String> generarRespuestas(Palabra palabra){

        int capacidadRespuestas =4;
        List<Palabra>respuestas = new ArrayList<>(capacidadRespuestas);
        Palabra palabraAgregar;
        int posicion = (int) (Math.random()*capacidadRespuestas);
        List<Palabra>listaPalabras = map.values().stream().toList();

        if(respuestas.isEmpty()){
            respuestas.add(posicion,palabra);
        }else{
            for (int i =0;i<capacidadRespuestas-1;i++){
                while (respuestas.get(posicion)!=null){
                    posicion = (int) (Math.random()*capacidadRespuestas);

                }
                palabraAgregar  =listaPalabras.get(posicion);

                while(respuestas.contains(palabraAgregar)){

                }

                respuestas.add(posicion,listaPalabras);
            }

        }

    }*/



}
