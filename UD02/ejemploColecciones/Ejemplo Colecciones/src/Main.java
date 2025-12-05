import java.util.*;

import Map.Palabra;
import Map.ServicioPalabra;
//MIGUEL URQUIZA
public class Main {
    public static void main(String[] args) {

       /* Cliente c = new Cliente("Miguel",29);
        Cliente c2 = new Cliente("Pepe",10);

        Set<Cliente> setCliente = new HashSet();

        GestionCliente gc = new GestionCliente(setCliente);

        gc.save(c);

        System.out.println(gc.calcularGanador(c2));

       for(Cliente cliente : gc.comprobarSiContieneLetra("m")){
           System.out.println(cliente.toString());
       }*/

      /*  Producto p = new Producto(1L,"Pan",4);
        Producto p2 =  new Producto(2L,"Zanahoria",3);
        Producto p3 = new Producto(3L,"Papa",3);
        Producto p4 = new Producto(4L,"Migas",1);

        Set<Producto>gp =  new TreeSet<>();



        GestionProducto gc =  new GestionProducto(gp);

        gc.create(p);
        gc.create(p2);
        gc.create(p3);
        gc.create(p4);

        System.out.println(gc.obtenerSiguiente(p));

        for(Producto producto : gc.obtenerProductosRango(p,p4)){
            System.out.println(producto.toString());
        }

*//*
        Pais pais1 = new Pais("Espana","Madrid");
        Pais pais2 = new Pais("Francia","París");
        Pais pais3 = new Pais("Italia","Roma");

        Map<String, Pais> map = new HashMap<>();
        GestionPais gestionPais = new GestionPais(map);

        gestionPais.addPais(pais1);
        gestionPais.addPais(pais2);
        gestionPais.addPais(pais3);

        System.out.println(gestionPais.calcularSumaNombresPaises());
        System.out.println(gestionPais.acertarPais("P"));

*/
        Palabra p = new Palabra("Pies","Parte del cuerpo");
        Palabra p2 = new Palabra("Mesa","Mueble para apoyar cosas");
        Palabra p3 = new Palabra("Cuadro","Lugar donde se ponen las fotos.");

        Map map = new LinkedHashMap();

        ServicioPalabra sp = new ServicioPalabra(map);

        sp.add(p);
        sp.add(p2);
        sp.add(p3);


        System.out.println(sp.mostrarPalabraDelDia());


    }

}