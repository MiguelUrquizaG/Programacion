import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a=0, b=0;
        int opcion = 0;
        boolean isValido = false;
        Calculadora calculadora = new Calculadora();

        System.out.println("Bienvenido al programa actuará como calculadora");

        do {
            try {
                System.out.println("Introduzca el valor de a: ");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca el valor de b: ");
                b = Double.parseDouble(sc.nextLine());
                isValido = true;
            } catch (NumberFormatException ex) {
                System.err.println("Valor introducido no válido.");
            }
        } while (!isValido);


        do {
            try{

                System.out.println("0.Canbiar valores a y b");
                System.out.println("1.Calcular suma");
                System.out.println("2.Salir");
                System.out.println("-----------------------------------------");
                System.out.println("Seleccione que desea hacer:");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion){
                    case 0:
                        System.out.println("Introduzca el valor de a: ");
                        a = Double.parseDouble(sc.nextLine());
                        System.out.println("Introduzca el valor de b: ");
                        b = Double.parseDouble(sc.nextLine());
                        break;
                    case 1:
                        System.out.println("EL resultado es: "+ calculadora.calcularSuma(a,b));
                        break;
                    case 2:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }

            }catch (MayorDiezException ex){
                System.err.println(ex.getMessage());
            }catch (NumberFormatException ex){
                System.err.println("Numero inválido");
            }catch (RuntimeException ex){
                System.err.println("Error en la ejecución");
            }

        } while (opcion != 2);

    }
}