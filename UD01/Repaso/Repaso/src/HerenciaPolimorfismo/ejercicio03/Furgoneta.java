package HerenciaPolimorfismo.ejercicio03;

public class Furgoneta extends Vehiculo{
    public double impuestoExtra;

    public Furgoneta(int tipoEmision, double impuestoExtra) {
        super(tipoEmision);
        this.impuestoExtra = impuestoExtra;
    }

    public double getImpuestoExtra() {
        return impuestoExtra;
    }

    public void setImpuestoExtra(double impuestoExtra) {
        this.impuestoExtra = impuestoExtra;
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "impuestoExtra=" + impuestoExtra +
                "} " + super.toString();
    }

    @Override
    public double calcularImpuesto() {
        return super.calcularImpuesto() + impuestoExtra;
    }
}
