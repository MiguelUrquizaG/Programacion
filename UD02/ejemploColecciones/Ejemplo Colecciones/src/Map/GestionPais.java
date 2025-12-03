package Map;

import java.util.*;

public class GestionPais {

    private Map<String, Pais>paisMap =  new HashMap<>();

    public GestionPais(Map<String, Pais> paisMap) {
        this.paisMap = paisMap;
    }

    public Map<String, Pais> getPaisMap() {
        return paisMap;
    }

    public void setPaisMap(Map<String, Pais> paisMap) {
        this.paisMap = paisMap;
    }

    public void addPais(Pais pais){
        paisMap.put(pais.getNombre(),pais);
    }

    public Pais findPais(String nombrePais){
        if (paisMap.containsKey(nombrePais)){
            return paisMap.get(nombrePais);
        }

        return null;

    }

    public Pais editarPais(Pais pais){
        return paisMap.replace(pais.getNombre(),pais);
    }

    public void remove(String nombrePais){
        paisMap.remove(nombrePais);
    }

    public int calcularSumaNombresPaises(){
        Collection<Pais> values =  paisMap.values();
        int suma=0;

        for (Pais pais : values){
            suma += pais.getCapital().length();
        }

        return suma;
    }

    public boolean acertarPais (String pais){
        Set<String> set = paisMap.keySet();
        boolean isGanado=false;

        for(String nombre : set){
            if(nombre.equalsIgnoreCase(pais)){
                return isGanado=true;
            }
        }

        return isGanado;
    }

}
