package HerenciaPolimorfismo.ejercicio01;

public class Ordenador {
    private double capacidadDiscoDuro;
    private double frecuencia;
    private double precioBase;
    private String marca;

    public Ordenador(double capacidadDiscoDuro, double frecuencia, double precioBase, String marca) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.frecuencia = frecuencia;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    public double getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "capacidadDiscoDuro=" + capacidadDiscoDuro +
                ", frecuencia=" + frecuencia +
                ", precioBase=" + precioBase +
                ", marca='" + marca + '\'' +
                '}';
    }


    public double calcularPrecio(double porcentaje){
        double base=100;
        return precioBase + (precioBase*porcentaje/base);
    }

}
