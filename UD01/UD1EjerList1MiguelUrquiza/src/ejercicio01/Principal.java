package ejercicio01;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {

        int password = 1234;
        Scanner sc =  new Scanner(System.in);
        int input;

        System.out.println("Introduzca la contraseña: ");
        input = sc.nextInt();


        for(int i = 0;i<2&&password!=input;i++){

            System.out.println("Vuelva a introducir la contraseña: ");
            input = sc.nextInt();

        }

        if(input!=password){
            System.out.println("Número de intentos máximos superados.");
        }else{
            System.out.println("Contraseña correcta!");
        }



    }
}
