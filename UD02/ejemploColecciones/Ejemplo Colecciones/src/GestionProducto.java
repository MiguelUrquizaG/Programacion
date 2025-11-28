import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GestionProducto {
    Set<Producto>productosSet = new TreeSet<>();


    public Producto create(Producto producto){

        productosSet.add(producto);

        return producto;

    }

    public boolean deleteById(Long id){

        Producto p = findById(id);
        return  productosSet.remove(p);
    }

    public Producto findById(Long id){

        for(Producto p: productosSet){
            if(p.getId() == id){
                return p;
            }
        }

        return null;
    }

    public Producto edit(Long id,Producto p){

        Producto producto = findById(id);

        producto.setNombre(p.getNombre());
        producto.setCantidad(p.getCantidad());

        return producto;

    }

}
