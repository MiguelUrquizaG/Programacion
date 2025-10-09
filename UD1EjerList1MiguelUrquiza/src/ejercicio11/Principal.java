package ejercicio11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bienvenido al programa");
        int opcion;
        Scanner sc = new Scanner(System.in);
        Empleado e1 =  new Programador(12,3,40,3,5);
        Empleado e2 = new Analista(10,0,1,10);
        Empleado e3 = new JefeProyecto(100,12,5,true,50);
        System.out.println("Introduzca el tipo de empleado que es para calcular el sueldo: ");
        System.out.println("0. Salir");
        System.out.println("1. Programador");
        System.out.println("2. Analista");
        System.out.println("3. Jefe Proyecto");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {

        }


        System.out.println(e1.calcularSueldo());
        System.out.println(e2.calcularSueldo());
        System.out.println(e3.calcularSueldo());

        System.out.println("Gracias por utilizar el programa");
    }
}
