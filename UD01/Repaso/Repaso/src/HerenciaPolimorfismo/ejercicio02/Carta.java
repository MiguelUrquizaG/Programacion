package HerenciaPolimorfismo.ejercicio02;

public class Carta extends Documento{
    @Override
    public void imprimirCabecera() {
        super.imprimirCabecera();
        System.out.println("Fecha: 15/10/2025");
    }
}
