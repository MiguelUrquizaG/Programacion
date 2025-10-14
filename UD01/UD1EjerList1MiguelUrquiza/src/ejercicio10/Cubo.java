package ejercicio10;

public class Cubo extends Figura{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }

    //Preguntar si es obligatorio poner @Override
    public double calcularArea(){
        int cantLados=6;
        return cantLados*(Math.pow(lado,2));
    }


    public double calcularVolumen() {
        return Math.pow(lado,3);
    }

    public void imprimirAreaCubo(){
        System.out.printf("El área del Cubo es: %.2f\n",calcularArea());
    }
    public void imprimirVolumenCubo(){
        System.out.printf("El volúmen del Cubo es: %.2f\n",calcularVolumen());
    }
}
