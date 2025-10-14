package ejercicio03Extra;

public class Gato extends Mascota{

    private String color;
    private boolean esCazador;

    public Gato(String nombre, int edad, double precioBase, boolean vendido, String color, boolean esCazador) {
        super(nombre, edad, precioBase, vendido);
        this.color = color;
        this.esCazador = esCazador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsCazador() {
        return esCazador;
    }

    public void setEsCazador(boolean esCazador) {
        this.esCazador = esCazador;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", esCazador=" + esCazador +
                "} " + super.toString();
    }

    @Override
    public double calcularPrecioVenta(double porcentaje) {
        double base=100;
        double suma;
        double primaAdiestramiento=100;
        suma = getPrecioBase()+(getPrecioBase()*porcentaje/base);
        if(isEsCazador()){
            suma+= primaAdiestramiento;
        }

        return suma;
    }

    public void vendido(){
        System.out.println("Miau");
    }
}
