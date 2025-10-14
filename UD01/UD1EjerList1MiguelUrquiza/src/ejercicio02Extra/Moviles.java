package ejercicio02Extra;

public class Moviles extends Producto{

    private String marca;
    private String modelo;

    public Moviles(double precioBase, int cantProducto, String nombre, boolean vendido, String marca, String modelo) {
        super(precioBase, cantProducto, nombre, vendido);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    @Override
    public String toString() {
        return "Moviles{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public double calcularPVP(double porcentaje) {
        double base=100;

        return (super.getPrecioBase()+(super.getPrecioBase()*porcentaje/base)) *getCantProducto();

    }
}
