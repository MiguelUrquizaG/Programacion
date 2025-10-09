package ejercicio02Extra;

public abstract class Producto {

    private double precioBase;
    private int cantProducto;
    private String nombre;
    private boolean vendido;

    public Producto(double precioBase, int cantProducto, String nombre, boolean vendido) {
        this.precioBase = precioBase;
        this.cantProducto = cantProducto;
        this.nombre = nombre;
        this.vendido = vendido;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public abstract double calcularPVP(double porcentaje);


}
