import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Cliente c = new Cliente("Miguel",29);

        Set<Cliente> setCliente = new HashSet();

        GestionCliente gc = new GestionCliente(setCliente);

        gc.save(c);

        System.out.println(gc.contarClientesMayores18());

       for(Cliente cliente : gc.comprobarSiContieneLetra("m")){
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

    }

}