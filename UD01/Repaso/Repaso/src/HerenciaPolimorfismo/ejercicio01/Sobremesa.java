package HerenciaPolimorfismo.ejercicio01;

public class Sobremesa extends Ordenador{

    private double precioMontaje;

    public Sobremesa(double capacidadDiscoDuro, double frecuencia, double precioBase, String marca, double precioMontaje) {
        super(capacidadDiscoDuro, frecuencia, precioBase, marca);
        this.precioMontaje = precioMontaje;
    }

    public double getPrecioMontaje() {
        return precioMontaje;
    }

    public void setPrecioMontaje(double precioMontaje) {
        this.precioMontaje = precioMontaje;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "precioMontaje=" + precioMontaje +
                "} " + super.toString();
    }

    @Override
    public double calcularPrecio(double porcentaje) {
        return super.calcularPrecio(porcentaje)+precioMontaje;
    }
}
