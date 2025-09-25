package ejercicio08;

public class Plataforma {
    private boolean premium;
    private double precio;
    private String nombre;
    private int cantidadPersonas;

    public Plataforma(boolean premium, double precio, String nombre, int cantidadPersonas) {
        this.premium = premium;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "premium=" + premium +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", cantidadPersonas=" + cantidadPersonas +
                '}';
    }



}
