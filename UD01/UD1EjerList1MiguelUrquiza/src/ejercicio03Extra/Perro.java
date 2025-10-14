package ejercicio03Extra;

public class Perro extends Mascota{

    private String raza;
    private boolean vacunas;

    public Perro(String nombre, int edad, double precioBase, boolean vendido, String raza, boolean vacunas) {
        super(nombre, edad, precioBase, vendido);
        this.raza = raza;
        this.vacunas = vacunas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", vacunas=" + vacunas +
                "} " + super.toString();
    }

    @Override
    public double calcularPrecioVenta(double porcentaje) {
        double suma;
        double base=100;
        double descuento=10;
        suma = getPrecioBase()+(getPrecioBase()*porcentaje/base);

        if(!isVacunas()){
            suma -= suma*descuento/base;
        }
        return suma;
    }

    public void vendido(){
        System.out.println("Guau");
    }
}
