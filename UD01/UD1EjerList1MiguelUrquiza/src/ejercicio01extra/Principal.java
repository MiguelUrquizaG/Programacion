package ejercicio01extra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion=0;
        int id =0;
        double porcentaje=0;
        Scanner sc = new Scanner(System.in);
        Habitacion h = new Habitacion(10,true,"Miguel",2,1);
        Habitacion h1 = new Apartamento(10,true,"Juan Carlos",3,1,10);
        Habitacion h2 = new Suite(10,false,"Cristina",3,5,10,30);

       // h.imprimirFactura(10);
        // h1.imprimirFactura(1);
        //h2.imprimirFactura(10);

        Habitacion[]array = {h,h1,h2};

        GestionHabitaciones g = new GestionHabitaciones(array);


        System.out.println( g.calcularPrecioHab(0,10));

        System.out.println(g.calcularRecaudadoHabitacionesOcupadas(10));

        for(int i=0;i<g.buscarHabitacionesNoOcupadas().length;i++){

            if(g.buscarHabitacionesNoOcupadas()[i]!=null){
                System.out.println(g.buscarHabitacionesNoOcupadas()[i]);
            }

        }



        System.out.println("Bienvenido al programa para gestionar un hotel.");
        do{
            System.out.println("Seleccione una opción");
            System.out.println("0.Salir");
            System.out.println("1.Calcular precio Habitación");
            System.out.println("2.Calcular recaudado");
            System.out.println("3.Mostrar Factura.");
            System.out.println("4.Mostrar Habitaciones no ocupadas.");
            opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1:
                    for (int i=0;i<g.getArrayHabitaciones().length;i++){
                        System.out.printf("ID: %d ",i);
                        System.out.println(g.getArrayHabitaciones()[i]);
                    }
                    System.out.println("Indique la habitación a la que le quiere calcular el precio: ");
                    id=Integer.parseInt(sc.nextLine());
                    System.out.println("Indique Indique el descuento que le quiere aplicar a la habitación: ");
                    porcentaje = Double.parseDouble(sc.nextLine());
                    System.out.println(g.calcularPrecioHab(id,porcentaje));
                    break;
                case 2:
                    System.out.println(g.calcularRecaudadoHabitacionesOcupadas(10));
                    break;
                case 3:
                    for (int i=0;i<g.getArrayHabitaciones().length;i++){
                        System.out.printf("ID: %d ",i);
                        System.out.println(g.getArrayHabitaciones()[i]);
                    }
                    System.out.println("Indique la habitación de la cual quiere ver la factura: ");
                    id=Integer.parseInt(sc.nextLine());
                    System.out.println("Indique Indique el descuento que le quiere aplicar a la habitación: ");
                    porcentaje = Double.parseDouble(sc.nextLine());
                    g.imprimirFactura(id,porcentaje);
                    break;

                case 4:
                    for(int i=0;i<g.buscarHabitacionesNoOcupadas().length;i++){

                        if(g.buscarHabitacionesNoOcupadas()[i]!=null){
                            System.out.println(g.buscarHabitacionesNoOcupadas()[i]);
                        }

                    }
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }while(opcion!=0);


        System.out.println("Gracias por usar el programa.");

    }
}
