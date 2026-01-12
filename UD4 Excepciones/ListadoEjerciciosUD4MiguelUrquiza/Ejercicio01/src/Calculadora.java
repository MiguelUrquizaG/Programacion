public class Calculadora {

    public Calculadora() {
    }

    public int sumar(int num1, int num2){
        return num1 +num2;
    }

    public int multiplicar(int num1,int num2){
        return num1*num2;
    }

    public int dividir (int num1,int num2){
        return num1/num2;
    }

    public double calcularRaizCuadrada(int num1){
        if(num1<0){
            throw new ArithmeticException();
        }
        return Math.sqrt(num1);
    }

}
