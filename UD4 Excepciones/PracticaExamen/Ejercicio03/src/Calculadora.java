import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public Calculadora() {
    }

    public List<Double> calcularEcuacion(double a, double b, double c) throws  EcuacionDegeneradaException,RaizComplejaException{

        double discriminante = Math.pow(b,2)-4*a*c;

        List<Double> resultados =new ArrayList<>();
        double resultado =0;

        if(a == 0 && b==0){
            throw new EcuacionDegeneradaException("La ecuación es degenerada");
        }

        if(discriminante <0){
            throw new RaizComplejaException("Esta raíz es compleja");
        }

        if(a==0){
            resultado = -c/b;
            resultados.add(resultado);
        }else{
            resultado = (-(b)+Math.sqrt(discriminante))/2*a;
            resultados.add(resultado);
            resultado = (-(b)-Math.sqrt(discriminante))/2*a;
            resultados.add(resultado);
        }

        return resultados;

    }
}
