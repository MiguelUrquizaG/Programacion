package HerenciaPolimorfismo.ejercicio03;

public class Motocicleta extends Vehiculo{
    private double cilindrada;

    public Motocicleta(int tipoEmision, double cilindrada) {
        super(tipoEmision);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindrada=" + cilindrada +
                "} " + super.toString();
    }

    @Override
    public double calcularImpuesto() {
        double impuesto;
        double porcentajeCilindrada=60;
        double base=100;
        impuesto = super.calcularImpuesto() +(cilindrada*porcentajeCilindrada/100);

         return impuesto;
    }
}
