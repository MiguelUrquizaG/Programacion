public class Calculadora {
    public Calculadora() {
    }

    public int sumar(int num1, int num2)throws SumaNotValidaException{

        int res;

        res = num1+num2;

        if(res > 10)
            throw new SumaNotValidaException("La suma tiene un valor superior a 10");

        return res;

    }

}
