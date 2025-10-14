package ejercicio02Extra;

public class Principal {
    public static void main(String[] args) {

        Producto p1 =  new EspadaLaser(10,1,"Espada Epica",false,"doble");
        Producto p2 =  new Moviles(100,10,"Movil",true,"Iphone","12");

        Producto[]lista = {p1,p2} ;

        Ventas v = new Ventas(lista);


        System.out.println(v.contarProductosSinVender());
        System.out.println(v.calcularRecaudado(10));
        System.out.println(p2.calcularPVP(10));
        System.out.println(v.mostrarCambio(p2,3000,10));
        v.mostrarListadoProductos();
    }
}
