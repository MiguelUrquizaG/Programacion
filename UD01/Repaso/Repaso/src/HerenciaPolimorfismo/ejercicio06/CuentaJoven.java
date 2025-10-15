package HerenciaPolimorfismo.ejercicio06;

public class CuentaJoven extends Cuenta{

    public CuentaJoven(double saldo) {
        super(saldo);
    }

    @Override
    public boolean agregarDinero(double cantidad) {
        double euroRegalo=1;
        boolean isDone=false;
        double saldoNuevo = getSaldo();

        if(cantidad>0){
            saldoNuevo+=cantidad+euroRegalo;
            setSaldo(saldoNuevo);
            isDone=true;
        }

        return isDone;
    }

    @Override
    public boolean retirarDinero(double cantidad) {
        boolean isDone=false;
        double suma;
        if (cantidad<=super.getSaldo()){
            suma = super.getSaldo()-cantidad;
            setSaldo(suma);
            isDone=true;
        }

        return isDone;

    }
}
