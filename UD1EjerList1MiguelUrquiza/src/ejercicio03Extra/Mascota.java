package ejercicio03Extra;

public abstract class Mascota {

    private String nombre;
    private int edad;
    private double precioBase;
    private boolean vendido;


    public Mascota(String nombre, int edad, double precioBase, boolean vendido) {
        this.nombre = nombre;
        this.edad = edad;
        this.precioBase = precioBase;
        this.vendido = vendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }



    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", precioBase=" + precioBase +
                ", vendido=" + vendido +
                '}';
    }

    public abstract double calcularPrecioVenta(double porcentaje);

}
