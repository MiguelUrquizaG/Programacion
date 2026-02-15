import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Venta {
    private LineaVenta [] lista;
    //LA VENTA ES EL TICKET COMO TAL.

    public Venta(LineaVenta[] lista) {
        super();
        this.lista = lista;
    }

    public LineaVenta[] getLista() {
        return lista;
    }

    public void setLista(LineaVenta[] lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Venta [lista=" + Arrays.toString(lista) + "]";
    }


    public void listarProductos(int topeCaducidad) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getProducto().getNombre());
            if(lista[i].getProducto() instanceof Alimentacion ) {
                ((Alimentacion)lista[i].getProducto()).avisarCaducidad(topeCaducidad);
            }
        }
    }

    public List<String> imprimirTicket(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {

        List<String> listaImprimir = new ArrayList<>();



        //PONER LO BONITO AQUI
        System.out.println("Supermercado Triana");
        listaImprimir.add("Supermercado Triana");
        System.out.println("----------------------------------------------------");
        listaImprimir.add("----------------------------------------------------");
        System.out.println("Artículo\tPrecio\tCant\tSubtotal");
        listaImprimir.add("Artículo\tPrecio\tCant\tSubtotal");
        System.out.println("----------------------------------------------------");
        listaImprimir.add("----------------------------------------------------");

        for (int i = 0; i < lista.length; i++) {

            lista[i].mostrarLinea(porcentajeIva,descuento,impuesto,topeCaducidad);
            listaImprimir.add( lista[i].mostrarLinea(porcentajeIva,descuento,impuesto,topeCaducidad));
            if(lista[i].getProducto() instanceof Alimentacion ) {
                ((Alimentacion)lista[i].getProducto()).avisarCaducidad(topeCaducidad);
            }
        }

        System.out.println("----------------------------------------------------");
        listaImprimir.add("----------------------------------------------------");
        System.out.println("TOTAL: "+calcularTotal(porcentajeIva, descuento, impuesto, topeCaducidad)+"€");
        listaImprimir.add("TOTAL: "+calcularTotal(porcentajeIva, descuento, impuesto, topeCaducidad)+"€");

        return listaImprimir;

    }

    public double calcularTotal(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {
        double suma=0;
        for (int i = 0; i < lista.length&&lista[i]!=null; i++) {
            suma+=lista[i].calcularSubtotal(porcentajeIva, descuento, impuesto, topeCaducidad);
        }

        return suma;
    }

    public void agregarLineaVenta(LineaVenta lv,int contador) {
        lista[contador]=lv;

    }

    //	public void calcularPerdidoImpuestos(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {
//		double gastos=0;
//		for (int i = 0; i < lista.length; i++) {
//			gastos +=lista[i].getProducto().calcularPVP(porcentajeIva,descuento,impuesto,topeCaducidad) -lista[i].getProducto().getPrecioUnitario();
//		}
//	}
    public double calcularPerdidoImpuestos(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {
        double gastos=0;
        for (int i = 0; i < lista.length; i++) {
            gastos += lista[i].calcularPerdido(porcentajeIva, descuento, impuesto, topeCaducidad);
        }

        return gastos;
    }

}
