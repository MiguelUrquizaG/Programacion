public class CalculadoraGrados {
    public CalculadoraGrados() {
    }

    public double calcularFarenheit(double grados,double numero1,double numero2) throws NumeroMenorCeroException{

        if(grados <-273){
            throw new NumeroMenorCeroException("No se puede calcular grados menores a -273ºC");
        }

        return grados * numero1+numero2;
    }
}
