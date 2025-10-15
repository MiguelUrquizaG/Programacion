package HerenciaPolimorfismo.ejercicio05;

public class Vendedor extends Empleado{

    private int cantidadVentas;
    private double porcentajeIncentivo;

    public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, int cantidadVentas, double porcentajeIncentivo) {
        super(nombre, apellidos, sueldoBase, numEmpleado);
        this.cantidadVentas = cantidadVentas;
        this.porcentajeIncentivo = porcentajeIncentivo;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getPorcentajeIncentivo() {
        return porcentajeIncentivo;
    }

    public void setPorcentajeIncentivo(double porcentajeIncentivo) {
        this.porcentajeIncentivo = porcentajeIncentivo;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "cantidadVentas=" + cantidadVentas +
                ", porcentajeIncentivo=" + porcentajeIncentivo +
                "} " + super.toString();
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo()+calcularIncentivo();
    }

    public double calcularIncentivo(){
        double incentivo;
        double base=100;
        incentivo = cantidadVentas*porcentajeIncentivo/base;

        return incentivo;
    }

    public void felicitarVendedor(int objetivoVentas){
        if(objetivoVentas<cantidadVentas){
            System.out.println("Enhorabuena superaste tu objetivo");
        }
    }
}
