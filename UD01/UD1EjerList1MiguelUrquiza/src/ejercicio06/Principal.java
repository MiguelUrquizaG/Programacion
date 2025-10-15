package ejercicio06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Indique que desea hacer");
            System.out.println("0.Salir");
            System.out.println("1.Clasificador edad");
            opcion = Integer.parseInt(sc.nextLine());


            switch(opcion){

                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:

                    System.out.println("Indique su edad:");
                    edad = Integer.parseInt(sc.nextLine());

                    if(edad>0 && edad<3){
                        System.out.println("Eres un bebe");
                    } else if (edad>2 && edad<13) {
                        System.out.println("Eres un niño");
                    } else if (edad>12&&edad<18) {
                        System.out.println("Eres un adolescente");
                    }else if (edad>17&&edad<31) {
                        System.out.println("Eres un adolescente mayor de edad");
                    }else if (edad>29&&edad<60) {
                        System.out.println("Eres un adulto");
                    }else if (edad>59) {
                        System.out.println("Eres un anciano");
                    }


                    break;
            }


        }while(opcion!=0);

    }
}
