import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        //INPUT
        try{
            System.out.println("Introduzca un número entero: ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca un número entero: ");
            num2 = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.err.println("No se ha podido leer el valor.");
        }


        try{
            calculadora.dividir(num1,num2);
        } catch (ArithmeticException e) {
            System.err.println("No se puede dividir entre 0");
        }catch (RuntimeException e){
            System.err.println("Error en la ejecución");
        }

        try{
            calculadora.calcularRaizCuadrada(-3);
        }catch (ArithmeticException e){
            System.err.println("No se puede hacer una raíz cuadrada a un número negativo.");
        }






    }
}