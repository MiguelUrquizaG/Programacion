import errors.*;

import java.util.ArrayList;
import java.util.List;

public class GestorExcepciones {

    List<Integer>integerList =  new ArrayList<>();
    List<Objeto>objetoList = new ArrayList<>();

    public GestorExcepciones() {
    }

    public GestorExcepciones(List<Integer> integerList, List<Objeto> objetoList) {
        this.integerList = integerList;
        this.objetoList = objetoList;
    }

    public int validarNumero(int num) throws NumeroUnicoException {
        integerList.forEach(integer ->{
            if(integer == num){
                throw  new NumeroUnicoException("Se repite el número");
            }
        });

        return num;
    }

    public Objeto asignarCodigo(String codigo,Objeto objeto) throws CodigoAsignadoException {

        for(Objeto o : objetoList){
            if (o.getCodigo().equalsIgnoreCase(codigo)){
                throw new CodigoAsignadoException("El código ya lo contiene otro objeto");
            }
        }

        objeto.setCodigo(codigo);

        return  objeto;

    }

    public void verificarPar(int numero)throws NumeroImparException {

        if(numero%2!=0){
            throw new NumeroImparException("El número es impar");
        }

    }

    public CuentaBancaria retirarSaldo(double saldo,CuentaBancaria cuentaBancaria)throws SaldoInsuficienteException {

        if(cuentaBancaria.getSaldo()<saldo){
            throw new SaldoInsuficienteException("No hay saldo suficiente en la cuenta");
        }
        cuentaBancaria.setSaldo(cuentaBancaria.getSaldo()-saldo);

        return cuentaBancaria;
    }

    public double sumarHastDiez(int a,int b,int max)throws NumeroSuperiorDiezException{
        int resultado;

        resultado = a+b;

        if(resultado>max){
            throw new NumeroSuperiorDiezException("La suma supera el número máximo en este caso: "+max);
        }

        return resultado;
    }

    public double dividir(double a , double b)throws DividirZeroException{

        if(b==0){
            throw new DividirZeroException("No se puede dividir entre 0");
        }

        return a/b;

    }

}
