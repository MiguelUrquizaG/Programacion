public class Calculadora {
    public Calculadora() {
    }

    public double calcularSuma(double a, double b) throws MayorDiezException{

        double resultado;

        resultado = a+b;

        if(resultado > 10){
            throw new MayorDiezException("La suma es mayor a 10.");
        }

        return resultado;
    }
}
