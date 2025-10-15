package HerenciaPolimorfismo.ejercicio06;

public abstract class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                '}';
    }

    public abstract boolean retirarDinero(double cantidad);

    public abstract boolean agregarDinero(double cantidad);

}

