package ejercicio04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int dias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantos dias quedan");
        dias = Integer.parseInt(sc.nextLine());

        while(dias>0){
            System.out.printf("Quedan %d dias para Feria\n",dias);
            dias--;
        }
        System.out.println("¡Ya es FERIA!");


    }
}
