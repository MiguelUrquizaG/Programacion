package HerenciaPolimorfismo.ejercicio06;

import java.util.Arrays;

public class Oficina {

    private Cuenta [] cuentas;
    private int dineroCuentasJovenes;
    private int dineroCuentasEmpresa;


    public Oficina(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public int getDineroCuentasJovenes() {
        return dineroCuentasJovenes;
    }

    public void setDineroCuentasJovenes(int dineroCuentasJovenes) {
        this.dineroCuentasJovenes = dineroCuentasJovenes;
    }

    public int getDineroCuentasEmpresa() {
        return dineroCuentasEmpresa;
    }

    public void setDineroCuentasEmpresa(int dineroCuentasEmpresa) {
        this.dineroCuentasEmpresa = dineroCuentasEmpresa;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "cuentas=" + Arrays.toString(cuentas) +
                ", dineroCuentasJovenes=" + dineroCuentasJovenes +
                ", dineroCuentasEmpresa=" + dineroCuentasEmpresa +
                '}';
    }

    public boolean ingresarDinero(Cuenta c ,double cantidad){

        if(c instanceof CuentaJoven){
            dineroCuentasJovenes++;
        }

        return c.agregarDinero(cantidad);

    }

    public boolean retirarDinero(Cuenta c, double cantidad){
        if (c instanceof CuentaEmpresa){
            dineroCuentasEmpresa++;
        }

        return c.retirarDinero(cantidad);
    }

    public double calcularTotalCuentas(){
        double suma=0;
        for (int i =0;i<cuentas.length;i++){
            suma+= cuentas[i].getSaldo();
        }

        return suma;
    }

    public int generadoEmpresas(){
        return getDineroCuentasEmpresa();
    }

    public int perdidoJovenes(){
        return getDineroCuentasJovenes();
    }
}
