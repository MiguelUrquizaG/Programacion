package ejercicio03Extra;

import java.util.Arrays;

public class TiendaMascotas {

    private Mascota[] arrayMascostas;

    public TiendaMascotas(Mascota[] arrayMascostas) {
        this.arrayMascostas = arrayMascostas;
    }

    public Mascota[] getArrayMascostas() {
        return arrayMascostas;
    }

    public void setArrayMascostas(Mascota[] arrayMascostas) {
        this.arrayMascostas = arrayMascostas;
    }

    @Override
    public String toString() {
        return "TiendaMascotas{" +
                "arrayMascostas=" + Arrays.toString(arrayMascostas) +
                '}';
    }

    public Mascota[] buscarMascotasVendidas(){
        Mascota[] m = new Mascota[arrayMascostas.length];
        int contador=0;
        for(int i =0;i<arrayMascostas.length;i++){
            if(arrayMascostas[i].isVendido()){
                m[contador]=arrayMascostas[i];
                contador++;
            }
        }


        return m;

    }

    public double calcularRecaudadoVendidos(double porcentaje){
        Mascota [] m =new Mascota[arrayMascostas.length];
        m = buscarMascotasVendidas();
        double suma=0;
        for(int i =0;i<m.length;i++){
            if(m[i] !=null){
                suma+=m[i].calcularPrecioVenta(porcentaje);
            }
        }

        return suma;

    }


    public Mascota[] buscarMascotasNoVendidas(){
        Mascota[] m = new Mascota[arrayMascostas.length];
        int contador=0;
        for(int i =0;i<arrayMascostas.length;i++){
            if(!arrayMascostas[i].isVendido()){
                m[contador]=arrayMascostas[i];
                contador++;
            }
        }


        return m;

    }

    public Mascota buscarMascotaNombre(String nombre){

        Mascota m = null;
        for(int i =0;i<arrayMascostas.length;i++){
            if(nombre.equalsIgnoreCase(arrayMascostas[i].getNombre())){

                m = arrayMascostas[i];

            }
        }

        return m;

    }

    public double calcularPrecioVenta(String nombre,double porcentaje){
        Mascota m = buscarMascotaNombre(nombre);
        return m.calcularPrecioVenta(porcentaje);
    }

    public void venderMascota(String nombre){
       Mascota m=  buscarMascotaNombre(nombre);

       if(m instanceof Gato){
           ((Gato)m).setVendido(true);
           ((Gato)m).vendido();

       }else{
           ((Perro)m).setVendido(true);
           ((Perro)m).vendido();
       }
    }


}
