package Set;

import java.util.Set;
import java.util.TreeSet;

public class GestionProducto {
    Set<Producto>productosSet = new TreeSet<>();

    public GestionProducto(Set<Producto> productosSet) {
        this.productosSet = productosSet;
    }

    public void create(Producto producto){

        productosSet.add(producto);

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

    public Producto obtenerSiguiente(Producto producto){
        if(productosSet instanceof TreeSet<Producto>){
            return ((TreeSet<Producto>) productosSet).higher(producto);
        }

        return null;
    }

    public Set<Producto> obtenerProductosRango(Producto p1, Producto p2){
        if(productosSet instanceof TreeSet<Producto>){
            return ((TreeSet<Producto>) productosSet).subSet(p1,p2);
        }

        return null;
    }

}
