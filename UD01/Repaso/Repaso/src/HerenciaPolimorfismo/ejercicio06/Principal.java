package HerenciaPolimorfismo.ejercicio06;

public class Principal {
    public static void main(String[] args) {

        Cuenta c = new CuentaEmpresa(100);
        Cuenta c2 = new CuentaJoven(100);

        Cuenta[]array = {c,c2};

        Oficina o = new Oficina(array);

        o.ingresarDinero(c2,10);
        System.out.println(c2.getSaldo());
        System.out.println(o.perdidoJovenes());
        o.retirarDinero(c,10);
        System.out.println(c.getSaldo());
        System.out.println(o.generadoEmpresas());

        System.out.println(o.calcularTotalCuentas());

    }
}
