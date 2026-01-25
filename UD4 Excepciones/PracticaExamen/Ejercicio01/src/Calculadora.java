public class Calculadora {
    public Calculadora() {

    }


    public double calcularSuma (double num1,double num2){
        return num1+num2;
    }

    public double calcularResta(double num1,double num2){
        return num1-num2;
    }

    public double calcularMultiplicacion(double num1,double num2){
        return num1 * num2;
    }

    public double calcularDivision(double num1,double num2) throws  DivisonEntreCeroException{

        if(num2 == 0){
            throw new DivisonEntreCeroException("No se puede realizar una división entre 0");
        }

        return num1/num2;
    }

    public double calcularRaizCuadrada(double num1) throws  NumeroNegativoException{

        if(num1<0){
            throw new NumeroNegativoException("No se puede realizar la raíz cuadrada de un número negativo.");
        }

        return  Math.sqrt(num1);
    }

}
