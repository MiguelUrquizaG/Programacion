package ejercicio08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Crea un prorama para gestionar los pagos de plataforma de tv. Decide que atributos, cómo se calculan los distintos precios, por ejemplo, con o sin anuncios, básico o con paquetes
        //extra como el fútbol, descuentos por contratar varias cosas. Intenta que sea lo mas completo posible.
        Scanner sc =  new Scanner(System.in);
        int opcion=0, contador=0;
        Plataforma p = new Plataforma(true,10,"Futflix",2);
        Gestion g = new Gestion(p,10,20,5,5,10);


        do {
            if(contador>0){
                System.out.println("¿Desea incorporar/eliminar algún paquete más?");
                System.out.println("0.No");
                System.out.println("1.Si");
                opcion = sc.nextInt();
            }
            if(contador ==0 || opcion!=0){
                System.out.println("Que paquete desea incorporar: ");
                System.out.println("0.Ninguno");
                System.out.println("1.Fútbol");
                System.out.println("2.Series");
                System.out.println("3.Películas");
                System.out.println("4.Pack Cinerie (Películas + Series)");
                System.out.println("5.Pack Full (Fútbol + Películas + Series)");
                opcion = sc.nextInt();

                //Aqui viene el switch
                switch(opcion){
                    case 1:
                        if(g.isFutbol()){
                            g.setFutbol(false);
                            System.out.println("Ha quitado su paquete de fútbol");
                        }else {
                            g.setFutbol(true);
                            System.out.println("Ha añadido su paquete de fútbol, este tiene un coste de: "+g.getCosteFutbol()+"€");

                        }
                        break;
                    case 2:
                        if(g.isSeries()){
                            g.setSeries(false);
                            System.out.println("Ha quitado su paquete de series");
                        }else {
                            g.setSeries(true);
                            System.out.println("Ha añadido su paquete de series, este tiene un coste de: "+g.getCosteSeries()+"€");

                        }
                        break;
                    case 3:
                        if(g.isPelis()){
                            g.setPelis(false);
                            System.out.println("Ha quitado su paquete de películas");
                        }else {
                            g.setPelis(true);
                            System.out.println("Ha añadido su paquete de películas, este tiene un coste de: "+g.getCostePelis()+"€");

                        }
                        break;
                    case 4:
                        if(!g.isSeries() || !g.isPelis()){
                            g.setPelis(true);
                            g.setSeries(true);
                            System.out.println("Ha contratado el pack Cinerie");

                        }else{
                            g.setPelis(false);
                            g.setSeries(false);
                            System.out.println("Ha retirado el pack Cinerie");
                        }
                        break;
                    case 5:
                        if(!g.isSeries() || !g.isPelis() || !g.isFutbol()){

                            g.setPelis(true);
                            g.setSeries(true);
                            g.setFutbol(true);
                            System.out.println("Ha contratado el pack Full");
                            System.out.println("Recibe un descuento del: " +g.getDescuentoPaquetes());
                        }else{
                            g.setPelis(false);
                            g.setSeries(false);
                            g.setFutbol(false);
                            System.out.println("Ha retirado el pack Full");
                        }
                        break;

                }

                contador++;
            }


        }while(opcion!=0);



        System.out.println(g.calcularPrecio());
        if(g.isPelis() && g.isSeries()&&!g.isFutbol()){
            System.out.println("Al tener pack Cinerie obtienes un descuento del: "+g.getDescuentoPaquetes()+"%");
        } else if (g.isPelis() && g.isSeries()&&g.isFutbol()) {
            System.out.println("Al tener pack Full obtienes un descuento del: "+g.getDescuentoPaquetes()+"%");
        }
    }
}
