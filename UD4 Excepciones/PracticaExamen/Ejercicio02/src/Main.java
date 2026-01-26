import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opcion=0;
        double grados = 0, numero1 = 0, numero2 = 0;
        Scanner sc = new Scanner(System.in);
        boolean isValido = false;
        CalculadoraGrados calculadoraGrados = new CalculadoraGrados();
        System.out.println("Bienvenido al programa para transformar de Celsius a Farenheit");
        do {
            try {
                System.out.println("Introduzca el valor de los grados: ");
                grados = Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca el primer número de la fórmula");
                numero1 = Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca el segundo número de la fórmula");
                numero2 = Double.parseDouble(sc.nextLine());
                isValido = true;
            } catch (NumberFormatException ex) {
                System.err.println("No es válido el número introducido");
            }
        } while (!isValido);


        do {
            try {


                System.out.println("0.Introducir nuevo valor de grados");
                System.out.println("1.Cambiar valores fórmula");
                System.out.println("2.Calcular valor Farenheit");
                System.out.println("3.Salir del programa");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 0:
                        isValido = false;
                        while (!isValido) {
                            try {
                                System.out.println("Introduzca el valor de los grados: ");
                                grados = Double.parseDouble(sc.nextLine());
                                isValido = true;
                            } catch (NumberFormatException ex) {
                                System.err.println("No es un número válido");
                            }
                        }

                        break;
                    case 1:
                        isValido = false;
                        while (!isValido) {
                            try {
                                System.out.println("Introduzca el primer número de la fórmula");
                                numero1 = Double.parseDouble(sc.nextLine());
                                System.out.println("Introduzca el segundo número de la fórmula");
                                numero2 = Double.parseDouble(sc.nextLine());
                                isValido = true;
                            } catch (NumberFormatException ex) {
                                System.err.println("No es un número válido");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("El resultado es: " + calculadoraGrados.calcularFarenheit(grados, numero1, numero2));
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Valor inválido");
                        break;
                }
            } catch (NumeroMenorCeroException ex){
                System.err.println(ex.getMessage());
            }catch (NumberFormatException ex){
                System.err.println("Formato de número inválido");
            }catch (RuntimeException ex){
                System.err.println("Fallo en la ejecución");
            }

        } while (opcion != 3);


        System.out.println("Gracias por utilizar el programa.");
    }
}