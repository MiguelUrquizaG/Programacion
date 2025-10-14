package ejercicio01extra;

import ejercicio10.Cubo;

import java.util.Arrays;

public class GestionHabitaciones {

    private Habitacion[] arrayHabitaciones;

    public GestionHabitaciones(Habitacion[] arrayHabitaciones) {
        this.arrayHabitaciones = arrayHabitaciones;
    }

    public Habitacion[] getArrayHabitaciones() {
        return arrayHabitaciones;
    }

    public void setArrayHabitaciones(Habitacion[] arrayHabitaciones) {
        this.arrayHabitaciones = arrayHabitaciones;
    }

    @Override
    public String toString() {
        return "GestionHabitaciones{" +
                "arrayHabitaciones=" + Arrays.toString(arrayHabitaciones) +
                '}';
    }

    public Habitacion findHabitacion(int id){
        Habitacion h= new Habitacion();
        for(int i =0;i<arrayHabitaciones.length;i++) {
            if (i == id) {
                h = arrayHabitaciones[i];
            }
        }
        return h;
    }

    public Habitacion[] findHabitacionesOcupadas(){
        Habitacion[]ocupadas = new Habitacion[arrayHabitaciones.length];
        int contador =0;
        for(int i=0;i<arrayHabitaciones.length;i++){
            if(arrayHabitaciones[i].isOcupada()){
                ocupadas[contador]= arrayHabitaciones[i];
                contador++;
            }
        }

        return ocupadas;
    }

    public double calcularRecaudadoHabitacionesOcupadas(double porcentaje){

        Habitacion[]habitaciones = findHabitacionesOcupadas();

        double suma=0;
        for(int i =0;i<habitaciones.length;i++){
            if(habitaciones[i]!=null){
                suma+= habitaciones[i].calcularPrecioHab(porcentaje);
            }
        }

        return suma;

    }


    public void imprimirFactura (int id, double porcentaje){

        Habitacion h = findHabitacion(id);

        if(h instanceof Suite){
            ((Suite)h).imprimirFactura(porcentaje);
        } else if (h instanceof Apartamento) {

            ((Apartamento)h).imprimirFactura(porcentaje);

        }else {
            h.imprimirFactura(porcentaje);
        }

    }

    public Habitacion[] buscarHabitacionesNoOcupadas(){

        Habitacion[]noOcupadas = new Habitacion[arrayHabitaciones.length];
        int contador =0;
        for(int i=0;i<arrayHabitaciones.length;i++){
            if(!arrayHabitaciones[i].isOcupada()){
                noOcupadas[contador]= arrayHabitaciones[i];
                contador++;
            }
        }

        return noOcupadas;

    }

    public double calcularPrecioHab(int id ,double porcentaje){
        Habitacion h = findHabitacion(id);
        return h.calcularPrecioHab(porcentaje);
    }

}
