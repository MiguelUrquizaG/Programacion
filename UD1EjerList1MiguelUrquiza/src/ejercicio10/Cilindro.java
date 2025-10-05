package ejercicio10;

public class Cilindro extends Figura{
    private double altura;
    private double radio;

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                '}';
    }

    @Override
    public double calcularVolumen() {
        return  Math.PI*Math.pow(radio,2)*altura;
    }

    @Override
    public double calcularArea() {
        return  2*Math.PI*radio*(altura+radio);
    }

    public void imprimirAreaCilindro(){
        System.out.printf("El área del cilindro es: %.2f\n",calcularArea());
    }

    public void imprimirVolumenCilindro(){
        System.out.printf("El volúmen del cilindro es: %.2f\n",calcularVolumen());
    }
}
