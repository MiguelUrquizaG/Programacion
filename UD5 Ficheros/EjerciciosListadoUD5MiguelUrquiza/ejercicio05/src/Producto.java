public class Producto {
    private double precioUnitario;
    private String nombre;
    private int codigoIdentificacion;
    public Producto(double precioUnitario, String nombre, int codigoIdentificacion) {
        super();
        this.precioUnitario = precioUnitario;
        this.nombre = nombre;
        this.codigoIdentificacion = codigoIdentificacion;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }
    public void setCodigoIdentificacion(int codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }
    @Override
    public String toString() {
        return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codigoIdentificacion="
                + codigoIdentificacion + "]";
    }

    public double calcularPVP (double porcentajeIva,double descuento,double impuesto,int topeCaducidad) {
        return precioUnitario +(precioUnitario* porcentajeIva/100);
    }
}
