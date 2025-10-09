package ejercicio02Extra;

public class EspadaLaser extends Producto {

    private String tipoEspada;

    public EspadaLaser(double precioBase, int cantProducto, String nombre, boolean vendido, String tipoEspada) {
        super(precioBase, cantProducto, nombre, vendido);
        this.tipoEspada = tipoEspada;
    }

    public String getTipoEspada() {
        return tipoEspada;
    }

    public void setTipoEspada(String tipoEspada) {
        this.tipoEspada = tipoEspada;
    }

    @Override
    public String toString() {
        return "EspadaLaser{" +
                "tipoEspada='" + tipoEspada + '\'' +
                '}';
    }

    @Override
    public double calcularPVP(double porcentaje) {
        double base = 100;
        double cantFija = 20;
        double total;

        total = super.getPrecioBase() + (super.getPrecioBase() * porcentaje / base);
        if (tipoEspada.equalsIgnoreCase("doble")) {
            total += cantFija;
        }

        return total *getCantProducto();
    }
}
