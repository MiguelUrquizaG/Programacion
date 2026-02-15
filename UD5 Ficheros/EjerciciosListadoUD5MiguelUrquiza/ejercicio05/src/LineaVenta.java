
public class LineaVenta {

    private Producto producto;
    private int cantidadProductos;
    public LineaVenta(Producto producto, int cantidadProductos) {
        super();
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidadProductos() {
        return cantidadProductos;
    }
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double calcularSubtotal(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {

        return producto.calcularPVP(porcentajeIva,descuento,impuesto,topeCaducidad)*cantidadProductos;
    }

    public String  mostrarLinea(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {

//		System.out.println(producto.getNombre()+"\t\t"+producto.calcularPVP(porcentajeIva, descuento,impuesto, topeCaducidad)+
//				"\t"+cantidadProductos+"\t"+calcularSubtotal(porcentajeIva,descuento,impuesto,topeCaducidad));
        /*System.out.printf("%s\t\t%.2f€\t%d\t\t%.2f€\n",producto.getNombre(),producto.calcularPVP(porcentajeIva, descuento,impuesto, topeCaducidad),cantidadProductos,
                calcularSubtotal(porcentajeIva,descuento,impuesto,topeCaducidad));*/

        String texto = String.format("%s\t\t%.2f€\t%d\t\t%.2f€\n",producto.getNombre(),producto.calcularPVP(porcentajeIva, descuento,impuesto, topeCaducidad),cantidadProductos,
                calcularSubtotal(porcentajeIva,descuento,impuesto,topeCaducidad));

        return texto;
    }

    public double calcularPerdido(double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {
        double precioPublico =calcularSubtotal(porcentajeIva, descuento, impuesto, topeCaducidad);

        return precioPublico-producto.getPrecioUnitario()*cantidadProductos;

    }
}
