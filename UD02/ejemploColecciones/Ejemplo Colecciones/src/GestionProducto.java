import java.util.HashSet;
import java.util.Set;

public class GestionProducto {
    Set<Producto>productosSet = new HashSet<>();


    public Producto create(Producto producto){

        productosSet.add(producto);

        return producto;

    }

    public Producto deleteById(Long id){

    }

    public Producto findById(Producto producto){

        if(productosSet.contains(producto){

        }

        return null;
    }

}
