package ejercicio11COPIA;

public class Programador extends Empleado{

    private double horasExtras;
    private double valorHorasExtra;

    public Programador(double valorHora,  int anyosExperiencia, int horasSemanales, double horasExtras, double valorHorasExtra1) {
        super(valorHora, anyosExperiencia, horasSemanales);
        this.horasExtras = horasExtras;
        this.valorHorasExtra = valorHorasExtra1;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHorasExtra() {
        return valorHorasExtra;
    }

    public void setValorHorasExtra(double valorHorasExtra) {
        this.valorHorasExtra = valorHorasExtra;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "horasExtras=" + horasExtras +
                ", valorHorasExtra=" + valorHorasExtra +
                '}';
    }

    @Override
    public double calcularSueldo() {
        double sueldo;
        if(horasExtras>0){
            sueldo = super.calcularSueldo()+(horasExtras*valorHorasExtra);
        }else{
            sueldo = super.calcularSueldo();
        }

        return sueldo;
    }
}
