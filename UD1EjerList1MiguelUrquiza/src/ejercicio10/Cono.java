package ejercicio10;

public class Cono extends Figura{
    private double radio;
    private double altura;

    public Cono(double radio,double altura) {
        this.radio = radio;

        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }




    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cono{" +
                "radio=" + radio +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularVolumen() {
        return (Math.PI*Math.pow(radio,2)*altura)/3;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*(calcularGeneratriz()+radio);
    }
    //gen*pi*radio + pi*radio^2

    public double calcularGeneratriz(){
        double generatriz;
        generatriz = Math.sqrt(Math.pow(altura,2)+Math.pow(radio,2));
        return generatriz;
    }

    public void imprimirAreaCono(){
        System.out.printf("El área del cono es: %.2f\n",calcularArea());
    }
    public void imprimirVolumenCono(){
        System.out.printf("El volúmen del cono es: %.2f\n",calcularVolumen());
    }
}
