package HerenciaPolimorfismo.ejercicio03;

public class Coche extends Vehiculo{

    public double potencia;

    public Coche(int tipoEmision, double potencia) {
        super(tipoEmision);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "potencia=" + potencia +
                "} " + super.toString();
    }

    @Override
    public double calcularImpuesto() {
        double porcentajePotencia=25;
        double base=100;
        return super.calcularImpuesto()+(potencia*porcentajePotencia/base);
    }
}
