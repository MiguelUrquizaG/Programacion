//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultado = 0;
        try {
            resultado = calculadora.sumar(8, 2);
        } catch (SumaNotValidaException ex) {
            System.out.println(ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("Problema en la ejecución");
        }

        System.out.println(resultado);


    }
}