package HerenciaPolimorfismo.ejercicio01;

public class Portatil extends Ordenador{

    public boolean seguroPantalla;
    public double precioSeguro;

    public Portatil(double capacidadDiscoDuro, double frecuencia, double precioBase, String marca, boolean seguroPantalla, double precioSeguro) {
        super(capacidadDiscoDuro, frecuencia, precioBase, marca);
        this.seguroPantalla = seguroPantalla;
        this.precioSeguro = precioSeguro;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "seguroPantalla=" + seguroPantalla +
                ", precioSeguro=" + precioSeguro +
                "} " + super.toString();
    }

    @Override
    public double calcularPrecio(double porcentaje) {
        double precio=super.calcularPrecio(porcentaje);
        if(seguroPantalla){

            precio +=precioSeguro;
        }
        return precio;
    }
}
