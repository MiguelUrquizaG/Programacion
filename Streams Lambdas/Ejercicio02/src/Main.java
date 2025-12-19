import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String>lista = List.of("Miguel","Prueba","Texto","AAAA","AAAA","Ejemploadsasdfasfas");

        Servicio servicio =  new Servicio(lista);

        servicio.ordenarAlfabeticamente().forEach(System.out::println);

        System.out.println(servicio.buscarCadena("Miguel"));


        System.out.println(servicio.crearPalabra());

        servicio.borrarPalabrasImpares();
        System.out.println(servicio.getListCadena());

        servicio.pasarPalabrasMayuscula();
        System.out.println(servicio.getListCadena());

        System.out.println(servicio.buscarCadena("Miguel3"));
        System.out.println(servicio.mostrarPalabraContieneNumeros("Miguel"));



    }
}