import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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



}
