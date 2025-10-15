package HerenciaPolimorfismo.ejercicio05;

import java.util.Arrays;

public class Oficina {
    private Empleado[] lista;

    public Oficina(Empleado[] lista) {
        this.lista = lista;
    }

    public Empleado[] getLista() {
        return lista;
    }

    public void setLista(Empleado[] lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }

    public double calcularSueldo(Empleado e){
        return e.calcularSueldo();
    }

    public double calcularGastosSueldos(){
        double suma=0;
        for(int i=0;i< lista.length;i++){
            suma+=calcularSueldo(lista[i]);
        }

        return  suma;
    }
}
