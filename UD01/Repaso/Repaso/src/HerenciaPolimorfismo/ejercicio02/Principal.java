package HerenciaPolimorfismo.ejercicio02;

public class Principal {
    public static void main(String[] args) {

        Documento d= new Documento();
        Documento tv = new TarjetaVisita();
        Documento c = new Carta();

        d.imprimirCabecera();
        System.out.println("********************************************************");
        tv.imprimirCabecera();
        System.out.println("********************************************************");
        c.imprimirCabecera();

    }
}
