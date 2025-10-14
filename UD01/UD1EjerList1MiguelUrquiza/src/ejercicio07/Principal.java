package ejercicio07;

public class Principal {
    public static void main(String[] args) {

        Bombilla b = new Bombilla(true);
        b.estadoBombilla();

        b.apagar();
        b.estadoBombilla();

        b.encender();
        b.estadoBombilla();


    }
}
