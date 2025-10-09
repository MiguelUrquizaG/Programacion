package ejercicio02Extra;

import java.util.Arrays;

public class Ventas {

    private Producto[] lista;


    public Ventas(Producto[] lista) {
        this.lista = lista;
    }

    public Producto[] getLista() {
        return lista;
    }

    public void setLista(Producto[] lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }

    public Producto[] buscarProductosVendidos(){
        Producto [] listaProductos =new Producto[lista.length-contarProductosSinVender()];
        int contador=0;
        for(int i =0;i< lista.length;i++){
            if(lista[i].isVendido()){
                listaProductos[contador]=lista[i];
                contador++;
            }
        }

        return listaProductos;
    }

    public int contarProductosSinVender(){
        int contadorProductos=0;
        for(Producto p : lista){
            if(!p.isVendido()){
                contadorProductos++;
            }
        }

        return contadorProductos;
    }


    public double calcularRecaudado(double porcentaje){
        double suma=0;
        Producto[] listaVendidos= buscarProductosVendidos();
        System.out.println("Prueba"+ listaVendidos[0]);

        for(Producto p: listaVendidos){
            suma+= p.calcularPVP(porcentaje);
        }

        return suma;
    }


    public double comprar(Producto p, double dineroIngresado,double porcentaje){
       double vuelta=0;
        p.setVendido(false);
        vuelta = mostrarCambio(p,dineroIngresado,porcentaje);

        return vuelta;
    }

    public double mostrarCambio(Producto p,double dineroIngresado,double porcentaje){

        return dineroIngresado- p.calcularPVP(porcentaje);

    }

    public void mostrarListadoProductos(){
        for(Producto p: lista){
            System.out.println(p);
        }
    }


}
