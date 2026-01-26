import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        List<Double> resultados = new ArrayList<>();



        try {
            System.out.println("Introduzca el valor de a: ");
            a = Double.parseDouble(sc.nextLine());
            System.out.println("Introduzca el valor de b: ");
            b = Double.parseDouble(sc.nextLine());
            System.out.println("Introduzca el valor de c: ");
            c = Double.parseDouble(sc.nextLine());

            resultados = calculadora.calcularEcuacion(a, b, c);

        } catch (EcuacionDegeneradaException ex) {
            System.err.println(ex.getMessage());
        } catch (RaizComplejaException ex) {
            System.err.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.err.println("Valor introducido no válido.");
        } catch (RuntimeException ex) {
            System.err.println("Error en la ejecución.");
        }

        for (Double num : resultados) {
            System.out.println(num);
        }
    }
}