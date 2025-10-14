package ejercicio10;

public class Esfera extends Figura{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularArea(){
        return 4*Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularVolumen() {
        return 4/(double)3* Math.PI*Math.pow(radio,3);
    }

    public void imprimirAreaEsfera(){
        System.out.printf("El área de las esfera es: %.2f\n",calcularArea());
    }

    public void imprimirVolumenEsfera(){
        System.out.printf("El volúmen de las esfera es: %.2f\n",calcularVolumen());
    }
}
