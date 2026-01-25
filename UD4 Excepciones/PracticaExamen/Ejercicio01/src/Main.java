import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        double num1=0, num2=0;
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean isValido = false;

        System.out.println("Bienvenido al programa, este actuará como una calculadora.");

        do {
            try {
                System.out.println("Introduzca el valor del número 1: ");
                num1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Introduzca el valor del número 2: ");
                num2 = Double.parseDouble(scanner.nextLine());
                isValido = true;
            } catch (NumberFormatException ex) {
                System.err.println("No es válido ese número");
            }


        } while (!isValido);

        do {
            try {
                System.out.println("0.Cambiar números");
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicación");
                System.out.println("4.División");
                System.out.println("5.Raíz cuadrada");
                System.out.println("6.Salir del programa");
                System.out.println("---------------------------------------");
                System.out.println("Seleccione su opción");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 0:
                        isValido = false;
                        do {
                            try{
                                System.out.println("Introduzca el valor del número 1: ");
                                num1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Introduzca el valor del número 2: ");
                                num2 = Double.parseDouble(scanner.nextLine());
                                isValido = true;
                            }catch (NumberFormatException ex){
                                System.err.println("Número no válido");
                            }

                        }while(!isValido);


                        break;
                    case 1:
                        System.out.println("El resultado de la suma es: " + calculadora.calcularSuma(num1, num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + calculadora.calcularResta(num1, num2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicación es: " + calculadora.calcularMultiplicacion(num1, num2));
                        break;
                    case 4:
                        System.out.println("El resultado de la división es: " + calculadora.calcularDivision(num1, num2));
                        break;
                    case 5:
                        System.out.printf("El resultado de la raíz cuadrada es: %.2f\n", calculadora.calcularRaizCuadrada(num1));
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (DivisonEntreCeroException | NumeroNegativoException ex) {
                System.err.println(ex.getMessage());
            } catch (NumberFormatException ex) {
                System.err.println("El número introducido no es válido.");
            } catch (RuntimeException ex) {
                System.err.println("Hubo un fallo en la ejecución.");
            } catch (Exception ex) {
                System.err.println("Ha habido un error.");
            } finally {
                System.out.println("Programa ejecutado");
            }

        } while (opcion != 6);


        System.out.println("Gracias por utilizar el programa");
    }
}