package Interfaces.ejercicio01;

public class Principal {
    public static void main(String[] args) {

        Publicaciones l = new Libro("Alo",false,2002,50);

        Publicaciones l2 = new Libro("Bye",true,2020,5);

        Publicaciones r = new Revista("Ola",false,1942,10);

        Publicaciones r2 = new Revista("QQQQ",true,2025,1);


        Publicaciones[]lista = {l,l2,r,r2};

        Aplicacion a = new Aplicacion();


        System.out.println("Prestados");

        for (int i = 0; i < a.cuentaPrestados(lista).length; i++) {
            System.out.println(a.cuentaPrestados(lista)[i]);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Anteriores");

        for (int i = 0; i < a.cuentaPrestados(lista).length; i++) {
            System.out.println( a.publicaciones(lista,2019)[i]);
        }




    }
}
