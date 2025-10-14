package ejercicio03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        double precio;
        double descuento =10;
        double capDescuento=100;
        double base=100;
        double suma=0;
        Scanner sc = new Scanner(System.in);


        do{
            System.out.println("Introduzca el precio del producto: ");
            precio = Double.parseDouble(sc.nextLine());
            suma+=precio;

        }while(precio!=0);

        if(suma>capDescuento){
            suma-=suma*descuento/base;

        }
        System.out.printf("El precio de los productos es: %.2f€\n",suma);
    }
}
