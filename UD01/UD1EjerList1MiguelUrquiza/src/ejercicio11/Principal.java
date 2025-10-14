package ejercicio11;

import ejercicio11COPIA.Analista;
import ejercicio11COPIA.Empleado;
import ejercicio11COPIA.JefeProyecto;
import ejercicio11COPIA.Programador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bienvenido al programa");
        int opcion;
        Empleado e;
        Scanner sc = new Scanner(System.in);

        //Variables Instancia
        double valorHora;
        int cantAnyos;
        int horasSemanales;
        double horasExtra;
        double valorHorasExtra;
        double bonusProyecto;
        boolean isObjetivo;
        double valorObjetivo;


        do{


        //Empleado e1 =  new Programador(12,3,40,3,5);
        //Empleado e2 = new Analista(10,0,1,10);
        //Empleado e3 = new JefeProyecto(100,12,5,true,50);
        System.out.println("Introduzca el tipo de empleado que es para calcular el sueldo: ");
        System.out.println("0. Salir");
        System.out.println("1. Programador");
        System.out.println("2. Analista");
        System.out.println("3. Jefe Proyecto");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                System.out.println("Introduzca el valor de la hora de trabajo: ");
                valorHora =  Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca la cantidad de años trabajados: ");
                cantAnyos = Integer.parseInt(sc.nextLine());
                System.out.println("Introduzca la cantidad de horas semanales: ");
                horasSemanales = Integer.parseInt(sc.nextLine());
                System.out.println("Introduzca las horas extra realizadas: ");
                horasExtra = Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca el valor de las horas extra: ");
                valorHorasExtra = Double.parseDouble(sc.nextLine());

                e = new Programador(valorHora,cantAnyos,horasSemanales,horasExtra,valorHorasExtra);
                System.out.printf("Tu sueldo sería de: %.2f\n",e.calcularSueldo());

                break;
            case 2:
                System.out.println("Introduzca el valor de la hora de trabajo: ");
                valorHora =  Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca la cantidad de años trabajados: ");
                cantAnyos = Integer.parseInt(sc.nextLine());
                System.out.println("Introduzca la cantidad de horas semanales: ");
                horasSemanales = Integer.parseInt(sc.nextLine());
                System.out.println("Introduzca el bonus por proyecto extra realizadas: ");
                bonusProyecto = Double.parseDouble(sc.nextLine());

                e = new Analista(valorHora,cantAnyos,horasSemanales,bonusProyecto);

                System.out.printf("Tu sueldo sería de: %.2f\n",e.calcularSueldo());

                break;
            case 3:
                System.out.println("Introduzca el valor de la hora de trabajo: ");
                valorHora =  Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca la cantidad de años trabajados: ");
                cantAnyos = Integer.parseInt(sc.nextLine());
                System.out.println("Introduzca la cantidad de horas semanales: ");
                horasSemanales = Integer.parseInt(sc.nextLine());
                System.out.println("Ha completado el Objetivo?");
                System.out.println("1. Si");
                System.out.println("2. No");
                opcion = Integer.parseInt(sc.nextLine());
                if(opcion ==1){
                    isObjetivo=true;
                    System.out.println("Introduzca el valore del objetivo: ");
                    valorObjetivo = Double.parseDouble(sc.nextLine());
                }else{
                    isObjetivo=false;
                    valorObjetivo=0;
                }


                e = new JefeProyecto(valorHora,cantAnyos,horasSemanales,isObjetivo,valorObjetivo);

                System.out.printf("Tu sueldo sería de: %.2f\n",e.calcularSueldo());

                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

        }while(opcion!=0);

        //System.out.println(e1.calcularSueldo());
        //System.out.println(e2.calcularSueldo());
        //System.out.println(e3.calcularSueldo());

        System.out.println("Gracias por utilizar el programa");
    }
}
