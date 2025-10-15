package HerenciaPolimorfismo.ejercicio05;

public class Gerente extends Empleado{
    private double porcentajeImpuestos;

    public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado, double porcentajeImpuestos) {
        super(nombre, apellidos, sueldoBase, numEmpleado);
        this.porcentajeImpuestos = porcentajeImpuestos;
    }

    public double getPorcentajeImpuestos() {
        return porcentajeImpuestos;
    }

    public void setPorcentajeImpuestos(double porcentajeImpuestos) {
        this.porcentajeImpuestos = porcentajeImpuestos;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "porcentajeImpuestos=" + porcentajeImpuestos +
                "} " + super.toString();
    }

    @Override
    public double calcularSueldo() {
        double sueldo;
        double base=100;

        sueldo =super.calcularSueldo();

        sueldo -= sueldo*porcentajeImpuestos/base;

        return sueldo;
    }
}
