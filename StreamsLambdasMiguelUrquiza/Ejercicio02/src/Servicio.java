import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Servicio {
    private List<String> listCadena;

    public Servicio(List<String> listCadena) {
        this.listCadena = listCadena;
    }

    public List<String> getListCadena() {
        return listCadena;
    }

    public void setListCadena(List<String> listCadena) {
        this.listCadena = listCadena;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "listCadena=" + listCadena +
                '}';
    }

    public List<String> ordenarAlfabeticamente() {
        List<String> lista = new ArrayList<>();
        listCadena.forEach(lista::add);
        return lista.stream()
                .sorted().toList();
    }

    public List<String> buscarCadena(String cadena) {

        return listCadena.stream()
                .filter(a -> a.equalsIgnoreCase(cadena))
                .toList();
    }


    public String crearPalabra() {
        List<String> palabras = new ArrayList<>();
        String palabra = "";
        //listCadena.forEach(a-> palabras.add(a.substring(0,1)));

        return listCadena.stream()
                .map(p -> p.substring(0, 1)
                ).collect(Collectors.joining());


        //return palabra;
    }

    public void borrarPalabrasImpares() {
        listCadena =listCadena.stream()
                .filter(c -> c.length() % 2 == 0)
                .toList();
    }

    public void pasarPalabrasMayuscula(){
        listCadena = listCadena.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public boolean mostrarPalabraContieneNumeros(String palabra){

        Pattern pattern = Pattern.compile("[a-zA-Z]*[0-9]+[a-zA-Z]*$",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(palabra);
        return matcher.find();

    }



}

