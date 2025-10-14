package ejercicio03Extra;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Mascota g = new Gato("Willy",1,10,false,"Negro",true);
        Mascota p = new Perro("Kappo",13,50,false,"Pinscher",false);

        Mascota [] m = {g,p};


        TiendaMascotas t = new TiendaMascotas(m);

        System.out.println(t.calcularRecaudadoVendidos(10));

        for(int i=0;i<t.buscarMascotasNoVendidas().length;i++){
            if(t.buscarMascotasNoVendidas()[i]!=null){
                System.out.println(t.buscarMascotasNoVendidas()[i]);
            }

        }


        System.out.println(t.calcularPrecioVenta("Willy",10));


        t.venderMascota("Willy");

    }
}
