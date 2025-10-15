package ejercicio05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int numIntroducido;
        Scanner sc = new Scanner(System.in);
        int contadorDivisibles=0;
        System.out.println("Introduzca el número que quiere saber si es primo: ");
        numIntroducido = Integer.parseInt(sc.nextLine());

        for(int i = numIntroducido;i>0;i--){

            if(numIntroducido%i==0){
                contadorDivisibles++;
            }
        }

        if(contadorDivisibles>2){
            System.out.printf("El número %d no es primo ya que se puede dividir entre %d números.\n",numIntroducido,contadorDivisibles);
        }else{
            System.out.printf("El número %d  es primo ya que se puede dividir entre %d números.\n",numIntroducido,contadorDivisibles);
        }

    }
}
