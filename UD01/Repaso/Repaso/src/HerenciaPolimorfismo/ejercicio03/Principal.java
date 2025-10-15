package HerenciaPolimorfismo.ejercicio03;

public class Principal {
    public static void main(String[] args) {

        Vehiculo m = new Motocicleta(0,100);
        Vehiculo c = new Coche(1,100);
        Vehiculo f = new Furgoneta(3,100);

        System.out.println(m.calcularImpuesto());
        System.out.println(c.calcularImpuesto());
        System.out.println(f.calcularImpuesto());

    }
}
