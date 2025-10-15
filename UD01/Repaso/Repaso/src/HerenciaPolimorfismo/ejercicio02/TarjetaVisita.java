package HerenciaPolimorfismo.ejercicio02;

public class TarjetaVisita extends Documento{

    @Override
    public void imprimirCabecera() {
        super.imprimirCabecera();
        System.out.println("Datos de contacto");
        System.out.println("---------------------------------------------");
        System.out.println("Nombre: Miguel Urquiza");
        System.out.println("Tlf: 312324223");
        System.out.println("Email: iajsdias@gmail.com");
    }
}
