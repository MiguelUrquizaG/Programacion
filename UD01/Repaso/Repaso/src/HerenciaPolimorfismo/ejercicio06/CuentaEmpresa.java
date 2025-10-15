package HerenciaPolimorfismo.ejercicio06;

public class CuentaEmpresa extends Cuenta{
    public CuentaEmpresa(double saldo) {
        super(saldo);
    }

    @Override
    public boolean agregarDinero(double cantidad) {
        boolean isDone=false;

        if(cantidad>0){
            setSaldo(getSaldo()+cantidad);
            isDone=true;
        }

        return isDone;
    }

    @Override
    public boolean retirarDinero(double cantidad) {
        boolean isDone=false;
        double euro=1;
        double resto= cantidad+euro;

        if(resto<=getSaldo()){
            setSaldo(getSaldo()-resto);
            isDone=true;
        }


        return isDone;
    }
}
