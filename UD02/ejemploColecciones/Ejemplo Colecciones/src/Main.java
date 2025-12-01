import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import Set.Producto;
import Set.Cliente;
import Set.GestionProducto;
import Set.GestionCliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Set.Cliente c = new Set.Cliente("Miguel",29);

        Set<Set.Cliente> setCliente = new HashSet();

        Set.GestionCliente gc = new Set.GestionCliente(setCliente);

        gc.save(c);

        System.out.println(gc.contarClientesMayores18());

       for(Set.Cliente cliente : gc.comprobarSiContieneLetra("m")){
           System.out.println(cliente.toString());
       }
       */

        Producto p = new Producto(1L,"Pan",4);
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


        Pais pais1 = new Pais("Espana","Madrid");
        Pais pais2 = new Pais("Francia","París");
        Pais pais3 = new Pais("Italia","Roma");

        Map<String,Pais> map = new HashMap<>();
        GestionPais gestionPais = new GestionPais(map);

        gestionPais.addPais(pais1);
        gestionPais.addPais(pais2);
        gestionPais.addPais(pais3);

        System.out.println(gestionPais.calcularSumaNombresPaises());



    }

}