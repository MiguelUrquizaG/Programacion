import errors.*;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2);
        Objeto objeto = new Objeto("1");
        Objeto objeto1 = new Objeto("2");
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(100);
        int num1, num2,max;
        double saldo,numerador,denominador;
        boolean isValido = false;
        String codigo;

        List<Objeto> objetoList = List.of(objeto, objeto1);

        GestorExcepciones gestorExcepciones = new GestorExcepciones(integerList, objetoList);

        int opcion = 0;

        System.out.println("Bienvenido al programa");

        try {

            do {
                System.out.println("0.Salir");
                System.out.println("1.Validar Numero");
                System.out.println("2.Asignar Código");
                System.out.println("3.Verificar Par");
                System.out.println("4.Retirar Dinero");
                System.out.println("5.Sumar");
                System.out.println("6.Dividir");
                System.out.println("--------------------------------------");
                System.out.println("Seleccione su opción: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    case 1:
                        isValido=false;
                        do {
                            try {
                                System.out.println("Introduzca el valor: ");
                                num1 = Integer.parseInt(sc.nextLine());
                                gestorExcepciones.validarNumero(num1);
                                isValido =true;
                            } catch (NumberFormatException ex) {
                                System.err.println("Número inválido");
                            }
                        } while (!isValido);


                        break;
                    case 2:
                        codigo = sc.nextLine();
                        gestorExcepciones.asignarCodigo(codigo,objeto);
                        break;
                    case 3:
                        isValido=false;
                        do {
                            try {
                                System.out.println("Introduzca el valor: ");
                                num1 = Integer.parseInt(sc.nextLine());
                                gestorExcepciones.verificarPar(num1);
                                isValido =true;
                            } catch (NumberFormatException ex) {
                                System.err.println("Número inválido");
                            }
                        } while (!isValido);
                        break;
                    case 4:
                        isValido=false;
                        do {
                            try {
                                System.out.println("Introduzca el valor: ");
                                saldo = Double.parseDouble(sc.nextLine());
                                gestorExcepciones.retirarSaldo(saldo,cuentaBancaria);
                                isValido =true;
                            } catch (NumberFormatException ex) {
                                System.err.println("Número inválido");
                            }
                        } while (!isValido);
                        break;
                    case 5:
                        isValido=false;
                        do {
                            try {
                                System.out.println("Introduzca el valor 1: ");
                                num1 = Integer.parseInt(sc.nextLine());
                                System.out.println("Introduzca el valor 2: ");
                                num2 = Integer.parseInt(sc.nextLine());
                                System.out.println("Introduzca el valor máximo: ");
                                max = Integer.parseInt(sc.nextLine());
                                gestorExcepciones.sumarHastDiez(num1,num2,max);
                                isValido =true;
                            } catch (NumberFormatException ex) {
                                System.err.println("Número inválido");
                            }
                        } while (!isValido);
                        break;
                    case 6:
                        isValido=false;
                        do {
                            try {
                                System.out.println("Introduzca el valor 1: ");
                                numerador = Double.parseDouble(sc.nextLine());
                                System.out.println("Introduzca el valor 2: ");
                                denominador = Double.parseDouble(sc.nextLine());
                                gestorExcepciones.dividir(numerador,denominador);
                                isValido =true;
                            } catch (NumberFormatException ex) {
                                System.err.println("Número inválido");
                            }
                        } while (!isValido);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }

            } while (opcion != 0);

        } catch (CodigoAsignadoException ex) {
            System.err.println(ex.getMessage());
        }catch (DividirZeroException ex){
            System.err.println(ex.getMessage());
        }catch (NumberFormatException ex){
            System.err.println(ex.getMessage());
        }catch (NumeroSuperiorDiezException ex){
            System.err.println(ex.getMessage());
        }catch (NumeroUnicoException ex){
            System.err.println(ex.getMessage());
        }catch (SaldoInsuficienteException ex){
            System.err.println(ex.getMessage());
        }catch (RuntimeException ex){
            System.err.println("Error en la ejecución");
        }


    }
}