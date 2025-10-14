package ejercicio10;

import java.util.List;

public abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularVolumen();
    public double calcularMediaArea(List<Figura>listaFiguras){
        double suma=0;
        for(Figura figura: listaFiguras){
            suma+= figura.calcularArea();
        }
        return suma/listaFiguras.size();
    }

}
