package ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Crea una calculadora geométrica, es decir, un programa que tenga un menú para poder calcular áreas y
        //volúmenes de distintas figuras geométricas (al menos 4), pidiendo los datos necesarios.

        int opcion;
        Figura f;
        List<Figura>listaFiguras =  new ArrayList<>();

        Figura c =  new Cubo(1);
        Figura esfera =  new Esfera(10);
        Figura cono = new Cono(10,10);
        Figura cilindro = new Cilindro(10,10);

        listaFiguras.add(c);
        listaFiguras.add(esfera);
        listaFiguras.add(cono);
        listaFiguras.add(cilindro);

        double radio, altura, lado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        do {


            System.out.println("De qué figura geométrica quieres calcular el área y el volúmen: ");
            System.out.println("0. Salir");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Esfera");
            System.out.println("4. Cono");
            System.out.println("5. Calcular media áreas");
            System.out.println("Elige una");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 0:
                    System.out.printf("Saliendo");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.printf(".");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.printf(".");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.printf(".");

                    break;

                case 1:
                    System.out.println("Indica el valor del lado: ");
                    lado = Double.parseDouble(sc.nextLine());
                    f = new Cubo(lado);

                    //Podria usar el instaceof pero es redundante en mi opinion
                    ((Cubo) f).imprimirAreaCubo();
                    ((Cubo) f).imprimirVolumenCubo();

                    break;

                case 2:
                    System.out.println("Introduzca el valor del radio: ");
                    radio = Double.parseDouble(sc.nextLine());
                    System.out.println("Introduzca el valor de la altura: ");
                    altura = Double.parseDouble(sc.nextLine());
                    f = new Cilindro(altura, radio);

                    ((Cilindro) f).imprimirAreaCilindro();
                    ((Cilindro) f).imprimirVolumenCilindro();
                    break;
                case 3:
                    System.out.println("Introduzca el valor del radio: ");
                    radio = Double.parseDouble(sc.nextLine());
                    f = new Esfera(radio);
                    ((Esfera) f).imprimirAreaEsfera();
                    ((Esfera) f).imprimirVolumenEsfera();
                    break;

                case 4:
                    System.out.println("Introduzca el valor del radio: ");
                    radio = Double.parseDouble(sc.nextLine());
                    System.out.println("Introduzca el valor de la altura: ");
                    altura = Double.parseDouble(sc.nextLine());
                    f = new Cono(radio, altura);
                    ((Cono) f).imprimirAreaCono();
                    ((Cono) f).imprimirVolumenCono();
                    break;

                case 5:
                    System.out.printf("La media de las áreas es --> %.2f\n",c.calcularMediaArea(listaFiguras));
                    break;
                default:
                    System.out.println("Valor no válido");
                    System.out.println("Redirigiendo a selección de figura...");
                    break;
            }
        } while (opcion != 0);

        /*
        Figura c = new Cubo(10);
        Figura cilindro = new Cilindro(2,2);
        Figura e = new Esfera(2);
       //Figura cono = new Cono(2,10,12);

       if(c instanceof Cubo){
           ((Cubo) c).imprimirAreaCubo();
           ((Cubo) c).imprimirVolumenCubo();
       }

       if(cilindro instanceof Cilindro){
           ((Cilindro) cilindro).imprimirAreaCilindro();
           ((Cilindro) cilindro).imprimirVolumenCilindro();
       }
       if(e instanceof Esfera){
           ((Esfera) e).imprimirAreaEsfera();
           ((Esfera) e).imprimirVolumenEsfera();
       }

       if(cono instanceof Cono){
           ((Cono) cono).imprimirAreaCono();
           ((Cono) cono).imprimirVolumenCono();
       }        */
    }
}
